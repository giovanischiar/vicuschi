// Generated from VicuschiLex.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VicuschiLexParser}.
 */
public interface VicuschiLexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(VicuschiLexParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(VicuschiLexParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(VicuschiLexParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(VicuschiLexParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(VicuschiLexParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(VicuschiLexParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(VicuschiLexParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(VicuschiLexParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#arith_expr_1}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr_1(VicuschiLexParser.Arith_expr_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#arith_expr_1}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr_1(VicuschiLexParser.Arith_expr_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(VicuschiLexParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(VicuschiLexParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#term_a}.
	 * @param ctx the parse tree
	 */
	void enterTerm_a(VicuschiLexParser.Term_aContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#term_a}.
	 * @param ctx the parse tree
	 */
	void exitTerm_a(VicuschiLexParser.Term_aContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(VicuschiLexParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(VicuschiLexParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#factor_a}.
	 * @param ctx the parse tree
	 */
	void enterFactor_a(VicuschiLexParser.Factor_aContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#factor_a}.
	 * @param ctx the parse tree
	 */
	void exitFactor_a(VicuschiLexParser.Factor_aContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#r_arith}.
	 * @param ctx the parse tree
	 */
	void enterR_arith(VicuschiLexParser.R_arithContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#r_arith}.
	 * @param ctx the parse tree
	 */
	void exitR_arith(VicuschiLexParser.R_arithContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(VicuschiLexParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(VicuschiLexParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(VicuschiLexParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(VicuschiLexParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#declaration_params}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_params(VicuschiLexParser.Declaration_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#declaration_params}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_params(VicuschiLexParser.Declaration_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(VicuschiLexParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(VicuschiLexParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#attributed}.
	 * @param ctx the parse tree
	 */
	void enterAttributed(VicuschiLexParser.AttributedContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#attributed}.
	 * @param ctx the parse tree
	 */
	void exitAttributed(VicuschiLexParser.AttributedContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterAttribution(VicuschiLexParser.AttributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitAttribution(VicuschiLexParser.AttributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(VicuschiLexParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(VicuschiLexParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#decrement}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(VicuschiLexParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#decrement}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(VicuschiLexParser.DecrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(VicuschiLexParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(VicuschiLexParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#if_declaration}.
	 * @param ctx the parse tree
	 */
	void enterIf_declaration(VicuschiLexParser.If_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#if_declaration}.
	 * @param ctx the parse tree
	 */
	void exitIf_declaration(VicuschiLexParser.If_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#while_declaration}.
	 * @param ctx the parse tree
	 */
	void enterWhile_declaration(VicuschiLexParser.While_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#while_declaration}.
	 * @param ctx the parse tree
	 */
	void exitWhile_declaration(VicuschiLexParser.While_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#for_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFor_declaration(VicuschiLexParser.For_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#for_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFor_declaration(VicuschiLexParser.For_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expr(VicuschiLexParser.Logic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expr(VicuschiLexParser.Logic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#logic_factor}.
	 * @param ctx the parse tree
	 */
	void enterLogic_factor(VicuschiLexParser.Logic_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#logic_factor}.
	 * @param ctx the parse tree
	 */
	void exitLogic_factor(VicuschiLexParser.Logic_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#logic_factor_1}.
	 * @param ctx the parse tree
	 */
	void enterLogic_factor_1(VicuschiLexParser.Logic_factor_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#logic_factor_1}.
	 * @param ctx the parse tree
	 */
	void exitLogic_factor_1(VicuschiLexParser.Logic_factor_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#not_id}.
	 * @param ctx the parse tree
	 */
	void enterNot_id(VicuschiLexParser.Not_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#not_id}.
	 * @param ctx the parse tree
	 */
	void exitNot_id(VicuschiLexParser.Not_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#integer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInteger_declaration(VicuschiLexParser.Integer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#integer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInteger_declaration(VicuschiLexParser.Integer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#float_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFloat_declaration(VicuschiLexParser.Float_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#float_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFloat_declaration(VicuschiLexParser.Float_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#string_declaration}.
	 * @param ctx the parse tree
	 */
	void enterString_declaration(VicuschiLexParser.String_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#string_declaration}.
	 * @param ctx the parse tree
	 */
	void exitString_declaration(VicuschiLexParser.String_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#boolean_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_declaration(VicuschiLexParser.Boolean_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#boolean_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_declaration(VicuschiLexParser.Boolean_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#declaration_attribution}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_attribution(VicuschiLexParser.Declaration_attributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#declaration_attribution}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_attribution(VicuschiLexParser.Declaration_attributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#integer_array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInteger_array_declaration(VicuschiLexParser.Integer_array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#integer_array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInteger_array_declaration(VicuschiLexParser.Integer_array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#float_array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFloat_array_declaration(VicuschiLexParser.Float_array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#float_array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFloat_array_declaration(VicuschiLexParser.Float_array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#string_array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterString_array_declaration(VicuschiLexParser.String_array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#string_array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitString_array_declaration(VicuschiLexParser.String_array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#boolean_array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_array_declaration(VicuschiLexParser.Boolean_array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#boolean_array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_array_declaration(VicuschiLexParser.Boolean_array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#generic_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_declaration(VicuschiLexParser.Generic_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#generic_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_declaration(VicuschiLexParser.Generic_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#generic_array}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_array(VicuschiLexParser.Generic_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#generic_array}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_array(VicuschiLexParser.Generic_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#generic_array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_array_declaration(VicuschiLexParser.Generic_array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#generic_array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_array_declaration(VicuschiLexParser.Generic_array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#generic_attribution}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_attribution(VicuschiLexParser.Generic_attributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#generic_attribution}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_attribution(VicuschiLexParser.Generic_attributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(VicuschiLexParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(VicuschiLexParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiLexParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(VicuschiLexParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(VicuschiLexParser.ComparatorContext ctx);
}