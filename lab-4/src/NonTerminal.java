import java.util.*;

public class NonTerminal extends RuleItem {
    public final Set<String> first = new HashSet<>();
    public final Set<String> follow = new HashSet<>();

    private final String name;

    public NonTerminal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
