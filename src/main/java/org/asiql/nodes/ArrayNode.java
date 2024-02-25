package org.asiql.nodes;

import java.util.Collection;

public class ArrayNode<T> {
    private Collection<T> value;

    public Collection<T> getValue() {
        return value;
    }

    public void setValue(Collection<T> value) {
        this.value = value;
    }
}
