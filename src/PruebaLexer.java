import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class PruebaLexer {
    public static void main(String[] args) throws Exception {
        String inputText = "x := 42;\n var := falso;";

        GramaticaLexer lexer = new GramaticaLexer(CharStreams.fromString(inputText));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        tokens.fill();

        for (Token token : tokens.getTokens()) {
            System.out.println("Token: " + token.getText() + ", línea: " + token.getLine() + ", índice: " + token.getCharPositionInLine());
        }
    }
}
