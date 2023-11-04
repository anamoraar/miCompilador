import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class PruebaParser {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.err.println("Use el comando así: PruebaParser nombreArchivoEntrada nombreArchivoSalida");
            System.exit(1);
        }
        // Nombre de los archivos de entrada y salida
        String inputFileName = args[0];
        String outputFileName = args[1];

        // Leer el archivo de entrada
        FileInputStream inputStream = new FileInputStream(inputFileName);
        String inputText = new String(inputStream.readAllBytes());

        // Crear el lexer y los tokens a partir de la entrada
        GramaticaLexer lexer = new GramaticaLexer(CharStreams.fromString(inputText));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Crear el parser
        GramaticaParser parser = new GramaticaParser(tokens);

        // Especificar la regla inicial de la gramática para formar el AST
        ParseTree AST = parser.programa();
        //Revisar si hubo errores
        if (parser.getNumberOfSyntaxErrors() > 0) {
            FileWriter outputWriter = new FileWriter(outputFileName);
            outputWriter.write("La entrada contiene errores");
            outputWriter.close();
        } else {
            //El análisis sintáctico fue exitoso
            FileWriter outputWriter = new FileWriter(outputFileName);
            outputWriter.write(AST.toStringTree(parser));
            outputWriter.close();
        }
    }
}
