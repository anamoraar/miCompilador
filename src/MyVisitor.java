import java.util.Map;
import java.util.HashMap;


public class MyVisitor extends GramaticaBaseVisitor<Nodo>{

    //Almacena las variables
    private Map<String, Nodo> tablaSimbolos = new HashMap<String, Nodo>();

    public void printTabla(){
        for(Map.Entry<String, Nodo> simbs : tablaSimbolos.entrySet()){
            Nodo nodo = simbs.getValue();
            String valor = "";
            if(nodo.esNumero()) valor += nodo.getNumero();
            else valor += nodo.getBooleano();
            System.out.println(simbs.getKey() + " = " + valor);
        }
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
        if (valorCondicion.esBooleano()) {
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
                return null;
            }
        // Si tiene tres hijos es porque es una operación 
        } else if (ctx.getChildCount() == 3) {
            Nodo izquierda = visit(ctx.expresion_num(0));
            String operador = ctx.getChild(1).getText();
            Nodo derecha = visit(ctx.expresion_num(1));
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
                    System.err.println("Error semántico: Variable '" + identificador + "' no es booleana");
                    return null;
                }
            } else {
                //La variable no está en la tabla de símbolos
                System.err.println("Error semántico: Variable '" + identificador + "' no ha sido declarada");
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
                    //Si no cae en ninguno de los casos anteriores
                    System.err.println("Error: Operador no válido");
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
