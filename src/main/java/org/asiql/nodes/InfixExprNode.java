package org.asiql.nodes;

public abstract class InfixExprNode {

    public ExprNode left;
    public ExprNode right;
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
