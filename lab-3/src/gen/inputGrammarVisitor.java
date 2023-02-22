// Generated from /Users/veronika/Desktop/mt-homeworks/lab-4/src/inputGrammar.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link inputGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface inputGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link inputGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(inputGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link inputGrammarParser#exprP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprP(inputGrammarParser.ExprPContext ctx);
	/**
	 * Visit a parse tree produced by {@link inputGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(inputGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link inputGrammarParser#termP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermP(inputGrammarParser.TermPContext ctx);
	/**
	 * Visit a parse tree produced by {@link inputGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(inputGrammarParser.FactorContext ctx);
}