import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) System.exit(1);
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
        // Crear un FileWriter para escribir la salida
        FileWriter outputWriter = new FileWriter(outputFileName);
        // Crear una instancia de MyErrorListener y adjuntarla al parser
        MyErrorListener errorListener = new MyErrorListener(outputWriter);
        parser.removeErrorListeners(); // Eliminar los listeners por defecto
        parser.addErrorListener(errorListener);
        // Ejecutar la regla inicial de la gramática para formar el AST
        ParseTree AST = parser.programa();
        //Crear uns instancia del visitor para recorrer el AST
        MyVisitor visitor = new MyVisitor(outputWriter);
        visitor.visit(AST); //recorrer el AST
        outputWriter.write(visitor.printTabla()); //escribir la tabla de símbolos en el archivo
        outputWriter.close(); // Cerrar el archivo de salida
    }
}
