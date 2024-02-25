# A Simple Intermediate Query Language

ASIQL is a project made in Java with the goal of making a simple query language to perform
search operations on any kind of database backend.

**This is a research project.** 

## How does it work?

The query is parsed by [ANTLR](https://www.antlr.org/) and transformed into a [CST](https://en.wikipedia.org/wiki/Parse_tree) 
following the grammar defined in **asiql.g4** present at the root of the project. \
The CST is then transformed into an [AST](https://en.wikipedia.org/wiki/Abstract_syntax_tree). This same AST is used to generate syntax.\
This repository only has ASIQL -> SQL as an example.

## Syntax

### Constant
* Integer
* Decimal
* Date
* String
* Array of integers (Written as integers separated by a comma.)
* Array of decimals (Written as decimals separated by a comma.)
* Array of strings (Written as strings separated by a comma.)

### Conjunction
* And
* Or

### Unary
* Not

### Comparaison
* Greater than (Written as '>')
* Less than (Written as '<')
* Is
* Since (Only on dates)
* Until (Only on dates)

**A valid ASIQL query follows this rule: ``unary? identifier comparaison constant conjunction?``**

Example:

```x > 10 and y is 10,1,5 or z is 10.5 or not a until 01/01/2020 or b since 05/10/1984```

## TODO
- Implement parenthesis
- Implement greater than or equal
- Implement less than or equal


## Thanks

- Terence Parr for ANTLR.
- https://github.com/mike-lischke/antlr-format for the antlr formatter.
- https://stackoverflow.com/questions/29971097/how-to-create-ast-with-antlr4 for explaining the "CST -> AST -> Compilation" process 
in a very simple and easy to understand manner.
