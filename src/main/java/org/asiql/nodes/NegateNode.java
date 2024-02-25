package org.asiql.nodes;

public class NegateNode extends ExprNode {
    private ExprNode inner;

    public ExprNode getInner() {
        return inner;
    }

    public void setInner(ExprNode inner) {
        this.inner = inner;
    }
}
