package parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TerminalRule {
    private final String name;
    private final Pattern pattern;
    private final boolean skip;

    public TerminalRule(String name, String regex, boolean skip) {
        this.name = name;
        this.pattern = Pattern.compile("^" + regex);
        this.skip = skip;
    }

    public String getName() {
        return name;
    }

    public String match(String input) {
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            int end = matcher.end();
            return input.substring(0, end);
        }
        return "";
    }

    public boolean skip() {
        return skip;
    }
}