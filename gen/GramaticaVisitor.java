// Generated from C:/Users/anamo/IdeaProjects/miCompilador/src/Gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(GramaticaParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(GramaticaParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(GramaticaParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(GramaticaParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expresion_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_num(GramaticaParser.Expresion_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expresion_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_bool(GramaticaParser.Expresion_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#operador_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_bool(GramaticaParser.Operador_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(GramaticaParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#igualdad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualdad(GramaticaParser.IgualdadContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(GramaticaParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#dec_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_funcion(GramaticaParser.Dec_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#llamar_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamar_funcion(GramaticaParser.Llamar_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(GramaticaParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(GramaticaParser.ArgumentosContext ctx);
}