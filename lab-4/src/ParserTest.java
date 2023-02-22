//import org.junit.Test;
//
//import java.text.ParseException;
//import parser.*;
//
//import static org.junit.Assert.*;
//
//public class ParserTest {
//
//    @Test
//    public void testAnalyser_or() throws ParseException {
//        String input = "x | x";
//
//        Lexer analyser = new Lexer(input);
//
//        assertEquals("VARIABLE", analyser.nextToken().name);
//
//        assertEquals("OR", analyser.nextToken().name);
//
//        assertEquals("VARIABLE", analyser.nextToken().name);
//    }
//
//    @Test
//    public void testAnalyser_and() throws ParseException {
//        String input = "x & x";
//
//        Lexer analyser = new Lexer(input);
//
//        assertEquals("VARIABLE", analyser.nextToken().name);
//
//        assertEquals("AND", analyser.nextToken().name);
//
//        assertEquals("VARIABLE", analyser.nextToken().name);
//    }
//
//    @Test
//    public void testAnalyser_xor() throws ParseException {
//        String input = "x ^ x";
//
//        Lexer analyser = new Lexer(input);
//
//        assertEquals("VARIABLE", analyser.nextToken().name);
//
//        assertEquals("XOR", analyser.nextToken().name);
//
//        assertEquals("VARIABLE", analyser.nextToken().name);
//    }
//
//    @Test
//    public void testAnalyser_not() throws ParseException {
//        String input = "!x";
//
//        Lexer analyser = new Lexer(input);
//
//        assertEquals("NOT", analyser.nextToken().name);
//
//        assertEquals("VARIABLE", analyser.nextToken().name);
//    }
//
//    @Test
//    public void testAnalyser_parentheses() throws ParseException {
//        String input = "(x)";
//
//        Lexer analyser = new Lexer(input);
//
//        assertEquals("OPENPAREN", analyser.nextToken().name);
//
//        assertEquals("VARIABLE", analyser.nextToken().name);
//
//        assertEquals("CLOSEPAREN", analyser.nextToken().name);
//    }
//
//    @Test
//    public void testParser_priority() throws ParseException {
//        String expr = " x | x & x";
//
//        Parser parser = new Parser(expr);
//        Tree node = parser.expr();
//
//        assertEquals("expr", node.getName());
//
//        assertEquals(2, node.getChildren().size());
//        Tree xor = node.getChildren().get(0);
//        Tree exprPrime = node.getChildren().get(1);
//        assertEquals("xor", xor.getName());
//        assertEquals("exprPrime", exprPrime.getName());
//
//        assertEquals(2, xor.getChildren().size());
//        Tree xorAnd = xor.getChildren().get(0);
//        Tree xorXorPrime = xor.getChildren().get(1);
//        assertEquals("and", xorAnd.getName());
//        assertEquals("xorPrime", xorXorPrime.getName());
//
//        assertEquals(2, xorAnd.getChildren().size());
//        Tree leftAndFactor = xorAnd.getChildren().get(0);
//        Tree leftAndAndPrime = xorAnd.getChildren().get(1);
//        assertEquals("factor", leftAndFactor.getName());
//        assertEquals("andPrime", leftAndAndPrime.getName());
//
//        assertEquals(1, leftAndFactor.getChildren().size());
//        Tree leftAndFactorItem = leftAndFactor.getChildren().get(0);
//        assertEquals("item", leftAndFactorItem.getName());
//
//        assertEquals(1, leftAndFactorItem.getChildren().size());
//        Tree leftAndFactorItemX = leftAndFactorItem.getChildren().get(0);
//        assertEquals("VARIABLE", leftAndFactorItemX.getName());
//
//        assertEquals(0, leftAndFactorItemX.getChildren().size());
//
//        assertEquals(0, leftAndAndPrime.getChildren().size());
//
//        assertEquals(0, xorXorPrime.getChildren().size());
//
//        assertEquals(3, exprPrime.getChildren().size());
//        Tree exprPrimeOr = exprPrime.getChildren().get(0);
//        Tree exprPrimeXor = exprPrime.getChildren().get(1);
//        Tree exprPrimeExprPrime = exprPrime.getChildren().get(2);
//        assertEquals("OR", exprPrimeOr.getName());
//        assertEquals("xor", exprPrimeXor.getName());
//        assertEquals("exprPrime", exprPrimeExprPrime.getName());
//
//        assertEquals(0, exprPrimeOr.getChildren().size());
//
//        assertEquals(2, exprPrimeXor.getChildren().size());
//        Tree exprPrimeXorAnd = exprPrimeXor.getChildren().get(0);
//        Tree exprPrimeXorXorPrime = exprPrimeXor.getChildren().get(1);
//        assertEquals("and", exprPrimeXorAnd.getName());
//        assertEquals("xorPrime", exprPrimeXorXorPrime.getName());
//
//        assertEquals(2, exprPrimeXorAnd.getChildren().size());
//        Tree exprPrimeXorAndFactor = exprPrimeXorAnd.getChildren().get(0);
//        Tree exprPrimeXorAndAndPrime = exprPrimeXorAnd.getChildren().get(1);
//        assertEquals("factor", exprPrimeXorAndFactor.getName());
//        assertEquals("andPrime", exprPrimeXorAndAndPrime.getName());
//
//        assertEquals(1, exprPrimeXorAndFactor.getChildren().size());
//        Tree exprPrimeXorAndFactorItem = exprPrimeXorAndFactor.getChildren().get(0);
//        assertEquals("item", exprPrimeXorAndFactorItem.getName());
//
//        assertEquals(1, exprPrimeXorAndFactorItem.getChildren().size());
//        Tree exprPrimeXorAndFactorItemX = exprPrimeXorAndFactorItem.getChildren().get(0);
//        assertEquals("VARIABLE", exprPrimeXorAndFactorItemX.getName());
//
//        assertEquals(3, exprPrimeXorAndAndPrime.getChildren().size());
//        Tree exprPrimeXorAndAndPrimeAnd = exprPrimeXorAndAndPrime.getChildren().get(0);
//        Tree exprPrimeXorAndAndPrimeFactor = exprPrimeXorAndAndPrime.getChildren().get(1);
//        Tree exprPrimeXorAndAndPrimeAndPrime = exprPrimeXorAndAndPrime.getChildren().get(2);
//        assertEquals("AND", exprPrimeXorAndAndPrimeAnd.getName());
//        assertEquals("factor", exprPrimeXorAndAndPrimeFactor.getName());
//        assertEquals("andPrime", exprPrimeXorAndAndPrimeAndPrime.getName());
//
//        assertEquals(0, exprPrimeXorAndAndPrimeAnd.getChildren().size());
//
//        assertEquals(1, exprPrimeXorAndAndPrimeFactor.getChildren().size());
//        Tree exprPrimeXorAndAndPrimeFactorItem = exprPrimeXorAndAndPrimeFactor.getChildren().get(0);
//        assertEquals("item", exprPrimeXorAndAndPrimeFactorItem.getName());
//
//        assertEquals(1, exprPrimeXorAndAndPrimeFactorItem.getChildren().size());
//        Tree exprPrimeXorAndAndPrimeFactorItemX = exprPrimeXorAndAndPrimeFactorItem.getChildren().get(0);
//        assertEquals("VARIABLE", exprPrimeXorAndAndPrimeFactorItemX.getName());
//
//        assertEquals(0, exprPrimeXorAndAndPrimeAndPrime.getChildren().size());
//
//        assertEquals(0, exprPrimeXorXorPrime.getChildren().size());
//
//        assertEquals(0, exprPrimeExprPrime.getChildren().size());
//    }
//
//    @Test
//    public void testParser_invalidExpr_unexpectedToken() throws ParseException {
//        String expr = "x & x |";
//
//        Parser parser = new Parser(expr);
//
//        assertThrows(ParseException.class, parser::expr);
//    }
//
//    @Test
//    public void testParser_invalidExpr_unexpectedChar() throws ParseException {
//        String expr = "x & , x";
//
//        Parser parser = new Parser(expr);
//
//        assertThrows(ParseException.class, parser::expr);
//    }
//}
