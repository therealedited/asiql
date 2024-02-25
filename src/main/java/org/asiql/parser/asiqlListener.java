package org.asiql.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link asiqlParser}.
 */
public interface asiqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link asiqlParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(asiqlParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link asiqlParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(asiqlParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConstant(asiqlParser.IntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConstant(asiqlParser.IntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(asiqlParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(asiqlParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 */
	void enterDecimalConstant(asiqlParser.DecimalConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 */
	void exitDecimalConstant(asiqlParser.DecimalConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dateConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 */
	void enterDateConstant(asiqlParser.DateConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dateConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 */
	void exitDateConstant(asiqlParser.DateConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayIntegerConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 */
	void enterArrayIntegerConstant(asiqlParser.ArrayIntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayIntegerConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 */
	void exitArrayIntegerConstant(asiqlParser.ArrayIntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayStringConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 */
	void enterArrayStringConstant(asiqlParser.ArrayStringConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayStringConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 */
	void exitArrayStringConstant(asiqlParser.ArrayStringConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayDecimalConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 */
	void enterArrayDecimalConstant(asiqlParser.ArrayDecimalConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayDecimalConstant}
	 * labeled alternative in {@link asiqlParser#const}.
	 * @param ctx the parse tree
	 */
	void exitArrayDecimalConstant(asiqlParser.ArrayDecimalConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negationExpression}
	 * labeled alternative in {@link asiqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegationExpression(asiqlParser.NegationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negationExpression}
	 * labeled alternative in {@link asiqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegationExpression(asiqlParser.NegationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link asiqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpression(asiqlParser.InfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link asiqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpression(asiqlParser.InfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link asiqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(asiqlParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link asiqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(asiqlParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionExpression}
	 * labeled alternative in {@link asiqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(asiqlParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionExpression}
	 * labeled alternative in {@link asiqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(asiqlParser.FunctionExpressionContext ctx);
}