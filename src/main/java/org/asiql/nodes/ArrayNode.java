package org.asiql.nodes;

import java.lang.constant.ConstantDesc;
import java.util.Collection;

public class ArrayNode<T extends ConstantDesc> extends ExprNode{
    private Collection<T> value;

    public Collection<T> getValue() {
        return value;
    }

    public void setValue(Collection<T> value) {
        this.value = value;
    }
}
