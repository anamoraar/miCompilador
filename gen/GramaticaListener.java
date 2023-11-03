// Generated from C:/Users/anamo/IdeaProjects/miCompilador/src/Gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(GramaticaParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(GramaticaParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(GramaticaParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(GramaticaParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(GramaticaParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(GramaticaParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(GramaticaParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(GramaticaParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expresion_num}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_num(GramaticaParser.Expresion_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expresion_num}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_num(GramaticaParser.Expresion_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expresion_bool}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_bool(GramaticaParser.Expresion_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expresion_bool}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_bool(GramaticaParser.Expresion_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operador_bool}.
	 * @param ctx the parse tree
	 */
	void enterOperador_bool(GramaticaParser.Operador_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operador_bool}.
	 * @param ctx the parse tree
	 */
	void exitOperador_bool(GramaticaParser.Operador_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(GramaticaParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(GramaticaParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#igualdad}.
	 * @param ctx the parse tree
	 */
	void enterIgualdad(GramaticaParser.IgualdadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#igualdad}.
	 * @param ctx the parse tree
	 */
	void exitIgualdad(GramaticaParser.IgualdadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(GramaticaParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(GramaticaParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#dec_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDec_funcion(GramaticaParser.Dec_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#dec_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDec_funcion(GramaticaParser.Dec_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#llamar_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamar_funcion(GramaticaParser.Llamar_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#llamar_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamar_funcion(GramaticaParser.Llamar_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(GramaticaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(GramaticaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(GramaticaParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(GramaticaParser.ArgumentosContext ctx);
}