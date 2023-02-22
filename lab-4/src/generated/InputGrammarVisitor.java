// Generated from /Users/veronika/Desktop/mt-homeworks/lab-4/src/InputGrammar.g4 by ANTLR 4.9.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InputGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InputGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InputGrammarParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(InputGrammarParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputGrammarParser#nonTerminalRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTerminalRule(InputGrammarParser.NonTerminalRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(InputGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputGrammarParser#returnsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnsStatement(InputGrammarParser.ReturnsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputGrammarParser#nonTerminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTerminal(InputGrammarParser.NonTerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputGrammarParser#nonTerminalWithArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTerminalWithArg(InputGrammarParser.NonTerminalWithArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputGrammarParser#terminalRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminalRule(InputGrammarParser.TerminalRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputGrammarParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(InputGrammarParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputGrammarParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(InputGrammarParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(InputGrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputGrammarParser#regex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegex(InputGrammarParser.RegexContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputGrammarParser#terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal(InputGrammarParser.TerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputGrammarParser#colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon(InputGrammarParser.ColonContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputGrammarParser#semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon(InputGrammarParser.SemicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link InputGrammarParser#skipToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipToken(InputGrammarParser.SkipTokenContext ctx);
}