// Generated from Vicuschi.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VicuschiParser}.
 */
public interface VicuschiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(VicuschiParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(VicuschiParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(VicuschiParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(VicuschiParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(VicuschiParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(VicuschiParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#import_declaration}.
	 * @param ctx the parse tree
	 */
	void enterImport_declaration(VicuschiParser.Import_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#import_declaration}.
	 * @param ctx the parse tree
	 */
	void exitImport_declaration(VicuschiParser.Import_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(VicuschiParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(VicuschiParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#arith_expr_1}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr_1(VicuschiParser.Arith_expr_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#arith_expr_1}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr_1(VicuschiParser.Arith_expr_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(VicuschiParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(VicuschiParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#term_a}.
	 * @param ctx the parse tree
	 */
	void enterTerm_a(VicuschiParser.Term_aContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#term_a}.
	 * @param ctx the parse tree
	 */
	void exitTerm_a(VicuschiParser.Term_aContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(VicuschiParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(VicuschiParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#factor_a}.
	 * @param ctx the parse tree
	 */
	void enterFactor_a(VicuschiParser.Factor_aContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#factor_a}.
	 * @param ctx the parse tree
	 */
	void exitFactor_a(VicuschiParser.Factor_aContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#r_arith}.
	 * @param ctx the parse tree
	 */
	void enterR_arith(VicuschiParser.R_arithContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#r_arith}.
	 * @param ctx the parse tree
	 */
	void exitR_arith(VicuschiParser.R_arithContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#arith_id}.
	 * @param ctx the parse tree
	 */
	void enterArith_id(VicuschiParser.Arith_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#arith_id}.
	 * @param ctx the parse tree
	 */
	void exitArith_id(VicuschiParser.Arith_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#arith_number}.
	 * @param ctx the parse tree
	 */
	void enterArith_number(VicuschiParser.Arith_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#arith_number}.
	 * @param ctx the parse tree
	 */
	void exitArith_number(VicuschiParser.Arith_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(VicuschiParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(VicuschiParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(VicuschiParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(VicuschiParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#declaration_params}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_params(VicuschiParser.Declaration_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#declaration_params}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_params(VicuschiParser.Declaration_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(VicuschiParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(VicuschiParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#attributed}.
	 * @param ctx the parse tree
	 */
	void enterAttributed(VicuschiParser.AttributedContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#attributed}.
	 * @param ctx the parse tree
	 */
	void exitAttributed(VicuschiParser.AttributedContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterAttribution(VicuschiParser.AttributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitAttribution(VicuschiParser.AttributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(VicuschiParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(VicuschiParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#decrement}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(VicuschiParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#decrement}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(VicuschiParser.DecrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(VicuschiParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(VicuschiParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#if_declaration}.
	 * @param ctx the parse tree
	 */
	void enterIf_declaration(VicuschiParser.If_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#if_declaration}.
	 * @param ctx the parse tree
	 */
	void exitIf_declaration(VicuschiParser.If_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#while_declaration}.
	 * @param ctx the parse tree
	 */
	void enterWhile_declaration(VicuschiParser.While_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#while_declaration}.
	 * @param ctx the parse tree
	 */
	void exitWhile_declaration(VicuschiParser.While_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#for_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFor_declaration(VicuschiParser.For_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#for_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFor_declaration(VicuschiParser.For_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expr(VicuschiParser.Logic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expr(VicuschiParser.Logic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#logic_expr_1}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expr_1(VicuschiParser.Logic_expr_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#logic_expr_1}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expr_1(VicuschiParser.Logic_expr_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#logic_term}.
	 * @param ctx the parse tree
	 */
	void enterLogic_term(VicuschiParser.Logic_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#logic_term}.
	 * @param ctx the parse tree
	 */
	void exitLogic_term(VicuschiParser.Logic_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#logic_term_a}.
	 * @param ctx the parse tree
	 */
	void enterLogic_term_a(VicuschiParser.Logic_term_aContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#logic_term_a}.
	 * @param ctx the parse tree
	 */
	void exitLogic_term_a(VicuschiParser.Logic_term_aContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#r_logic}.
	 * @param ctx the parse tree
	 */
	void enterR_logic(VicuschiParser.R_logicContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#r_logic}.
	 * @param ctx the parse tree
	 */
	void exitR_logic(VicuschiParser.R_logicContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#not_id}.
	 * @param ctx the parse tree
	 */
	void enterNot_id(VicuschiParser.Not_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#not_id}.
	 * @param ctx the parse tree
	 */
	void exitNot_id(VicuschiParser.Not_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#integer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInteger_declaration(VicuschiParser.Integer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#integer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInteger_declaration(VicuschiParser.Integer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#float_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFloat_declaration(VicuschiParser.Float_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#float_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFloat_declaration(VicuschiParser.Float_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#string_declaration}.
	 * @param ctx the parse tree
	 */
	void enterString_declaration(VicuschiParser.String_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#string_declaration}.
	 * @param ctx the parse tree
	 */
	void exitString_declaration(VicuschiParser.String_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#boolean_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_declaration(VicuschiParser.Boolean_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#boolean_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_declaration(VicuschiParser.Boolean_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#declaration_attribution}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_attribution(VicuschiParser.Declaration_attributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#declaration_attribution}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_attribution(VicuschiParser.Declaration_attributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#integer_array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInteger_array_declaration(VicuschiParser.Integer_array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#integer_array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInteger_array_declaration(VicuschiParser.Integer_array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#float_array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFloat_array_declaration(VicuschiParser.Float_array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#float_array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFloat_array_declaration(VicuschiParser.Float_array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#string_array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterString_array_declaration(VicuschiParser.String_array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#string_array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitString_array_declaration(VicuschiParser.String_array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#boolean_array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_array_declaration(VicuschiParser.Boolean_array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#boolean_array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_array_declaration(VicuschiParser.Boolean_array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#generic_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_declaration(VicuschiParser.Generic_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#generic_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_declaration(VicuschiParser.Generic_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#generic_array}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_array(VicuschiParser.Generic_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#generic_array}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_array(VicuschiParser.Generic_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#generic_array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_array_declaration(VicuschiParser.Generic_array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#generic_array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_array_declaration(VicuschiParser.Generic_array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#generic_attribution}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_attribution(VicuschiParser.Generic_attributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#generic_attribution}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_attribution(VicuschiParser.Generic_attributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(VicuschiParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(VicuschiParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VicuschiParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(VicuschiParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(VicuschiParser.ComparatorContext ctx);
}