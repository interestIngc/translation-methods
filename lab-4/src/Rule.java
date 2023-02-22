import java.util.*;

public class Rule {
    public final Map<NonTerminal, String> nonTerminalToArg = new HashMap<>();
    private final List<RuleItem> ruleItems;
    private String assignment;

    public Rule() {
        ruleItems = new ArrayList<>();
        assignment = null;
    }

    public static Set<String> findFirst(List<RuleItem> ruleItems) {
        HashSet<String> res = new HashSet<>();
        if (ruleItems.isEmpty()) {
            res.add("");
            return res;
        }
        for (RuleItem ruleItem: ruleItems) {
            if (ruleItem instanceof NonTerminal) {
                NonTerminal nonTerminal = (NonTerminal) ruleItem;
                res.addAll(nonTerminal.first);
                if (!nonTerminal.first.contains("")) {
                    return res;
                }
                res.remove("");
            } else {
                Terminal terminal = (Terminal) ruleItem;
                res.add(terminal.getText());
                return res;
            }
        }
        res.add("");
        return res;
    }

    public void addItem(RuleItem item) {
        ruleItems.add(item);
    }

    public List<RuleItem> getRuleItems() {
        return ruleItems;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public Set<String> getFirst() {
        return findFirst(this.ruleItems);
    }

    public boolean isEps() {
        return ruleItems.isEmpty();
    }
}
