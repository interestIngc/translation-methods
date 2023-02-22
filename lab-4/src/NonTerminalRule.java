import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NonTerminalRule {
    private final NonTerminal nonTerminal;
    private String argument;
    private String returnStatement = null;
    private final List<Rule> rules;

    public NonTerminalRule(NonTerminal nonTerminal) {
        this.nonTerminal = nonTerminal;
        this.argument = null;
        rules = new ArrayList<>();
    }

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public NonTerminal getNonTerminal() {
        return nonTerminal;
    }

    public String getArgument() {
        return argument;
    }

    public void setArgument(String argument) {
        this.argument = argument;
    }

    public String getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(String returnStatement) {
        this.returnStatement = returnStatement;
    }

    public List<Rule> getRules() {
        return Collections.unmodifiableList(rules);
    }

    public boolean containsEps() {
        for (Rule rule: rules) {
            if (rule.isEps()) {
                return true;
            }
        }
        return false;
    }
}
