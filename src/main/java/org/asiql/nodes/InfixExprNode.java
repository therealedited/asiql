package org.asiql.nodes;

public abstract class InfixExprNode extends ExprNode {

    private ExprNode left;
    private ExprNode right;
    public ExprNode getLeft() {
        return left;
    }

    public void setLeft(ExprNode left) {
        this.left = left;
    }

    public ExprNode getRight() {
        return right;
    }

    public void setRight(ExprNode right) {
        this.right = right;
    }
}
