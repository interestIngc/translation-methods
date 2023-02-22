import java.io.InputStream;
import java.text.ParseException;

public class Parser {
    private LexicalAnalyser lexicalAnalyser;

    public Tree parse(InputStream inputStream) throws ParseException {
        this.lexicalAnalyser = new LexicalAnalyser(inputStream);
        lexicalAnalyser.nextToken();
        return parseExpr();
    }

    private void throwParseTokenException() throws ParseException {
        throw new ParseException("Unexpected token", lexicalAnalyser.getPos());
    }

    private Tree parseExpr() throws ParseException {
        Tree node = new Tree("Expr");

        switch (lexicalAnalyser.getToken()) {
            case Not:
            case Variable:
            case OpenParenthesis:
                node.addChild(parseXor());
                node.addChild(parseExprPrime());
                break;
            default:
                throwParseTokenException();
        }
        return node;
    }

    private Tree parseExprPrime() throws ParseException {
        Tree node = new Tree("ExprPrime");

        switch (lexicalAnalyser.getToken()) {
            case Or:
                node.addChild(new Tree("|"));
                lexicalAnalyser.nextToken();

                node.addChild(parseXor());

                node.addChild(parseExprPrime());
                break;
            case LineEnd:
            case CloseParenthesis:
                break;
            default:
                throwParseTokenException();
        }

        return node;
    }

    private Tree parseXor() throws ParseException {
        Tree node = new Tree("Xor");

        switch (lexicalAnalyser.getToken()) {
            case Not:
            case Variable:
            case OpenParenthesis:
                node.addChild(parseAnd());
                node.addChild(parseXorPrime());
                break;
            default:
                throwParseTokenException();
        }

        return node;
    }

    private Tree parseXorPrime() throws ParseException {
        Tree node = new Tree("XorPrime");

        switch (lexicalAnalyser.getToken()) {
            case Xor:
                node.addChild(new Tree("^"));
                lexicalAnalyser.nextToken();

                node.addChild(parseAnd());

                node.addChild(parseXorPrime());
                break;
            case Or:
            case LineEnd:
            case CloseParenthesis:
                break;
            default:
                throwParseTokenException();
        }

        return node;
    }

    private Tree parseAnd() throws ParseException {
        Tree node = new Tree("And");

        switch (lexicalAnalyser.getToken()) {
            case Not:
            case Variable:
            case OpenParenthesis:
                node.addChild(parseEquivalence());
                node.addChild(parseAndPrime());
                break;
            default:
                throwParseTokenException();
        }

        return node;
    }

    private Tree parseAndPrime() throws ParseException {
        Tree node = new Tree("AndPrime");

        switch (lexicalAnalyser.getToken()) {
            case And:
                node.addChild(new Tree("&"));
                lexicalAnalyser.nextToken();

                node.addChild(parseEquivalence());

                node.addChild(parseAndPrime());
                break;
            case Xor:
            case Or:
            case LineEnd:
            case CloseParenthesis:
                break;
            default:
                throwParseTokenException();
        }

        return node;
    }

    private Tree parseEquivalence() throws ParseException {
        Tree node = new Tree("Equivalence");

        switch (lexicalAnalyser.getToken()) {
            case Not:
            case Variable:
            case OpenParenthesis:
                node.addChild(parseFactor());
                node.addChild(parseEquivalencePrime());
                break;
            default:
                throwParseTokenException();
        }
        return node;
    }

    private Tree parseEquivalencePrime() throws ParseException {
        Tree node = new Tree("Equivalence");

        switch (lexicalAnalyser.getToken()) {
            case Equivalence:
                node.addChild(new Tree("=="));
                lexicalAnalyser.nextToken();
                node.addChild(parseFactor());
                node.addChild(parseEquivalencePrime());
            case And:
            case Xor:
            case Or:
            case LineEnd:
            case CloseParenthesis:
                break;
            default:
                throwParseTokenException();
        }

        return node;
    }

    private Tree parseFactor() throws ParseException {
        Tree node = new Tree("Factor");

        switch (lexicalAnalyser.getToken()) {
            case Variable:
            case OpenParenthesis:
                node.addChild(parseItem());
                break;
            case Not:
                node.addChild(new Tree("!"));
                lexicalAnalyser.nextToken();

                node.addChild(parseItem());
                break;
            default:
                throwParseTokenException();
        }

        return node;
    }

    private Tree parseItem() throws ParseException {
        Tree node = new Tree("Item");

        switch (lexicalAnalyser.getToken()) {
            case Variable:
                node.addChild(new Tree("x"));
                lexicalAnalyser.nextToken();
                break;
            case OpenParenthesis:
                node.addChild(new Tree("("));
                lexicalAnalyser.nextToken();

                node.addChild(parseExpr());

                if (lexicalAnalyser.getToken() != Token.CloseParenthesis) {
                    throw new ParseException("expected ) at position ", lexicalAnalyser.getPos());
                }
                node.addChild(new Tree(")"));
                lexicalAnalyser.nextToken();
                break;
            default:
                throwParseTokenException();
        }

        return node;
    }
}
