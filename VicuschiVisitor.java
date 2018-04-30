// Generated from Vicuschi.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VicuschiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VicuschiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(VicuschiParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(VicuschiParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(VicuschiParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#import_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_declaration(VicuschiParser.Import_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expr(VicuschiParser.Arith_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#arith_expr_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expr_1(VicuschiParser.Arith_expr_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(VicuschiParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#term_a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_a(VicuschiParser.Term_aContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(VicuschiParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#factor_a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_a(VicuschiParser.Factor_aContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#r_arith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_arith(VicuschiParser.R_arithContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#arith_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_id(VicuschiParser.Arith_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#arith_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_number(VicuschiParser.Arith_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(VicuschiParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(VicuschiParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#declaration_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_params(VicuschiParser.Declaration_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(VicuschiParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#attributed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributed(VicuschiParser.AttributedContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#attribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribution(VicuschiParser.AttributionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(VicuschiParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(VicuschiParser.DecrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(VicuschiParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#if_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_declaration(VicuschiParser.If_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#while_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_declaration(VicuschiParser.While_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#for_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_declaration(VicuschiParser.For_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_expr(VicuschiParser.Logic_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#logic_expr_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_expr_1(VicuschiParser.Logic_expr_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#logic_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_term(VicuschiParser.Logic_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#logic_term_a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_term_a(VicuschiParser.Logic_term_aContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#r_logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_logic(VicuschiParser.R_logicContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#not_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_id(VicuschiParser.Not_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#integer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_declaration(VicuschiParser.Integer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#float_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_declaration(VicuschiParser.Float_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#string_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_declaration(VicuschiParser.String_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#boolean_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_declaration(VicuschiParser.Boolean_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#declaration_attribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_attribution(VicuschiParser.Declaration_attributionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#integer_array_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_array_declaration(VicuschiParser.Integer_array_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#float_array_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_array_declaration(VicuschiParser.Float_array_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#string_array_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_array_declaration(VicuschiParser.String_array_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#boolean_array_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_array_declaration(VicuschiParser.Boolean_array_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#generic_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_declaration(VicuschiParser.Generic_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#generic_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_array(VicuschiParser.Generic_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#generic_array_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_array_declaration(VicuschiParser.Generic_array_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#generic_attribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_attribution(VicuschiParser.Generic_attributionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(VicuschiParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link VicuschiParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(VicuschiParser.ComparatorContext ctx);
}