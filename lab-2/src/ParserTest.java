import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void testAnalyser_or() throws ParseException {
        String input = "x | x";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));

        LexicalAnalyser analyser = new LexicalAnalyser(inputStream);

        analyser.nextToken();
        assertEquals(Token.Variable, analyser.getToken());

        analyser.nextToken();
        assertEquals(Token.Or, analyser.getToken());

        analyser.nextToken();
        assertEquals(Token.Variable, analyser.getToken());
    }

    @Test
    public void testAnalyser_eqv() throws ParseException {
        String input = "x == x";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));

        LexicalAnalyser analyser = new LexicalAnalyser(inputStream);

        analyser.nextToken();
        assertEquals(Token.Variable, analyser.getToken());

        analyser.nextToken();
        assertEquals(Token.Equivalence, analyser.getToken());

        analyser.nextToken();
        assertEquals(Token.Variable, analyser.getToken());
    }


    @Test
    public void testAnalyser_and() throws ParseException {
        String input = "x & x";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));

        LexicalAnalyser analyser = new LexicalAnalyser(inputStream);

        analyser.nextToken();
        assertEquals(Token.Variable, analyser.getToken());

        analyser.nextToken();
        assertEquals(Token.And, analyser.getToken());

        analyser.nextToken();
        assertEquals(Token.Variable, analyser.getToken());
    }

    @Test
    public void testAnalyser_xor() throws ParseException {
        String input = "x ^ x";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));

        LexicalAnalyser analyser = new LexicalAnalyser(inputStream);

        analyser.nextToken();
        assertEquals(Token.Variable, analyser.getToken());

        analyser.nextToken();
        assertEquals(Token.Xor, analyser.getToken());

        analyser.nextToken();
        assertEquals(Token.Variable, analyser.getToken());
    }

    @Test
    public void testAnalyser_not() throws ParseException {
        String input = "!x";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));

        LexicalAnalyser analyser = new LexicalAnalyser(inputStream);

        analyser.nextToken();
        assertEquals(Token.Not, analyser.getToken());

        analyser.nextToken();
        assertEquals(Token.Variable, analyser.getToken());
    }

    @Test
    public void testAnalyser_parentheses() throws ParseException {
        String input = "(x)";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));

        LexicalAnalyser analyser = new LexicalAnalyser(inputStream);

        analyser.nextToken();
        assertEquals(Token.OpenParenthesis, analyser.getToken());

        analyser.nextToken();
        assertEquals(Token.Variable, analyser.getToken());

        analyser.nextToken();
        assertEquals(Token.CloseParenthesis, analyser.getToken());
    }

    @Test
    public void testParser_priority() throws ParseException {
        String expr = " x | x & x";
        InputStream inputStream = new ByteArrayInputStream(expr.getBytes(StandardCharsets.UTF_8));

        Parser parser = new Parser();
        Tree node = parser.parse(inputStream);

        assertEquals("Expr", node.getNode());

        assertEquals(2, node.getChildren().size());
        Tree xor = node.getChildren().get(0);
        Tree exprPrime = node.getChildren().get(1);
        assertEquals("Xor", xor.getNode());
        assertEquals("ExprPrime", exprPrime.getNode());

        assertEquals(2, xor.getChildren().size());
        Tree xorAnd = xor.getChildren().get(0);
        Tree xorXorPrime = xor.getChildren().get(1);
        assertEquals("And", xorAnd.getNode());
        assertEquals("XorPrime", xorXorPrime.getNode());

        assertEquals(2, xorAnd.getChildren().size());
        Tree leftAndFactor = xorAnd.getChildren().get(0);
        Tree leftAndAndPrime = xorAnd.getChildren().get(1);
        assertEquals("Factor", leftAndFactor.getNode());
        assertEquals("AndPrime", leftAndAndPrime.getNode());

        assertEquals(1, leftAndFactor.getChildren().size());
        Tree leftAndFactorItem = leftAndFactor.getChildren().get(0);
        assertEquals("Item", leftAndFactorItem.getNode());

        assertEquals(1, leftAndFactorItem.getChildren().size());
        Tree leftAndFactorItemX = leftAndFactorItem.getChildren().get(0);
        assertEquals("x", leftAndFactorItemX.getNode());

        assertEquals(0, leftAndFactorItemX.getChildren().size());

        assertEquals(0, leftAndAndPrime.getChildren().size());

        assertEquals(0, xorXorPrime.getChildren().size());

        assertEquals(3, exprPrime.getChildren().size());
        Tree exprPrimeOr = exprPrime.getChildren().get(0);
        Tree exprPrimeXor = exprPrime.getChildren().get(1);
        Tree exprPrimeExprPrime = exprPrime.getChildren().get(2);
        assertEquals("|", exprPrimeOr.getNode());
        assertEquals("Xor", exprPrimeXor.getNode());
        assertEquals("ExprPrime", exprPrimeExprPrime.getNode());

        assertEquals(0, exprPrimeOr.getChildren().size());

        assertEquals(2, exprPrimeXor.getChildren().size());
        Tree exprPrimeXorAnd = exprPrimeXor.getChildren().get(0);
        Tree exprPrimeXorXorPrime = exprPrimeXor.getChildren().get(1);
        assertEquals("And", exprPrimeXorAnd.getNode());
        assertEquals("XorPrime", exprPrimeXorXorPrime.getNode());

        assertEquals(2, exprPrimeXorAnd.getChildren().size());
        Tree exprPrimeXorAndFactor = exprPrimeXorAnd.getChildren().get(0);
        Tree exprPrimeXorAndAndPrime = exprPrimeXorAnd.getChildren().get(1);
        assertEquals("Factor", exprPrimeXorAndFactor.getNode());
        assertEquals("AndPrime", exprPrimeXorAndAndPrime.getNode());

        assertEquals(1, exprPrimeXorAndFactor.getChildren().size());
        Tree exprPrimeXorAndFactorItem = exprPrimeXorAndFactor.getChildren().get(0);
        assertEquals("Item", exprPrimeXorAndFactorItem.getNode());

        assertEquals(1, exprPrimeXorAndFactorItem.getChildren().size());
        Tree exprPrimeXorAndFactorItemX = exprPrimeXorAndFactorItem.getChildren().get(0);
        assertEquals("x", exprPrimeXorAndFactorItemX.getNode());

        assertEquals(3, exprPrimeXorAndAndPrime.getChildren().size());
        Tree exprPrimeXorAndAndPrimeAnd = exprPrimeXorAndAndPrime.getChildren().get(0);
        Tree exprPrimeXorAndAndPrimeFactor = exprPrimeXorAndAndPrime.getChildren().get(1);
        Tree exprPrimeXorAndAndPrimeAndPrime = exprPrimeXorAndAndPrime.getChildren().get(2);
        assertEquals("&", exprPrimeXorAndAndPrimeAnd.getNode());
        assertEquals("Factor", exprPrimeXorAndAndPrimeFactor.getNode());
        assertEquals("AndPrime", exprPrimeXorAndAndPrimeAndPrime.getNode());

        assertEquals(0, exprPrimeXorAndAndPrimeAnd.getChildren().size());

        assertEquals(1, exprPrimeXorAndAndPrimeFactor.getChildren().size());
        Tree exprPrimeXorAndAndPrimeFactorItem = exprPrimeXorAndAndPrimeFactor.getChildren().get(0);
        assertEquals("Item", exprPrimeXorAndAndPrimeFactorItem.getNode());

        assertEquals(1, exprPrimeXorAndAndPrimeFactorItem.getChildren().size());
        Tree exprPrimeXorAndAndPrimeFactorItemX = exprPrimeXorAndAndPrimeFactorItem.getChildren().get(0);
        assertEquals("x", exprPrimeXorAndAndPrimeFactorItemX.getNode());

        assertEquals(0, exprPrimeXorAndAndPrimeAndPrime.getChildren().size());

        assertEquals(0, exprPrimeXorXorPrime.getChildren().size());

        assertEquals(0, exprPrimeExprPrime.getChildren().size());
    }

    @Test
    public void testParser_invalidExpr_unexpectedToken() {
        String expr = "x & x |";
        InputStream inputStream = new ByteArrayInputStream(expr.getBytes(StandardCharsets.UTF_8));

        Parser parser = new Parser();

        assertThrows(ParseException.class, () -> parser.parse(inputStream));
    }

    @Test
    public void testParser_invalidExpr_unexpectedChar() {
        String expr = "x & , x";
        InputStream inputStream = new ByteArrayInputStream(expr.getBytes(StandardCharsets.UTF_8));

        Parser parser = new Parser();

        assertThrows(ParseException.class, () -> parser.parse(inputStream));
    }
}
