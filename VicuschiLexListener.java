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
}