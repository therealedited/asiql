package org.asiql;

import org.asiql.parser.asiqlBaseVisitor;
import org.asiql.parser.asiqlParser;

public class BuildSqlQueryVisitor extends asiqlBaseVisitor<String> {
    @Override
    public String visitIdentifier(asiqlParser.IdentifierContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitRoot(asiqlParser.RootContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public String visitIntegerConstant(asiqlParser.IntegerConstantContext ctx) {
        return String.format("(%s)", ctx.INT().getText());
    }

    @Override
    public String visitStringConstant(asiqlParser.StringConstantContext ctx) {
        return String.format("('%s')", ctx.STR().getText());
    }

    @Override
    public String visitDecimalConstant(asiqlParser.DecimalConstantContext ctx) {
        return String.format("(%s)", ctx.DECIMAL().getText());
    }

    @Override
    public String visitDateConstant(asiqlParser.DateConstantContext ctx) {
        String[] split = ctx.DATE().getText().split("/");
        return String.format("'%s-%s-%s'", split[0], split[1], split[2]);
    }

    @Override
    public String visitArrayIntegerConstant(asiqlParser.ArrayIntegerConstantContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < ctx.INT().size() - 1; i++) {
            sb.append(ctx.INT().get(i).getText()).append(",");
        }
        sb.append(ctx.INT().get(ctx.INT().size() - 1).getText()  + ")");
        return sb.toString();
    }

    @Override
    public String visitArrayStringConstant(asiqlParser.ArrayStringConstantContext ctx) {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < ctx.STR().size() - 1; i++) {
            sb.append(ctx.STR().get(i).getText() + ",");
        }
        sb.append(ctx.STR().get(ctx.STR().size() - 1).getText() + ")");
        return sb.toString();
    }

    @Override
    public String visitArrayDecimalConstant(asiqlParser.ArrayDecimalConstantContext ctx) {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < ctx.DECIMAL().size() - 1; i++) {
            sb.append(ctx.DECIMAL().get(i).getText() + ",");
        }
        sb.append(ctx.DECIMAL().get(ctx.DECIMAL().size() - 1).getText() + ")");
        return sb.toString();
    }

    @Override
    public String visitNegationExpression(asiqlParser.NegationExpressionContext ctx) {
        return "NOT " + visit(ctx.expr());
    }

    @Override
    public String visitInfixExpression(asiqlParser.InfixExpressionContext ctx) {
        String str = "";
        switch(ctx.conjunction.getType()) {
            case asiqlParser.AND -> str = visit(ctx.left) + " AND " + visit(ctx.right);
            case asiqlParser.OR -> str = visit(ctx.left) + " OR " + visit(ctx.right);
        }
        return str;
    }

    @Override
    public String visitParenthesisExpression(asiqlParser.ParenthesisExpressionContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public String visitFunctionExpression(asiqlParser.FunctionExpressionContext ctx) {
        String str = "";
        switch(ctx.function.getType()) {
            case asiqlParser.IS -> str = visit(ctx.left) + " IN " + visit(ctx.right);
            case asiqlParser.SINCE, asiqlParser.GREATER_THAN -> str = visit(ctx.left) + " > " + visit(ctx.right);
            case asiqlParser.UNTIL, asiqlParser.LESS_THAN -> str = visit(ctx.left) + " < " + visit(ctx.right);
        }
        return str;
    }
}
