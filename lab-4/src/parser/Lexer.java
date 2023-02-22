package parser;

import java.util.*;
import java.text.ParseException;

public class Lexer {

    List<TerminalRule> rules;

    String input;

    int pos = 0;

    public Lexer(String input) {
        this.input = input;
        this.rules = new ArrayList<>();
        this.rules.add(new TerminalRule("ADD", "\\+", false));
        this.rules.add(new TerminalRule("MUL", "\\*", false));
        this.rules.add(new TerminalRule("SUB", "\\-", false));
        this.rules.add(new TerminalRule("LOG", "//", false));
        this.rules.add(new TerminalRule("DIV", "/", false));
        this.rules.add(new TerminalRule("OPENPAREN", "\\(", false));
        this.rules.add(new TerminalRule("CLOSEPAREN", "\\)", false));
        this.rules.add(new TerminalRule("NUM", "[0-9|-]+", false));
        this.rules.add(new TerminalRule("SPACES", "[ \t\n]", true));
    }

    public Token nextToken() throws ParseException {
        for (TerminalRule rule : this.rules) {
            String current = rule.match(input);
            if (current.isEmpty())
                continue;
            pos += current.length();
            input = input.substring(current.length());
            if (rule.skip())
                return nextToken();
            return new Token(rule.getName(), current);
        }
        if (!input.isEmpty())
            throw new ParseException("Invalid input", pos);
        return new Token("$", "$");
    }
}
