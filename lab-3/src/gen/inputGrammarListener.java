// Generated from /Users/veronika/Desktop/mt-homeworks/lab-4/src/inputGrammar.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link inputGrammarParser}.
 */
public interface inputGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link inputGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(inputGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(inputGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputGrammarParser#exprP}.
	 * @param ctx the parse tree
	 */
	void enterExprP(inputGrammarParser.ExprPContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputGrammarParser#exprP}.
	 * @param ctx the parse tree
	 */
	void exitExprP(inputGrammarParser.ExprPContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(inputGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(inputGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputGrammarParser#termP}.
	 * @param ctx the parse tree
	 */
	void enterTermP(inputGrammarParser.TermPContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputGrammarParser#termP}.
	 * @param ctx the parse tree
	 */
	void exitTermP(inputGrammarParser.TermPContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(inputGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(inputGrammarParser.FactorContext ctx);
}