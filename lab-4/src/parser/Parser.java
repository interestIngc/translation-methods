package parser;

import java.text.ParseException;
import java.util.Objects;

public class Parser {

    Token token;

    Lexer lexer;

    public Parser(String input) throws ParseException {
        this.lexer = new Lexer(input);
        this.token = this.lexer.nextToken();
    }

    public Tree expr() throws ParseException {
        Tree res = new Tree("expr");
        switch(token.name) {
            case "SUB":
            case "NUM":
            case "OPENPAREN":
                res.addChild(term());
                res.addChild(exprP(res.getChild(0).val));
                res.val = res.getChild(1).val;
                break;
            default:
                throw new ParseException("Unexpected token", lexer.pos);
        }
        return res;
    }

    public Tree exprP(double acc) throws ParseException {
        Tree res = new Tree("exprP");
        switch(token.name) {
            case "CLOSEPAREN":
            case "$":
                res.val = acc;
                break;
            case "ADD":
                if (!Objects.equals(token.name, "ADD"))
                    throw new ParseException("Unexpected token", lexer.pos);
                res.addChild(new Tree(token.name, token.text));
                token = lexer.nextToken();
                res.addChild(term());
                res.addChild(exprP(acc + res.getChild(1).val));
                res.val = res.getChild(2).val;
                break;
            case "SUB":
                if (!Objects.equals(token.name, "SUB"))
                    throw new ParseException("Unexpected token", lexer.pos);
                res.addChild(new Tree(token.name, token.text));
                token = lexer.nextToken();
                res.addChild(term());
                res.addChild(exprP(acc - res.getChild(1).val));
                res.val = res.getChild(2).val;
                break;
            default:
                throw new ParseException("Unexpected token", lexer.pos);
        }
        return res;
    }

    public Tree term() throws ParseException {
        Tree res = new Tree("term");
        switch(token.name) {
            case "SUB":
            case "NUM":
            case "OPENPAREN":
                res.addChild(factorLog());
                res.addChild(termP(res.getChild(0).val));
                res.val = res.getChild(1).val;
                break;
            default:
                throw new ParseException("Unexpected token", lexer.pos);
        }
        return res;
    }

    public Tree termP(double acc) throws ParseException {
        Tree res = new Tree("termP");
        switch(token.name) {
            case "ADD":
            case "SUB":
            case "CLOSEPAREN":
            case "$":
                res.val = acc;
                break;
            case "MUL":
                if (!Objects.equals(token.name, "MUL"))
                    throw new ParseException("Unexpected token", lexer.pos);
                res.addChild(new Tree(token.name, token.text));
                token = lexer.nextToken();
                res.addChild(factorLog());
                res.addChild(termP(acc * res.getChild(1).val));
                res.val = res.getChild(2).val;
                break;
            case "DIV":
                if (!Objects.equals(token.name, "DIV"))
                    throw new ParseException("Unexpected token", lexer.pos);
                res.addChild(new Tree(token.name, token.text));
                token = lexer.nextToken();
                res.addChild(factorLog());
                res.addChild(termP(acc / res.getChild(1).val));
                res.val = res.getChild(2).val;
                break;
            default:
                throw new ParseException("Unexpected token", lexer.pos);
        }
        return res;
    }

    public Tree factorLog() throws ParseException {
        Tree res = new Tree("factorLog");
        switch(token.name) {
            case "SUB":
            case "NUM":
            case "OPENPAREN":
                res.addChild(factor());
                res.addChild(factorLogP(res.getChild(0).val));
                res.val = res.getChild(1).val;
                break;
            default:
                throw new ParseException("Unexpected token", lexer.pos);
        }
        return res;
    }

    public Tree factorLogP(double acc) throws ParseException {
        Tree res = new Tree("factorLogP");
        switch(token.name) {
            case "DIV":
            case "ADD":
            case "SUB":
            case "CLOSEPAREN":
            case "$":
            case "MUL":
                res.val = acc;
                break;
            case "LOG":
                if (!Objects.equals(token.name, "LOG"))
                    throw new ParseException("Unexpected token", lexer.pos);
                res.addChild(new Tree(token.name, token.text));
                token = lexer.nextToken();
                res.addChild(factor());
                res.addChild(factorLogP(res.getChild(1).val));
                res.val = Math.log(acc) / Math.log(res.getChild(2).val);
                break;
            default:
                throw new ParseException("Unexpected token", lexer.pos);
        }
        return res;
    }

    public Tree factor() throws ParseException {
        Tree res = new Tree("factor");
        switch(token.name) {
            case "OPENPAREN":
                if (!Objects.equals(token.name, "OPENPAREN"))
                    throw new ParseException("Unexpected token", lexer.pos);
                res.addChild(new Tree(token.name, token.text));
                token = lexer.nextToken();
                res.addChild(expr());
                if (!Objects.equals(token.name, "CLOSEPAREN"))
                    throw new ParseException("Unexpected token", lexer.pos);
                res.addChild(new Tree(token.name, token.text));
                token = lexer.nextToken();
                res.val = res.getChild(1).val;
                break;
            case "SUB":
            case "NUM":
                res.addChild(number());
                res.val = res.getChild(0).val;
                break;
            default:
                throw new ParseException("Unexpected token", lexer.pos);
        }
        return res;
    }

    public Tree number() throws ParseException {
        Tree res = new Tree("number");
        switch(token.name) {
            case "NUM":
                if (!Objects.equals(token.name, "NUM"))
                    throw new ParseException("Unexpected token", lexer.pos);
                res.addChild(new Tree(token.name, token.text));
                token = lexer.nextToken();
                res.val = Double.parseDouble(res.getChild(0).getText());
                break;
            case "SUB":
                if (!Objects.equals(token.name, "SUB"))
                    throw new ParseException("Unexpected token", lexer.pos);
                res.addChild(new Tree(token.name, token.text));
                token = lexer.nextToken();
                if (!Objects.equals(token.name, "NUM"))
                    throw new ParseException("Unexpected token", lexer.pos);
                res.addChild(new Tree(token.name, token.text));
                token = lexer.nextToken();
                res.val = -Double.parseDouble(res.getChild(1).getText());
                break;
            default:
                throw new ParseException("Unexpected token", lexer.pos);
        }
        return res;
    }
}
