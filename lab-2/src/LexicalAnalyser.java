import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

public class LexicalAnalyser {
    private final InputStream inputStream;
    private int currChar;
    private int currPos = 0;
    private Token currToken;

    public LexicalAnalyser(InputStream inputStream) throws ParseException {
        this.inputStream = inputStream;
    }

    private void skipWhitespace() throws ParseException {
        while (Character.isWhitespace(currChar)) {
            nextChar();
        }
    }

    private void nextChar() throws ParseException {
        currPos++;

        try {
            currChar = inputStream.read();
        } catch (IOException e) {
            throw new ParseException(e.getMessage(), currPos);
        }
    }

    public void nextToken() throws ParseException {
        nextChar();
        skipWhitespace();

        switch (currChar) {
            case '(':
                currToken = Token.OpenParenthesis;
                break;
            case ')':
                currToken = Token.CloseParenthesis;
                break;
            case '!':
                currToken = Token.Not;
                break;
            case '&':
                currToken = Token.And;
                break;
            case '^':
                currToken = Token.Xor;
                break;
            case '|':
                currToken = Token.Or;
                break;
            case '=':
                nextChar();
                if (currChar == '=') {
                    currToken = Token.Equivalence;
                    skipWhitespace();
                    break;
                } else {
                    throw new ParseException("Unexpected char " + (char) currChar, currPos);
                }
            case -1:
                currToken = Token.LineEnd;
                break;
            default:
                char ch = (char) currChar;
                if (ch >= 'a' && ch <= 'z') {
                    currToken = Token.Variable;
                } else {
                    throw new ParseException("Unexpected char " + ch, currPos);
                }
        }
    }

    public Token getToken() {
        return this.currToken;
    }

    public int getPos() {
        return this.currPos;
    }
}
