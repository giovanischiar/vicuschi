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
	 * Enter a parse tree produced by {@link VicuschiLexParser#generic_attribuition}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_attribuition(VicuschiLexParser.Generic_attribuitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VicuschiLexParser#generic_attribuition}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_attribuition(VicuschiLexParser.Generic_attribuitionContext ctx);
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