import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.io.FileWriter;
import java.io.IOException;

public class MyErrorListener extends BaseErrorListener {

    //Archivo de salida donde se escriben los errores
    private final FileWriter outputWriter;

    //En el constructor se le pasa el archivo de salida creado en el main
    public MyErrorListener(FileWriter outputWriter) {
        this.outputWriter = outputWriter;
    }

    //Método que imprime y escribe los errores encontrados
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String errorText = "Error en linea " + line + ", columna " + charPositionInLine + " - " + msg + "\n";
        System.err.println(errorText);
        try {
            outputWriter.write(errorText);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}
