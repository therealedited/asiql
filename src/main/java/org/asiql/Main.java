package org.asiql;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
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
        parser.setErrorHandler(new BailErrorStrategy());
        try {
            String str = new BuildSqlQueryVisitor().visitRoot(parser.root());
            System.out.println(str);
        } catch (ParseCancellationException e) {
            System.out.println("error");
        }
    }
}
