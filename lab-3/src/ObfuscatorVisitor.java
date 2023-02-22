import gen.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

public class ObfuscatorVisitor extends obfuscationBaseVisitor<String> {
    Map<String, String> variableNames = new HashMap<>();

    private int binaryMask = 16;
    private int letterMask = 16;

    private String letterForDigit(int digit) {
        if (digit == 0) {
            return "O";
        }
        return digit == 1 ? "I" : "";
    }

    private String generateName() {
        // 2 ^ (n - 1) <= x < 2 ^ n
        // 2 ^ (n - 1) <= mask < 2 ^ n
        int length = 32 - Integer.numberOfLeadingZeros(binaryMask);
        StringBuilder result = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            int curr = 1 << i;
            int isLetter = (letterMask & curr) >> i;
            int digit = (binaryMask & curr) >> i;
            String character;
            if (isLetter == 0) {
                character = Integer.toString(digit);
            } else {
                character = letterForDigit(digit);
            }
            result.append(character);
        }
        letterMask++;
        if (letterMask == (1 << length)) {
            binaryMask++;
            if (binaryMask < (1 << length)) {
                letterMask = 1 << (length - 1);
            }
        }
        return result.toString();
    }

    @Override
    public String visitIdentifier(obfuscationParser.IdentifierContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String spaces = visitSpaces(ctx.spaces());
        if (ctx.parent instanceof obfuscationParser.VariableContext) {
            String newName;
            if (variableNames.containsKey(identifier)) {
                newName = variableNames.get(identifier);
            } else {
                newName = generateName();
                variableNames.put(identifier, newName);
            }
            return newName + spaces;
        }
        return identifier + spaces;
    }

//    @Override
//    public String visitFunction(obfuscationParser.FunctionContext ctx) {
//        return super.visitFunction(ctx);
//    }

    @Override
    public String visitStatements(obfuscationParser.StatementsContext ctx) {
        StringBuilder result = new StringBuilder();
        String name = generateName();
        String tab = "";
        boolean appendExtraStatement = true;
        if (ctx.parent instanceof obfuscationParser.IfStatementContext
                || ctx.parent instanceof obfuscationParser.ElseStatementContext) {
            tab = "    ";
            if (ctx.getChildCount() == 1) {
                appendExtraStatement = false;
            }
        }
        for (int i = 0; i < ctx.getChildCount(); i++) {
            result.append(visitChild(ctx.getChild(i)));
            if (!appendExtraStatement) {
                continue;
            }
            if (i == 0) {
                result.append("int ")
                        .append(name)
                        .append(" = ")
                        .append(0)
                        .append(";\n\t")
                        .append(i != ctx.getChildCount() - 1 ? tab : "");
                continue;
            }
            if (i % 2 == 0) {
                result.append(tab)
                        .append(name)
                        .append(" = ")
                        .append(name)
                        .append(" + ")
                        .append(i)
                        .append(";\n\t")
                        .append(i != ctx.getChildCount() - 1 ? tab : "");
            }
        }
        return result.toString();
    }

    private String visitChild(ParseTree child) {
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

        for(int i = 0; i < n; ++i) {
            ParseTree child = node.getChild(i);
            result.append(visitChild(child));
        }

        return result.toString();
    }
}
