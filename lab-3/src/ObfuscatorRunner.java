import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import gen.*;

public class ObfuscatorRunner {

    public static void main(String[] args) {
        try {
            CharStream stream = CharStreams.fromFileName("src/example.txt");
            obfuscationLexer lexer = new obfuscationLexer(stream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            obfuscationParser parser = new obfuscationParser(tokenStream);

            obfuscationParser.FileContext fileContext = parser.file();

            ObfuscatorVisitor obfuscatorVisitor = new ObfuscatorVisitor();
            String result = obfuscatorVisitor.visitFile(fileContext);
            Path outputPath = Paths.get("src/output.txt");
            Files.write(outputPath, result.getBytes(StandardCharsets.UTF_8));
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("error while reading from input file occurred " + e.getMessage());
        }
    }
}
