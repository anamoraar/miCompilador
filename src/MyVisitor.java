import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

//Clase visitor que pasa por diferentes símbolos de la gramática, solo se sobreescriben
//los métodos necesarios, ya que los otros están implementados en la clase madre
//Referencia: https://github.com/bkiers/Mu/blob/master/src/main/java/mu/EvalVisitor.java
public class MyVisitor extends GramaticaBaseVisitor<Nodo>{

    //Almacena las variables
    private final Map<String, Nodo> tablaSimbolos = new HashMap<String, Nodo>();
    private final FileWriter outputWriter;

    public MyVisitor(FileWriter outputWriter) {
        this.outputWriter = outputWriter;
    }

    public String printTabla(){
        StringBuilder txt = new StringBuilder();
        for(Map.Entry<String, Nodo> simbs : tablaSimbolos.entrySet()){
            Nodo nodo = simbs.getValue();
            String valor = "";
            if (nodo != null) {
                if(nodo.esNumero()) valor += nodo.getNumero()+"\n";
                else valor += nodo.getBooleano()+"\n";
                txt.append(simbs.getKey()).append(" = ").append(valor);
            }
        }
        return txt.toString();
    }

    //Método que visita al nodo no terminal 'asignacion'
    @Override
    public Nodo visitAsignacion(GramaticaParser.AsignacionContext ctx) {
        //Tomar el nombre de la variable
        String identificador = ctx.IDENTIFICADOR().getText();
        //El valor es la expresión que está luego del ':='
        Nodo valorAsignado = visit(ctx.expresion());
        return tablaSimbolos.put(identificador, valorAsignado);
    }

    //Método que visita al nodo no terminal 'condicional'
    @Override
    public Nodo visitCondicional(GramaticaParser.CondicionalContext ctx) {
        //Visitar la condición para saber si debe entrar al if
        Nodo valorCondicion = visit(ctx.expresion_bool());
        //Verificar que sea un booleano
        if (valorCondicion != null && valorCondicion.esBooleano()) {
            //El .getBooleano() retorna true o false según la condición
            if (valorCondicion.getBooleano()) {
                //Visitar la sentencia que se debe hacer en caso de que sea verdadera
                if (ctx.sentencia(0) != null) {
                    visit(ctx.sentencia(0));
                }
            } else {
                //Si es falsa, se visita la sentencia del 'contrario' (si existe)
                if (ctx.sentencia(1) != null) {
                    visit(ctx.sentencia(1));
                }
            }
        } else {
            System.err.println("Error semántico: La condición debe ser un booleano.");
            try{
                outputWriter.write("Error semántico: La condición debe ser un booleano.\n");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        return null;
    }

    @Override
    public Nodo visitExpresion_num(GramaticaParser.Expresion_numContext ctx) {
        //Si es un número
        if (ctx.NUM() != null) {
            int valor = Integer.parseInt(ctx.NUM().getText());
            return new Nodo(valor);
        //Si es un identificador
        } else if (ctx.IDENTIFICADOR() != null) {
            String identificador = ctx.IDENTIFICADOR().getText();
            // Hay que revisar que haya sido declarado
            if (tablaSimbolos.containsKey(identificador)) {
                return tablaSimbolos.get(identificador);
            } else {
                System.err.println("Error semántico: Variable '" + identificador + "' no ha sido declarada");
                try{
                    outputWriter.write("Error semántico: Variable '" + identificador + "' no ha sido declarada.\n");
                } catch (IOException ex){
                    throw new RuntimeException(ex);
                }
                return null;
            }
        // Si tiene tres hijos es porque es una operación 
        } else if (ctx.getChildCount() == 3) {
            Nodo izquierda = visit(ctx.expresion_num(0));
            String operador = ctx.getChild(1).getText();
            Nodo derecha = visit(ctx.expresion_num(1));
            if(izquierda == null || derecha == null) return null;
            //Realizar la operación
            switch (operador) {
                case "+" -> {
                    return new Nodo(izquierda.getNumero() + derecha.getNumero());
                }
                case "-" -> {
                    return new Nodo(izquierda.getNumero() - derecha.getNumero());
                }
                case "*" -> {
                    return new Nodo(izquierda.getNumero() * derecha.getNumero());
                }
                case "/" -> {
                    return new Nodo(izquierda.getNumero() / derecha.getNumero());
                }
                default -> {
                    //Si no cae en ninguno de los casos anteriores
                    System.err.println("Error: Operador no válido");
                    return null;
                }
            }
        }
        return null;
    }

    @Override
    public Nodo visitExpresion_bool(GramaticaParser.Expresion_boolContext ctx) {
        //Si la expresión es directamente un booleano
        if (ctx.bool() != null) {
            String boolValue = ctx.bool().getText();
            return new Nodo(boolValue.equals("VERDADERO"));
            //Si es una variable (que debería ser booleana)
        } else if (ctx.IDENTIFICADOR() != null) {
            String identificador = ctx.IDENTIFICADOR().getText();
            //Se debe revisar que haya sido declarada
            if (tablaSimbolos.containsKey(identificador)) {
                Nodo varBooleana = tablaSimbolos.get(identificador);
                if (varBooleana.esBooleano()) {
                    return varBooleana;
                } else {
                    System.err.println("Error: Variable '" + identificador + "' no es booleana");
                    try{
                        outputWriter.write("Error: Variable '" + identificador + "' no es booleana\n");
                    } catch (IOException ex){
                        throw new RuntimeException(ex);
                    }
                    return null;
                }
            } else {
                //La variable no está en la tabla de símbolos
                System.err.println("Error semántico: Variable '" + identificador + "' no ha sido declarada");
                try{
                    outputWriter.write("Error semántico: Variable '" + identificador + "' no ha sido declarada\n");
                } catch (IOException ex){
                    throw new RuntimeException(ex);
                }
                return null;
            }
        } else if (ctx.getChildCount() == 3) {
            Nodo izquierdo = visit(ctx.expresion_bool(0));
            String operador = ctx.getChild(1).getText();
            Nodo derecho = visit(ctx.expresion_bool(1));
            switch (operador) {
                case "&&" -> {
                    return new Nodo(izquierdo.getBooleano() && derecho.getBooleano());
                }
                case "||" -> {
                    return new Nodo(izquierdo.getBooleano() || derecho.getBooleano());
                }
                case "==" -> {
                    return new Nodo(izquierdo.getBooleano() == derecho.getBooleano());
                }
                case "!=" -> {
                    return new Nodo(izquierdo.getBooleano() != derecho.getBooleano());
                }
                default -> {
                    return null;
                }
            }
        } else if(ctx.getChildCount() == 2) {
            String caracter = ctx.getChild(0).getText();
            Nodo derecho = visit(ctx.expresion_bool(0));
            if(caracter.equals("!") && derecho.esBooleano()){
                return new Nodo(!derecho.getBooleano());
            }
        }
        return null;
    }

}
