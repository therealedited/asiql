package org.asiql.nodes;

public abstract class FunctionNode extends ExprNode {
    private ExprNode left;
    private int function;
    private ExprNode right;

    public ExprNode getLeft() {
        return left;
    }

    public void setLeft(ExprNode left) {
        this.left = left;
    }

    public int getFunction() {
        return function;
    }

    public void setFunction(int function) {
        this.function = function;
    }

    public ExprNode getRight() {
        return right;
    }

    public void setRight(ExprNode right) {
        this.right = right;
    }
}
