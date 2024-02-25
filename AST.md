# ASIQL AST

## Nodes

### ExprNode

Abstract class defining a node.

### InfixExprNode

Abstract class defining an infix relation, usually two expressions between a conjunction.

### AndNode

Concrete class representing the "And" operation.

### OrNode

Concrete class representing the "Or" operation.

### ArrayNode

Concrete class representing an array of constants.

### ConstantNode

Concrete class representing a constant. Integer, Decimal or String.

### DateNode

Concrete class representing a date.

### GreaterThanNode

Concrete class representing a "greater than" operation.

### LessThanNode

Concrete class representing a "less than" operation.

### IdNode

Concrete class representing a variable. In SQL this would be a column name.

### NegateNode

Concrete class representing a "NOT" operation.


