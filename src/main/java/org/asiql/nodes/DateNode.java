package org.asiql.nodes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateNode extends ExprNode {

    private LocalDateTime value;

    public LocalDateTime getValue() {
        return value;
    }

    public void setValue(String value){
        this.value = LocalDateTime
                .parse(value, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    }
}
