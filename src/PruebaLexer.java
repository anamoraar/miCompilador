import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class PruebaLexer {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.err.println("Use el comando así: PruebaLexer nombreArchivoEntrada nombreArchivoSalida");
            System.exit(1);
        }
        //Nombre de los archivos de entrada y salida
        String inputFileName = args[0];
        String outputFileName = args[1];
        //Pasarlo a string
        FileInputStream inputStream = new FileInputStream(inputFileName);
        String inputText = new String(inputStream.readAllBytes());
        //Generar el lexer y los tokens dada la entrada
        GramaticaLexer lexer = new GramaticaLexer(CharStreams.fromString(inputText));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        //Archivo de salida
        //Escribir en el archivo de salia
        FileWriter outputWriter = new FileWriter(outputFileName);
        for (Token token : tokens.getTokens()) {
            outputWriter.write("Token: " + token.getText() + ", línea: " + token.getLine() + ", índice: " + token.getCharPositionInLine() + "\n");
        }
        outputWriter.close();
    }
}

