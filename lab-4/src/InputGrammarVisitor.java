import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.stmt.*;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.Type;
import generated.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class InputGrammarVisitor extends InputGrammarBaseVisitor<String> {
    private final List<TerminalRule> terminalRules = new ArrayList<>();
    private final List<NonTerminalRule> nonTerminalRules = new ArrayList<>();
    private final Map<String, NonTerminal> nonTerminals = new HashMap<>();
    private final Map<String, Terminal> terminals = new HashMap<>();

    @Override
    public String visitFile(InputGrammarParser.FileContext ctx) {
        visitChildren(ctx);
        createOutputDirectory();
        copyUtilFiles();
        createLexer();
        findFirst();
        findFollow();
        createParser();
        return null;
    }

    @Override
    public String visitNonTerminalRule(InputGrammarParser.NonTerminalRuleContext ctx) {
        String nonTerminalName = ctx.nonTerminal().getText();

        if (!nonTerminals.containsKey(nonTerminalName)) {
            nonTerminals.put(nonTerminalName, new NonTerminal(nonTerminalName));
        }
        NonTerminalRule nonTerminalRule = new NonTerminalRule(nonTerminals.get(nonTerminalName));
        if (ctx.argument() != null) {
            nonTerminalRule.setArgument(this.visit(ctx.argument()));
        }
        if (ctx.returnsStatement() != null) {
            nonTerminalRule.setReturnStatement(this.visit(ctx.returnsStatement()));
        }

        for (InputGrammarParser.StatementContext statementContext: ctx.statement()) {
            Rule rule = new Rule();
            if (statementContext.children != null) {
                for (ParseTree child : statementContext.children) {
                    if (child instanceof InputGrammarParser.TerminalContext) {
                        if (!terminals.containsKey(child.getText())) {
                            terminals.put(child.getText(), new Terminal(child.getText()));
                        }
                        rule.addItem(terminals.get(child.getText()));
                    }
                    if (child instanceof InputGrammarParser.NonTerminalWithArgContext) {
                        InputGrammarParser.NonTerminalWithArgContext newChild =
                                (InputGrammarParser.NonTerminalWithArgContext) child;
                        String text = newChild.nonTerminal().getText();
                        if (!nonTerminals.containsKey(text)) {
                            nonTerminals.put(text, new NonTerminal(text));
                        }
                        NonTerminal current = nonTerminals.get(text);
                        rule.nonTerminalToArg.put(
                                current,
                                newChild.argument() == null
                                        ? null
                                        : this.visit(newChild.argument())
                        );
                        rule.addItem(current);
                    }
                    if (child instanceof InputGrammarParser.AssignmentContext) {
                        rule.setAssignment(this.visit(child));
                    }
                }
            }
            nonTerminalRule.addRule(rule);
        }

        nonTerminalRules.add(nonTerminalRule);
        return null;
    }

    @Override
    public String visitStatement(InputGrammarParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public String visitTerminalRule(InputGrammarParser.TerminalRuleContext ctx) {
        String name = this.visit(ctx.currName);
        String str;
        if (ctx.parsedString != null) {
            str = this.visit(ctx.string());
        } else {
            str = this.visit(ctx.parsedRegex);
        }
        TerminalRule terminalRule;
        if (ctx.parsedString != null) {
            terminalRule = new TerminalRule(name, escape(str), ctx.toSkip != null);
        } else {
            terminalRule = new TerminalRule(name, str, ctx.toSkip != null);
        }
        terminalRules.add(terminalRule);
        return ctx.getText();
    }

    @Override
    public String visitString(InputGrammarParser.StringContext ctx) {
        String text = ctx.getText();
        return text.substring(1, text.length() - 1);
    }

    @Override
    public String visitArgument(InputGrammarParser.ArgumentContext ctx) {
        String text = ctx.getText();
        return text.substring(1, text.length() - 1);
    }

    @Override
    public String visitAssignment(InputGrammarParser.AssignmentContext ctx) {
        String text = ctx.getText();
        return text.substring(1, text.length() - 1);
    }

    private String visitChild(ParseTree child) {
        if (child == null) {
            return "";
        }
        if (child instanceof TerminalNode) {
            return child.getText();
        } else {
            return child.accept(this);
        }
    }

    @Override
    public String visitChildren(RuleNode node) {
        StringBuilder result = new StringBuilder();
        int n = node.getChildCount();

        for (int i = 0; i < n; ++i) {
            ParseTree child = node.getChild(i);
            result.append(visitChild(child));
        }

        return result.toString();
    }

    private void findFirst() {
        for (NonTerminalRule nonTerminalRule: nonTerminalRules) {
            if (nonTerminalRule.containsEps()) {
                nonTerminalRule.getNonTerminal().first.add("");
            }
        }

        boolean changed = true;
        while (changed) {
            changed = false;
            for (NonTerminalRule nonTerminalRule: nonTerminalRules) {
                for (Rule rule: nonTerminalRule.getRules()) {
                    if (nonTerminalRule.getNonTerminal().first.addAll(rule.getFirst())) {
                        changed = true;
                    }
                }
            }
        }
    }

    private void findFollow() {
        NonTerminal start = nonTerminalRules.get(0).getNonTerminal();
        start.follow.add("$");

        boolean changed = true;
        while (changed) {
            changed = false;
            for (NonTerminalRule nonTerminalRule: nonTerminalRules) {
                for (Rule rule: nonTerminalRule.getRules()) {
                    int length = rule.getRuleItems().size();
                    for (int i = 0; i < length; i++) {
                        RuleItem ruleItem = rule.getRuleItems().get(i);
                        if (ruleItem instanceof Terminal) {
                            continue;
                        }
                        List<RuleItem> slice = rule.getRuleItems().subList(i + 1, length);
                        NonTerminal nonTerminal = (NonTerminal) ruleItem;
                        int size = nonTerminal.follow.size();
                        nonTerminal.follow.addAll(Rule.findFirst(slice));
                        if (nonTerminal.follow.contains("")) {
                            nonTerminal.follow.remove("");
                            nonTerminal.follow.addAll(nonTerminalRule.getNonTerminal().follow);
                        }
                        if (nonTerminal.follow.size() > size) {
                            changed = true;
                        }
                    }
                }
            }
        }
    }

    private void createOutputDirectory() {
        Path output = Path.of("src/parser");
        if (!Files.exists(output)) {
            try {
                Files.createDirectory(output);
            } catch (IOException e) {
                System.err.println("Error while creating output directory occurred " + e.getMessage());
            }
        }
    }

    private void copyUtilFiles() {
        copyUtilFile("Token");
        copyUtilFile("Tree");
        copyUtilFile("TerminalRule");
    }

    private void copyUtilFile(String className) {
        File source = new File("src/utils/" + className + ".txt");
        Path target = Path.of("src/parser", className + ".java");
        try {
            InputStream inputStream = new FileInputStream(source);
            Files.copy(inputStream, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (FileNotFoundException e) {
            System.err.println("File " + className + ".txt not found " + e.getMessage());
        } catch (IOException e) {
            System.err.println(
                    "Error while writing input stream to file"
                            + className
                            + ".java occurred "
                            + e.getMessage()
            );
        }
    }

    private void createParser() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration("parser");
        compilationUnit.addImport("java.text.ParseException");
        compilationUnit.addImport("java.util.Objects");
        ClassOrInterfaceDeclaration parserClass =
                compilationUnit
                        .addClass("Parser")
                        .setPublic(true);
        addField(parserClass, "token", "Token");
        addField(parserClass, "lexer", "Lexer");
        parserClass
                .addConstructor(Modifier.Keyword.PUBLIC)
                .addParameter("String", "input")
                .setBody(new BlockStmt()
                        .addStatement("this.lexer = new Lexer(input);")
                        .addStatement("this.token = this.lexer.nextToken();")
                )
                .setThrownExceptions(
                        new NodeList<>(
                                new ClassOrInterfaceType(null, "ParseException")
                        )
                );
        for (NonTerminalRule nonTerminalRule: nonTerminalRules) {
            MethodDeclaration method = parserClass.addMethod(
                    nonTerminalRule.getNonTerminal().getName(),
                    Modifier.Keyword.PUBLIC);
            method.setType(new ClassOrInterfaceType(null, "Tree"));
            NodeList<Parameter> args;
            if (nonTerminalRule.getArgument() != null) {
                Pattern pattern = Pattern.compile(" ");
                String[] split = pattern.split(nonTerminalRule.getArgument());
                args = new NodeList<>(
                        new Parameter(
                                new ClassOrInterfaceType(null, split[0]),
                                split[1]));
            } else {
                args = new NodeList<>();
            }
            method.setParameters(args);
            method.setThrownExceptions(
                    new NodeList<>(
                            new ClassOrInterfaceType(null, "ParseException")
                    ));
            ClassOrInterfaceType treeType = new ClassOrInterfaceType(null,"Tree");
            BlockStmt body = new BlockStmt();
            body.addStatement(new AssignExpr(
                    new VariableDeclarationExpr(
                            treeType,
                            "res"),
                    new ObjectCreationExpr(
                            null,
                            treeType,
                            new NodeList<>(new StringLiteralExpr(nonTerminalRule.getNonTerminal().getName()))
                    ),
                    AssignExpr.Operator.ASSIGN));
            ThrowStmt throwStmt = new ThrowStmt(
                    createObject(
                            "ParseException",
                            new StringLiteralExpr("Unexpected token"),
                            new NameExpr("lexer.pos")
                    )
            );
            SwitchStmt switchStmt = new SwitchStmt();
            NodeList<SwitchEntry> switchEntries = new NodeList<>();
            for (Rule rule : nonTerminalRule.getRules()) {
                Set<String> first = rule.getFirst();
                if (first.contains("")) {
                    first.remove("");
                    first.addAll(nonTerminalRule.getNonTerminal().follow);
                }
                List<SwitchEntry> currentEntries = first.stream().map(token ->
                        new SwitchEntry(
                                new NodeList<>(new StringLiteralExpr(token)),
                                SwitchEntry.Type.STATEMENT_GROUP,
                                new NodeList<>())).collect(Collectors.toList());
                NodeList<Statement> statements = new NodeList<>();
                for (RuleItem ruleItem: rule.getRuleItems()) {
                    if (ruleItem instanceof Terminal) {
                        Terminal terminal = (Terminal) ruleItem;
                        statements.add(new IfStmt(
                                new UnaryExpr(
                                        new MethodCallExpr(
                                                new NameExpr("Objects"),
                                                "equals",
                                                new NodeList<>(
                                                        new NameExpr("token.name"),
                                                        new StringLiteralExpr(terminal.getText())
                                                )
                                        ),
                                        UnaryExpr.Operator.LOGICAL_COMPLEMENT
                                ),
                                throwStmt,
                                null
                        ));
                        statements.add(new ExpressionStmt(
                                new MethodCallExpr(
                                        new NameExpr("res"),
                                        "addChild",
                                        new NodeList<>(
                                                createObject(
                                                        "Tree",
                                                        new NameExpr("token.name"),
                                                        new NameExpr("token.text")
                                                )
                                        )
                                )));
                        statements.add(new ExpressionStmt(
                                new AssignExpr(
                                    new NameExpr("token"),
                                    new MethodCallExpr(
                                            new NameExpr("lexer"),
                                            "nextToken"
                                    ),
                                    AssignExpr.Operator.ASSIGN
                                )
                        ));
                    } else {
                        NonTerminal nonTerminal = (NonTerminal) ruleItem;
                        MethodCallExpr methodCallExpr = new MethodCallExpr(null, nonTerminal.getName());
                        String argument = rule.nonTerminalToArg.get(nonTerminal);
                        if (argument != null) {
                            methodCallExpr.addArgument(argument);
                        }
                        statements.add(new ExpressionStmt(
                                new MethodCallExpr(
                                        new NameExpr("res"),
                                        "addChild",
                                        new NodeList<>(methodCallExpr)
                                )
                        ));
                    }
                }
                if (nonTerminalRule.getReturnStatement() != null) {
                    statements.add(new ExpressionStmt().setExpression(rule.getAssignment()));
                }
                statements.add(new BreakStmt());
                currentEntries.get(currentEntries.size() - 1).setStatements(statements);
                switchEntries.addAll(currentEntries);
            }
            switchEntries.add(
                    new SwitchEntry(
                            new NodeList<>(),
                            SwitchEntry.Type.STATEMENT_GROUP,
                            new NodeList<>(throwStmt)
                    )
            );
            switchStmt.setSelector(new NameExpr("token.name"));
            switchStmt.setEntries(switchEntries);
            body.addStatement(switchStmt);
            body.addStatement("return res;");
            method.setBody(body);
        }
        write("Parser", compilationUnit);
    }

    private ObjectCreationExpr createObject(String className, Expression... args) {
        return new ObjectCreationExpr(
                null,
                new ClassOrInterfaceType(
                        null,
                        new SimpleName(className),
                        null
                ),
                new NodeList<>(args)
        );
    }

    private void createLexer() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration("parser");
        compilationUnit.addImport("java.util.*");
        compilationUnit.addImport("java.text.ParseException");
        ClassOrInterfaceDeclaration lexerClass =
                compilationUnit
                    .addClass("Lexer")
                    .setPublic(true);
        Type terminalRuleType = new ClassOrInterfaceType(null, "TerminalRule");
        addField(lexerClass, "rules", "List", terminalRuleType);
        addField(lexerClass, "input", "String");
        lexerClass.addFieldWithInitializer("int", "pos", new NameExpr("0"));
        BlockStmt body = new BlockStmt()
                .addStatement(new ExpressionStmt(new AssignExpr(
                        new FieldAccessExpr(new ThisExpr(), "input"),
                        new NameExpr("input"),
                        AssignExpr.Operator.ASSIGN
                )))
                .addStatement(new ExpressionStmt(new AssignExpr(
                        new FieldAccessExpr(new ThisExpr(), "rules"),
                        new ObjectCreationExpr(
                                null,
                                new ClassOrInterfaceType(
                                        null,
                                        new SimpleName("ArrayList"),
                                        new NodeList<>()
                                ),
                                new NodeList<>()
                        ),
                        AssignExpr.Operator.ASSIGN
                )));
        for (TerminalRule rule : terminalRules) {
            body.addStatement(new ExpressionStmt(new MethodCallExpr(
                    new FieldAccessExpr(new ThisExpr(), "rules"),
                    "add",
                    new NodeList<>(new ObjectCreationExpr(
                            null,
                            new ClassOrInterfaceType(
                                    null,
                                    new SimpleName("TerminalRule"),
                                    null),
                            new NodeList<>(
                                    new StringLiteralExpr(rule.getName()),
                                    new StringLiteralExpr(rule.getRegex()),
                                    new BooleanLiteralExpr(rule.skip()))
                    ))
            )));
        }
        lexerClass.addConstructor(Modifier.Keyword.PUBLIC)
                .addParameter("String", "input")
                .setBody(body);
        MethodDeclaration nextToken = lexerClass.addMethod("nextToken", Modifier.Keyword.PUBLIC);
        nextToken.setThrownExceptions(
                new NodeList<>(
                        new ClassOrInterfaceType(null, "ParseException")
                )
        );
        nextToken.setType("Token")
                .setBody(new BlockStmt()
                        .addStatement(new ForEachStmt(
                                new VariableDeclarationExpr(terminalRuleType, "rule"),
                                new FieldAccessExpr(new ThisExpr(), "rules"),
                                new BlockStmt()
                                        .addStatement(new AssignExpr(
                                                new VariableDeclarationExpr(
                                                        new ClassOrInterfaceType(null, "String"),
                                                        "current"
                                                ),
                                                new MethodCallExpr(
                                                        new NameExpr("rule"),
                                                        "match",
                                                        new NodeList<>(new NameExpr("input"))
                                                ),
                                                AssignExpr.Operator.ASSIGN
                                        ))
                                        .addStatement(new IfStmt(
                                                new MethodCallExpr(
                                                        new NameExpr("current"),
                                                        "isEmpty",
                                                        new NodeList<>()
                                                ),
                                                new ContinueStmt(),
                                                null
                                        ))
                                        .addStatement("pos += current.length();")
                                        .addStatement("input = input.substring(current.length());")
                                        .addStatement(new IfStmt(
                                                new MethodCallExpr(
                                                        new NameExpr("rule"),
                                                        "skip",
                                                        new NodeList<>()),
                                                new ReturnStmt(new MethodCallExpr(
                                                        null,
                                                        "nextToken",
                                                        new NodeList<>()
                                                        )),
                                                null
                                        ))
                                        .addStatement("return new Token(rule.getName(), current);")
                                )
                        )
                        .addStatement(
                                new IfStmt(
                                        new UnaryExpr(
                                                new MethodCallExpr(
                                                        new NameExpr("input"),
                                                        "isEmpty",
                                                        new NodeList<>()
                                                ),
                                                UnaryExpr.Operator.LOGICAL_COMPLEMENT
                                        ),
                                        new ThrowStmt(
                                                createObject(
                                                        "ParseException",
                                                        new StringLiteralExpr("Invalid input"),
                                                        new NameExpr("pos")
                                                )
                                        ),
                                        null
                                )
                        )
                        .addStatement("return new Token(\"$\", \"$\");")
                );
        write("Lexer", compilationUnit);
    }

    private void addField(ClassOrInterfaceDeclaration currClass, String name, String typeName, Type... typeArgs) {
        NodeList<Type> typeArgsList;

        if (typeArgs.length == 0) {
            typeArgsList = null;
        } else {
            typeArgsList = new NodeList<>(typeArgs);
        }

        currClass.addField(
                new ClassOrInterfaceType(
                        null,
                        new SimpleName(typeName),
                        typeArgsList),
                name);
    }

    private String escape(String string) {
        if (string == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character ch : string.toCharArray()) {
            String curr;
            switch (ch) {
                case '<':
                    curr = "\\\\<";
                    break;
                case '>':
                    curr = "\\\\>";
                    break;
                case '(':
                    curr = "\\\\(";
                    break;
                case ')':
                    curr = "\\\\)";
                    break;
                case '^':
                    curr = "\\\\^";
                    break;
                case '-':
                    curr = "\\\\-";
                    break;
                case '=':
                    curr = "\\\\=";
                    break;
                case '$':
                    curr = "\\\\$";
                    break;
                case '!':
                    curr = "\\\\!";
                    break;
                case '|':
                    curr = "\\\\|";
                    break;
                case '?':
                    curr = "\\\\?";
                    break;
                case '*':
                    curr = "\\\\*";
                    break;
                case '+':
                    curr = "\\\\+";
                    break;
                case '.':
                    curr = "\\\\.";
                    break;
                default:
                    curr = Character.toString(ch);
            }
            stringBuilder.append(curr);
        }
        return stringBuilder.toString();
    }

    private void write(String className, CompilationUnit compilationUnit) {
        try {
            Files.write(
                    new File("src/parser/" + className + ".java").toPath(),
                    compilationUnit.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.err.println("Error while writing class to file occurred " + e.getMessage());
        }
    }
}
