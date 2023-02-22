import org.antlr.v4.runtime.*;
import generated.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ParserGeneratorRunner {
    public static void main(String[] args) {
        try {
            CharStream charStream = CharStreams.fromFileName(
                    "src/grammars/calculator.txt",
                    StandardCharsets.UTF_8);
            Lexer lexer = new InputGrammarLexer(charStream);
            TokenStream tokenStream = new CommonTokenStream(lexer);
            InputGrammarParser parser = new InputGrammarParser(tokenStream);
            InputGrammarParser.FileContext fileContext = parser.file();

            InputGrammarVisitor visitor = new InputGrammarVisitor();

            visitor.visitFile(fileContext);
        } catch (IOException e) {
            System.err.println("Error while reading from file occurred " + e.getMessage());
        }
    }
}
