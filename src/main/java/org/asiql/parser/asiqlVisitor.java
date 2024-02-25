package org.asiql.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link asiqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface asiqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link asiqlParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(asiqlParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConstant(asiqlParser.IntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(asiqlParser.StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalConstant(asiqlParser.DecimalConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dateConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateConstant(asiqlParser.DateConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayIntegerConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIntegerConstant(asiqlParser.ArrayIntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayStringConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayStringConstant(asiqlParser.ArrayStringConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayDecimalConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDecimalConstant(asiqlParser.ArrayDecimalConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negationExpression}
	 * labeled alternative in {@link asiqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationExpression(asiqlParser.NegationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link asiqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpression(asiqlParser.InfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link asiqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(asiqlParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExpression}
	 * labeled alternative in {@link asiqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(asiqlParser.FunctionExpressionContext ctx);
}