// Generated from /Users/veronika/Desktop/mt-homeworks/lab-4/src/InputGrammar.g4 by ANTLR 4.9.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InputGrammarParser}.
 */
public interface InputGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InputGrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(InputGrammarParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputGrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(InputGrammarParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputGrammarParser#nonTerminalRule}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminalRule(InputGrammarParser.NonTerminalRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputGrammarParser#nonTerminalRule}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminalRule(InputGrammarParser.NonTerminalRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(InputGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(InputGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputGrammarParser#returnsStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnsStatement(InputGrammarParser.ReturnsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputGrammarParser#returnsStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnsStatement(InputGrammarParser.ReturnsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputGrammarParser#nonTerminal}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminal(InputGrammarParser.NonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputGrammarParser#nonTerminal}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminal(InputGrammarParser.NonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputGrammarParser#nonTerminalWithArg}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminalWithArg(InputGrammarParser.NonTerminalWithArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputGrammarParser#nonTerminalWithArg}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminalWithArg(InputGrammarParser.NonTerminalWithArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputGrammarParser#terminalRule}.
	 * @param ctx the parse tree
	 */
	void enterTerminalRule(InputGrammarParser.TerminalRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputGrammarParser#terminalRule}.
	 * @param ctx the parse tree
	 */
	void exitTerminalRule(InputGrammarParser.TerminalRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(InputGrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(InputGrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputGrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(InputGrammarParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputGrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(InputGrammarParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(InputGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(InputGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputGrammarParser#regex}.
	 * @param ctx the parse tree
	 */
	void enterRegex(InputGrammarParser.RegexContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputGrammarParser#regex}.
	 * @param ctx the parse tree
	 */
	void exitRegex(InputGrammarParser.RegexContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputGrammarParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(InputGrammarParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputGrammarParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(InputGrammarParser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputGrammarParser#colon}.
	 * @param ctx the parse tree
	 */
	void enterColon(InputGrammarParser.ColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputGrammarParser#colon}.
	 * @param ctx the parse tree
	 */
	void exitColon(InputGrammarParser.ColonContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputGrammarParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(InputGrammarParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputGrammarParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(InputGrammarParser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link InputGrammarParser#skipToken}.
	 * @param ctx the parse tree
	 */
	void enterSkipToken(InputGrammarParser.SkipTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputGrammarParser#skipToken}.
	 * @param ctx the parse tree
	 */
	void exitSkipToken(InputGrammarParser.SkipTokenContext ctx);
}