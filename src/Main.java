import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) {
        String inputText = "x := 2 + 5;\n y := !VERDADERO;\n z := VERDADERO || FALSO;";
        String inputText2 ="SI(VERDADERO){x := 2 * 6};";
        GramaticaLexer lexer = new GramaticaLexer(CharStreams.fromString(inputText2));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GramaticaParser parser = new GramaticaParser(tokens);
        ParseTree AST = parser.programa();
        MyVisitor visitor = new MyVisitor();
        visitor.visit(AST);
        visitor.printTabla();
    }
}
