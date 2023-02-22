public class TerminalRule {
    private final String name;
    private final String regex;
    private final boolean skip;

    public TerminalRule(String name, String regex, boolean skip) {
        this.name = name;
        this.regex = regex;
        this.skip = skip;
    }

    public String getName() {
        return name;
    }

    public String getRegex() {
        return regex;
    }

    public boolean skip() {
        return skip;
    }
}
