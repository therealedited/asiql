package org.asiql.nodes;

import java.lang.constant.ConstantDesc;

public class ConstantNode<T extends ConstantDesc> extends ExprNode{

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
