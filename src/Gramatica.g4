grammar Gramatica;

//Reglas de producción
programa : sentencia ';';

sentencia : asignacion
         | condicional
         | sentencia ';' sentencia
         | dec_funcion
         | llamar_funcion;

asignacion : IDENTIFICADOR ':=' expresion;

condicional : SI '(' expresion_bool ')' '{' sentencia '}' (CONTRARIO '{' sentencia '}')?;

expresion : expresion_bool | expresion_num;

expresion_num : NUM
             | '(' expresion_num ')'
             | expresion_num ('*' | '/') expresion_num
             | expresion_num ('+' | '-') expresion_num
             | IDENTIFICADOR;


expresion_bool : bool
              | '(' expresion_bool ')'
              | '!' expresion_bool
              | expresion_bool operador_bool expresion_bool
              | IDENTIFICADOR
              | expresion_num igualdad expresion_num
              | expresion_bool igualdad expresion_bool
              | expresion_num comparacion expresion_num
              | llamar_funcion;

operador_bool : '&&' | '||';

bool : VERDADERO | FALSO;

igualdad : '==' | '!=';

comparacion : '>' | '>=' | '<' | '<=';

dec_funcion : FUNCION IDENTIFICADOR '(' parametros ')' '{' sentencia RETORNAR expresion '}';

llamar_funcion : IDENTIFICADOR '(' argumentos ')';

parametros : IDENTIFICADOR (',' parametros)?;

argumentos : expresion (',' argumentos)?;

//Tokens
NUM : [0-9]+;
IDENTIFICADOR : [a-z]+;
SI : 'si';
CONTRARIO : 'contrario';
FUNCION : 'funcion';
RETORNAR : 'retornar';
VERDADERO : 'verdadero';
FALSO : 'falso';
ESPACIOS : [ \t\r\n]+ -> skip; // Ignorar espacios en blanco
