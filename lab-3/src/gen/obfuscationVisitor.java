// Generated from /Users/veronika/Desktop/mt-homeworks/lab-3/src/obfuscation.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link obfuscationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface obfuscationVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(obfuscationParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(obfuscationParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(obfuscationParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(obfuscationParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(obfuscationParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(obfuscationParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(obfuscationParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(obfuscationParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(obfuscationParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#addOrSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOrSub(obfuscationParser.AddOrSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(obfuscationParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#subexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubexpr(obfuscationParser.SubexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(obfuscationParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(obfuscationParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(obfuscationParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(obfuscationParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(obfuscationParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#notEquals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEquals(obfuscationParser.NotEqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon(obfuscationParser.SemicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#openParen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenParen(obfuscationParser.OpenParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#closeParen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseParen(obfuscationParser.CloseParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#openCurlyBrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenCurlyBrace(obfuscationParser.OpenCurlyBraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#closeCurlyBrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseCurlyBrace(obfuscationParser.CloseCurlyBraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(obfuscationParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(obfuscationParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(obfuscationParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(obfuscationParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(obfuscationParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#moreStrict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreStrict(obfuscationParser.MoreStrictContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#moreOrEq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreOrEq(obfuscationParser.MoreOrEqContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#lessStrict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessStrict(obfuscationParser.LessStrictContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#lessOrEq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOrEq(obfuscationParser.LessOrEqContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(obfuscationParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(obfuscationParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(obfuscationParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(obfuscationParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link obfuscationParser#spaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpaces(obfuscationParser.SpacesContext ctx);
}