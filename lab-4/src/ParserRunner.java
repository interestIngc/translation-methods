import parser.Parser;

import java.text.ParseException;

public class ParserRunner {
    public static void main(String[] args) throws ParseException {
        Parser parser = new Parser("64 // 2 * 27 // 3");
        System.out.println(parser.expr().val);
    }
}
