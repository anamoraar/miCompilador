//Clase genérica que representa los nodos de diferentes partes de la gramática
//Referencia: https://github.com/bkiers/Mu/blob/master/src/main/java/mu/Value.java
public class Nodo {
    //Contenido del nodo
    private final Object valor;
    //Constructor
    public Nodo(Object valor){
        this.valor = valor;
    }
    //Getter del valor
    public Object getValor(){
        return this.valor;
    }
    //Retorna true si el nodo es un número y false de lo contrario
    public boolean esNumero(){
        return this.valor instanceof Integer;
    }
    //Retorna true si el nodo es un booleano y false de lo contrario
    public boolean esBooleano(){
        return this.valor instanceof Boolean;
    }

    //Retorna el valor en entero de un nodo de tipo número
    public Integer getNumero(){
        return (Integer) this.valor;
    }

    //Retorna el valor en booleano de un nodo de tipo boolean
    public Boolean getBooleano(){
        return (Boolean) this.valor;
    }

    public boolean esIgual(Nodo otroNodo){
        return this.valor.equals(otroNodo.getValor());
    }
}
