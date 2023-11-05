import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

//Clase para hacer pruebas exclusivamente léxicas
public class PruebaLexer {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) System.exit(1);
        //Nombre de los archivos de entrada y salida
        String inputFileName = args[0];
        String outputFileName = args[1];
        //Pasarlo a string
        FileInputStream inputStream = new FileInputStream(inputFileName);
        String inputText = new String(inputStream.readAllBytes());
        //Generar el lexer y pasarle la entrada
        GramaticaLexer lexer = new GramaticaLexer(CharStreams.fromString(inputText));
        // Crear un FileWriter para escribir la salida
        FileWriter outputWriter = new FileWriter(outputFileName);
        // Crear una instancia de MyErrorListener y adjuntarla al lexer
        MyErrorListener errorListener = new MyErrorListener(outputWriter);
        lexer.removeErrorListeners(); // Eliminar los listeners por defecto
        lexer.addErrorListener(errorListener);
        //Generar los tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        // Escribir en el archivo de salida los tokens identificados
        for (Token token : tokens.getTokens()) {
            outputWriter.write("Token: " + token.getText() + ", linea: " + token.getLine() + ", columna: " + token.getCharPositionInLine() + "\n");
        }
        // Cerrar el archivo de salida
        outputWriter.close();
    }
}

