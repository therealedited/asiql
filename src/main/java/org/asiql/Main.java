package org.asiql;

import org.antlr.v4.runtime.*;
import org.asiql.ast.BuildAstVisitor;
import org.asiql.nodes.ExprNode;
import org.asiql.parser.asiqlLexer;
import org.asiql.parser.asiqlParser;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        UnbufferedCharStream ais = new UnbufferedCharStream(new FileInputStream(System.getProperty("user.dir") + "/query.asiql"));
        asiqlLexer lexer = new asiqlLexer(ais);
        lexer.setTokenFactory(new CommonTokenFactory(true));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        asiqlParser parser = new asiqlParser(tokenStream);
        ExprNode ast = new BuildAstVisitor().visitRoot(parser.root());
        System.out.println(ast);
    }
}
