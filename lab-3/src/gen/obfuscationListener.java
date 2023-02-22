// Generated from /Users/veronika/Desktop/mt-homeworks/lab-3/src/obfuscation.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link obfuscationParser}.
 */
public interface obfuscationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(obfuscationParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(obfuscationParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(obfuscationParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(obfuscationParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(obfuscationParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(obfuscationParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(obfuscationParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(obfuscationParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(obfuscationParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(obfuscationParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(obfuscationParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(obfuscationParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(obfuscationParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(obfuscationParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(obfuscationParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(obfuscationParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(obfuscationParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(obfuscationParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#addOrSub}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSub(obfuscationParser.AddOrSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#addOrSub}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSub(obfuscationParser.AddOrSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(obfuscationParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(obfuscationParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#subexpr}.
	 * @param ctx the parse tree
	 */
	void enterSubexpr(obfuscationParser.SubexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#subexpr}.
	 * @param ctx the parse tree
	 */
	void exitSubexpr(obfuscationParser.SubexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(obfuscationParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(obfuscationParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(obfuscationParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(obfuscationParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(obfuscationParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(obfuscationParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(obfuscationParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(obfuscationParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#equals}.
	 * @param ctx the parse tree
	 */
	void enterEquals(obfuscationParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#equals}.
	 * @param ctx the parse tree
	 */
	void exitEquals(obfuscationParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#notEquals}.
	 * @param ctx the parse tree
	 */
	void enterNotEquals(obfuscationParser.NotEqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#notEquals}.
	 * @param ctx the parse tree
	 */
	void exitNotEquals(obfuscationParser.NotEqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(obfuscationParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(obfuscationParser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#openParen}.
	 * @param ctx the parse tree
	 */
	void enterOpenParen(obfuscationParser.OpenParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#openParen}.
	 * @param ctx the parse tree
	 */
	void exitOpenParen(obfuscationParser.OpenParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#closeParen}.
	 * @param ctx the parse tree
	 */
	void enterCloseParen(obfuscationParser.CloseParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#closeParen}.
	 * @param ctx the parse tree
	 */
	void exitCloseParen(obfuscationParser.CloseParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#openCurlyBrace}.
	 * @param ctx the parse tree
	 */
	void enterOpenCurlyBrace(obfuscationParser.OpenCurlyBraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#openCurlyBrace}.
	 * @param ctx the parse tree
	 */
	void exitOpenCurlyBrace(obfuscationParser.OpenCurlyBraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#closeCurlyBrace}.
	 * @param ctx the parse tree
	 */
	void enterCloseCurlyBrace(obfuscationParser.CloseCurlyBraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#closeCurlyBrace}.
	 * @param ctx the parse tree
	 */
	void exitCloseCurlyBrace(obfuscationParser.CloseCurlyBraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(obfuscationParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(obfuscationParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(obfuscationParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(obfuscationParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(obfuscationParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(obfuscationParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(obfuscationParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(obfuscationParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(obfuscationParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(obfuscationParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#moreStrict}.
	 * @param ctx the parse tree
	 */
	void enterMoreStrict(obfuscationParser.MoreStrictContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#moreStrict}.
	 * @param ctx the parse tree
	 */
	void exitMoreStrict(obfuscationParser.MoreStrictContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#moreOrEq}.
	 * @param ctx the parse tree
	 */
	void enterMoreOrEq(obfuscationParser.MoreOrEqContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#moreOrEq}.
	 * @param ctx the parse tree
	 */
	void exitMoreOrEq(obfuscationParser.MoreOrEqContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#lessStrict}.
	 * @param ctx the parse tree
	 */
	void enterLessStrict(obfuscationParser.LessStrictContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#lessStrict}.
	 * @param ctx the parse tree
	 */
	void exitLessStrict(obfuscationParser.LessStrictContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#lessOrEq}.
	 * @param ctx the parse tree
	 */
	void enterLessOrEq(obfuscationParser.LessOrEqContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#lessOrEq}.
	 * @param ctx the parse tree
	 */
	void exitLessOrEq(obfuscationParser.LessOrEqContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(obfuscationParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(obfuscationParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(obfuscationParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(obfuscationParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(obfuscationParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(obfuscationParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(obfuscationParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(obfuscationParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link obfuscationParser#spaces}.
	 * @param ctx the parse tree
	 */
	void enterSpaces(obfuscationParser.SpacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link obfuscationParser#spaces}.
	 * @param ctx the parse tree
	 */
	void exitSpaces(obfuscationParser.SpacesContext ctx);
}