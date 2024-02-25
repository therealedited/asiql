package org.asiql.ast;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.asiql.nodes.*;
import org.asiql.parser.asiqlBaseVisitor;
import org.asiql.parser.asiqlParser;

import java.util.ArrayList;

public class BuildAstVisitor extends asiqlBaseVisitor<ExprNode> {
    @Override
    public ExprNode visitIdentifier(asiqlParser.IdentifierContext ctx) {
        IdNode node = new IdNode();
        node.setName(ctx.ID().getText());
        return node;
    }

    @Override
    public ExprNode visitRoot(asiqlParser.RootContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public ExprNode visitIntegerConstant(asiqlParser.IntegerConstantContext ctx) {
        ConstantNode<Integer> node = new ConstantNode<>();
        node.setValue(Integer.parseInt(ctx.INT().getText()));
        return node;
    }

    @Override
    public ExprNode visitStringConstant(asiqlParser.StringConstantContext ctx) {
        ConstantNode<String> node = new ConstantNode<>();
        node.setValue(ctx.STR().getText());
        return node;
    }

    @Override
    public ExprNode visitDecimalConstant(asiqlParser.DecimalConstantContext ctx) {
        ConstantNode<Double> node = new ConstantNode<>();
        node.setValue(Double.parseDouble(ctx.DECIMAL().getText()));
        return node;
    }

    @Override
    public ExprNode visitDateConstant(asiqlParser.DateConstantContext ctx) {
        DateNode node = new DateNode();
        node.setValue(ctx.DATE().getText());
        return node;
    }

    @Override
    public ExprNode visitArrayIntegerConstant(asiqlParser.ArrayIntegerConstantContext ctx) {
        ArrayNode<Integer> node = new ArrayNode<>();
        ArrayList<Integer> value = new ArrayList<>();
        for (TerminalNode child: ctx.INT()) {
            value.add(Integer.parseInt(child.getText()));
        }
        node.setValue(value);
        return node;
    }

    @Override
    public ExprNode visitArrayStringConstant(asiqlParser.ArrayStringConstantContext ctx) {
        ArrayNode<String> node = new ArrayNode<>();
        ArrayList<String> value = new ArrayList<>();
        for (TerminalNode child: ctx.STR()) {
            value.add(child.getText());
        }
        node.setValue(value);
        return node;
    }

    @Override
    public ExprNode visitArrayDecimalConstant(asiqlParser.ArrayDecimalConstantContext ctx) {
        ArrayNode<Double> node = new ArrayNode<>();
        ArrayList<Double> value = new ArrayList<>();
        for (TerminalNode child: ctx.DECIMAL()) {
            value.add(Double.parseDouble(child.getText()));
        }
        node.setValue(value);
        return node;
    }

    @Override
    public ExprNode visitNegationExpression(asiqlParser.NegationExpressionContext ctx) {
        NegateNode node = new NegateNode();
        node.setInner(visit(ctx.expr()));
        return node;
    }

    @Override
    public ExprNode visitInfixExpression(asiqlParser.InfixExpressionContext ctx) {
        InfixExprNode node = null;
        switch(ctx.conjunction.getType()) {
            case asiqlParser.AND -> node = new AndNode();
            case asiqlParser.OR -> node = new OrNode();
        }
        assert node != null;
        node.setLeft(visit(ctx.left));
        node.setRight(visit(ctx.right));
        return node;
    }

    @Override
    public ExprNode visitParenthesisExpression(asiqlParser.ParenthesisExpressionContext ctx) {
        ParenthesisNode node = new ParenthesisNode();
        node.setInner(visit(ctx.expr()));
        return node;
    }

    @Override
    public ExprNode visitFunctionExpression(asiqlParser.FunctionExpressionContext ctx) {
        InfixExprNode node = null;
        switch(ctx.function.getType()) {
            case asiqlParser.IS -> node = new IsNode();
            case asiqlParser.SINCE -> node = new SinceNode();
            case asiqlParser.UNTIL -> node = new UntilNode();
            case asiqlParser.GREATER_THAN -> node = new GreaterThanNode();
            case asiqlParser.LESS_THAN -> node = new LessThanNode();
        }
        assert node != null;
        node.setLeft(visit(ctx.left));
        node.setRight(visit(ctx.right));
        return node;
    }
}
