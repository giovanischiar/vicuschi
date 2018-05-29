import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

public class ANTLRVicuschiListener extends VicuschiBaseListener {
	private ArrayList<HashMap<String, Attribute>> scopeTables = new ArrayList<>();

	private Map<ParserRuleContext, Integer> scope = new HashMap<>();
	
	private Map<String, ParserRuleContext> nodeTable = new HashMap<>();

	private Map<ParserRuleContext, String> actualType = new HashMap<>();

	@Override public void enterProgram(VicuschiParser.ProgramContext ctx) { 
		HashMap<String, Attribute> rootAttributeTable = new HashMap<>();
		scopeTables.add(rootAttributeTable);
		scope.put(ctx, 0);
	}

	@Override public void exitProgram(VicuschiParser.ProgramContext ctx) {
		//System.out.println(attributeTable);
		System.out.println(scopeTables);
	}

	@Override public void enterStmt(VicuschiParser.StmtContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}

	@Override public void enterSimple_stmt(VicuschiParser.Simple_stmtContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}

	@Override public void enterGeneric_declaration(VicuschiParser.Generic_declarationContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}

	@Override public void enterGeneric_unary_declaration(VicuschiParser.Generic_unary_declarationContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}

	@Override public void enterString_declaration(VicuschiParser.String_declarationContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	
	@Override public void enterInteger_declaration(VicuschiParser.Integer_declarationContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}

	@Override public void enterFloat_declaration(VicuschiParser.Float_declarationContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}

	@Override public void enterBoolean_declaration(VicuschiParser.Boolean_declarationContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}

	@Override public void enterGeneric_array_declaration(VicuschiParser.Generic_array_declarationContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	@Override public void enterDeclaration_attribution(VicuschiParser.Declaration_attributionContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	@Override public void enterGeneric_attribution(VicuschiParser.Generic_attributionContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	@Override public void enterAttribution_id(VicuschiParser.Attribution_idContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	@Override public void enterAttribution_array(VicuschiParser.Attribution_arrayContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	@Override public void enterAttribution(VicuschiParser.AttributionContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}

	@Override public void enterAttributed(VicuschiParser.AttributedContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}

	@Override public void enterUnary_expression(VicuschiParser.Unary_expressionContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	@Override public void enterDecrement(VicuschiParser.DecrementContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}

	@Override public void enterIncrement(VicuschiParser.IncrementContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}

	@Override public void enterLogic_expr(VicuschiParser.Logic_exprContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	@Override public void enterLogic_expr_1(VicuschiParser.Logic_expr_1Context ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	@Override public void enterLogic_term(VicuschiParser.Logic_termContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}	
	@Override public void enterLogic_term_a(VicuschiParser.Logic_term_aContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	@Override public void enterR_logic(VicuschiParser.R_logicContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	@Override public void enterFunction_call(VicuschiParser.Function_callContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	@Override public void enterParams(VicuschiParser.ParamsContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	@Override public void enterArith_expr(VicuschiParser.Arith_exprContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	@Override public void enterArith_expr_1(VicuschiParser.Arith_expr_1Context ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	@Override public void enterTerm(VicuschiParser.TermContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}	
	@Override public void enterTerm_a(VicuschiParser.Term_aContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	@Override public void enterFactor(VicuschiParser.FactorContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}	
	@Override public void enterFactor_a(VicuschiParser.Factor_aContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	@Override public void enterR_arith(VicuschiParser.R_arithContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	@Override public void enterArith_id(VicuschiParser.Arith_idContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}

	@Override public void enterRet_stmt(VicuschiParser.Ret_stmtContext ctx) { 
		scope.put(ctx, scope.get(ctx.getParent()));
		//System.out.println("Stmt symbolTable: "+scope.get(ctx));
	}
	
	@Override public void enterFunction_declaration(VicuschiParser.Function_declarationContext ctx) { 
		String type = ctx.getChild(0).getChild(0).getChild(0).getText();
		Attribute<?> attribute;
		switch (type) {
			case "int":
				attribute = new Attribute<Integer>();
				break;
			case "float":
				attribute = new Attribute<Float>();
				break;
			case "string":
				attribute = new Attribute<String>();
				break;
			default:
				attribute = new Attribute<Boolean>();
		}

		String id_name = ctx.getChild(0).getChild(0).getChild(1).getText();


		HashMap<String, Attribute> parentAttTable = scopeTables.get(scope.get(ctx.getParent()));

		int nparams = 0;
		VicuschiParser.Declaration_paramsContext param = ctx.declaration_params();
		if (param != null){
			List<VicuschiParser.Generic_declarationContext> params = param.generic_declaration();
			if (params != null){
				nparams = params.size();
			}
		}

		attribute.nparams = nparams;
		attribute.name = id_name;
		attribute.type = type;
		attribute.hasValue = true;
		attribute.scope = scope.get(ctx.getParent());

		parentAttTable.put(attribute.name, attribute);
		//parentAttTable.put();

		HashMap<String, Attribute> localAttributeTable = new HashMap<>();
		localAttributeTable.put(attribute.name, attribute);

		for(String key : parentAttTable.keySet()) {
			localAttributeTable.put(key, parentAttTable.get(key));
		}

		scopeTables.add(localAttributeTable);

		scope.put(ctx, scopeTables.lastIndexOf(localAttributeTable));

	}

	@Override public void enterWhile_declaration(VicuschiParser.While_declarationContext ctx) { 
		
		HashMap<String, Attribute> parentAttTable = scopeTables.get(scope.get(ctx.getParent()));
		//parentAttTable.put();

		HashMap<String, Attribute> localAttributeTable = new HashMap<>();

		for(String key : parentAttTable.keySet()) {
			localAttributeTable.put(key, parentAttTable.get(key));
		}
		
		scopeTables.add(localAttributeTable);

		scope.put(ctx, scopeTables.lastIndexOf(localAttributeTable));
		
	}

	@Override public void enterFor_declaration(VicuschiParser.For_declarationContext ctx) { 
		
		HashMap<String, Attribute> parentAttTable = scopeTables.get(scope.get(ctx.getParent()));
		//parentAttTable.put();

		HashMap<String, Attribute> localAttributeTable = new HashMap<>();

		for(String key : parentAttTable.keySet()) {
			localAttributeTable.put(key, parentAttTable.get(key));
		}
		
		scopeTables.add(localAttributeTable);

		scope.put(ctx, scopeTables.lastIndexOf(localAttributeTable));
		
		Attribute<Integer> attribute = new Attribute<>();

		if(ctx.ID() != null) {
			String id = ctx.ID().getText();
			attribute.name = id;
			attribute.type = "int";
			attribute.maxValue = null;
			attribute.hasValue = true;
			attribute.scope = scope.get(ctx);
		}

		VicuschiParser.Inclusive_intervalContext inclusiveInterval  = ctx.interval().inclusive_interval();
		VicuschiParser.NonInclusive_intervalContext nonInclusiveInterval  = ctx.interval().nonInclusive_interval();

		if(inclusiveInterval != null) {
			attribute.value = Integer.parseInt(inclusiveInterval.INT_NUMBER().get(0).getText());
			attribute.maxValue = Integer.parseInt(inclusiveInterval.INT_NUMBER().get(1).getText());
		} else {
			// is noninclusiveInterval
			attribute.value = Integer.parseInt(nonInclusiveInterval.INT_NUMBER().get(0).getText());
			attribute.maxValue = Integer.parseInt(nonInclusiveInterval.INT_NUMBER().get(1).getText())-1;
		}

		if(localAttributeTable.containsKey(attribute.name)) {
			System.out.println("Warning: redeclaration of variable " + attribute.name + " at " + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine());
		}

		localAttributeTable.put(attribute.name, attribute);
		addAttributeAtNodeTable(attribute.name, ctx);
	}

	@Override public void enterIf_declaration(VicuschiParser.If_declarationContext ctx) { 
		
		HashMap<String, Attribute> parentAttTable = scopeTables.get(scope.get(ctx.getParent()));
		//parentAttTable.put();

		HashMap<String, Attribute> localAttributeTable = new HashMap<>();

		for(String key : parentAttTable.keySet()) {
			localAttributeTable.put(key, parentAttTable.get(key));
		}

		scopeTables.add(localAttributeTable);

		scope.put(ctx, scopeTables.lastIndexOf(localAttributeTable));
		
	}
	
	@Override
	public void enterDeclaration_params(VicuschiParser.Declaration_paramsContext ctx){
		scope.put(ctx, scope.get(ctx.getParent()));
	}

	@Override public void exitGeneric_declaration(VicuschiParser.Generic_declarationContext ctx) {	
		String id_name = ctx.getChild(0).getChild(0).getChild(1).getText();
		if(ctx.getChild(0).getChild(0).getChild(1) instanceof VicuschiParser.Generic_arrayContext) {
			//id_name = ctx.getChild(0).getChild(0).getChild(1).getChild(1).getChild(1).getText();
			id_name = ctx.getChild(0).getChild(0).getChild(1).getChild(0).getText();
		}
		
		addAttributeAtNodeTable(id_name, ctx);
	}

	@Override public void exitGeneric_attribution(VicuschiParser.Generic_attributionContext ctx) {	
		Map<String, Attribute> localAttributeTable = scopeTables.get(scope.get(ctx));

		// buscamos o tipo pelo qual a variavel foi declarada

		String id_name = "";
		VicuschiParser.AttributionContext attribution;
		if (ctx.attribution_id() != null){
			id_name = ctx.attribution_id().ID().getText();
			attribution = ctx.attribution_id().attribution();
		} else { // atribuicao de array
			id_name = ctx.attribution_array().generic_array().ID().getText();
			attribution = ctx.attribution_array().attribution();
		}


		Attribute a = localAttributeTable.get(id_name);

		
		typeComparation(attribution, a);
	}

	public void typeComparation(VicuschiParser.AttributionContext ctx, Attribute a) {
		actualType.put(ctx, a.type);

		// agora buscamos o tipo de seu neto "attribution", para comparacao
		String expected_type = actualType.get(ctx);

		if(!a.type.equals(expected_type)) {
			System.out.println("Error: cannot assign " + expected_type + " to " + a.type);
		} else {
			a.hasValue = true;
		}
	}

	@Override
	public void exitDeclaration_attribution(VicuschiParser.Declaration_attributionContext ctx) {
		Map<String, Attribute> localAttributeTable = scopeTables.get(scope.get(ctx));

		String id_name = ctx.getChild(0).getChild(0).getChild(0).getChild(1).getText();
		addAttributeAtNodeTable(id_name, ctx);
		Attribute a = localAttributeTable.get(id_name);
		typeComparation(ctx.attribution(), a);
	}

	private void addAttributeAtNodeTable(String id, ParserRuleContext ctx) {
		Map<String, Attribute> localAttributeTable = scopeTables.get(scope.get(ctx));
		//System.out.println(attributeTable);
		if(localAttributeTable.containsKey(id)) {
			Attribute a = localAttributeTable.get(id);
			nodeTable.put(a.name, ctx);
		} else {
			System.out.println("Error: variable " + id + " doesn't exist at  symbol table (failed to be declared)");
		}
	}
	@Override public void exitAttribution(VicuschiParser.AttributionContext ctx) {
		String expected_type = actualType.get(ctx.attributed());

		actualType.put(ctx, expected_type);
		//addAttributeAtNodeTable(id, ctx);
	}

	@Override public void exitAttributed(VicuschiParser.AttributedContext ctx) {
		Map<String, Attribute> localAttributeTable = scopeTables.get(scope.get(ctx));
		//String expected_type = actualType.get(ctx.attributed());

		String expected_type = "my fluffy type";

		if(ctx.literal() != null) {
			expected_type = actualType.get(ctx.literal());
		} else if (ctx.ID() != null){
			String id = ctx.ID().getText();
			if(!localAttributeTable.containsKey(id)) {
				System.out.println("Error: variable " + id + " at " + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine()+ " doesn't exist at symbol table (failed to be declared)");
				return;
			}

			if(!localAttributeTable.get(id).hasValue) {
				System.out.println("Error: variable " + id + " at " + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine()+ " declared but has no value");
				return;
			}
			expected_type = localAttributeTable.get(ctx.ID().getText()).type;
			
		} else if(ctx.unary_expression() != null) {
			expected_type = actualType.get(ctx.unary_expression());
		} else if(ctx.logic_expr() != null) {
			expected_type = actualType.get(ctx.logic_expr());
		} else if(ctx.function_call() != null) {
			expected_type = actualType.get(ctx.function_call());
		} else {
			expected_type = actualType.get(ctx.arith_expr());
		}

		//System.out.println(expected_type);

		actualType.put(ctx, expected_type);
		//addAttributeAtNodeTable(id, ctx);
	}

	@Override public void exitLiteral(VicuschiParser.LiteralContext ctx) {
		String expected_type = "";

		if(ctx.ARRAY() != null) {
			expected_type = "array";
		} else if(ctx.INT_NUMBER() != null) {
			expected_type = "int";
		} else if(ctx.FLOAT_NUMBER() != null) {
			expected_type = "float";
		} else if(ctx.WORD() != null) {
			expected_type = "string";
		} else {
			expected_type = "boolean";
		}
		actualType.put(ctx, expected_type);
	}

	@Override public void exitFunction_call(VicuschiParser.Function_callContext ctx) {
		// if(!scopeTables.contains(scope.get(ctx))) {
		// 	System.out.println("Erro desconhecido");
		// 	return;
		// }

		Map<String, Attribute> localAttributeTable = scopeTables.get(scope.get(ctx.getParent()));
		String id = ctx.ID().getText();
		//System.out.println("tabela de "+id+" : \n"+localAttributeTable);


		if(!localAttributeTable.containsKey(id)) {
			System.out.println("Error: variable " + id + " at " + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine()+ " doesn't exist at symbol table (failed to be declared)");
			return;
		}

		Attribute attribute = localAttributeTable.get(id);
		System.out.println("attribute: " + attribute);

		Integer nparams = 0;
		if(ctx.params() != null) {
			nparams = ctx.params().attributed().size();
			//System.out.println(nparams);
		}
		if(nparams != attribute.nparams) {
			System.out.println("Error: number of parameters in function " + id + " at " +ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine()+ " doesn't match (encountered " +  nparams + ", expect " + attribute.nparams + ")");
		}
	}

	@Override public void exitUnary_expression(VicuschiParser.Unary_expressionContext ctx) {
		Map<String, Attribute> localAttributeTable = scopeTables.get(scope.get(ctx.getParent()));

		String expected_type = "";
		if(ctx.decrement() != null) {
			String id = ctx.decrement().ID().getText();
			if(!localAttributeTable.containsKey(id)) {
				System.out.println("Error: variable " + id + " at " + ctx.decrement().ID().getSymbol().getLine() + ":" + ctx.decrement().ID().getSymbol().getCharPositionInLine()+ " doesn't exist at symbol table (failed to be declared)");
				return;
			}

			if(!localAttributeTable.get(id).hasValue) {
				System.out.println("Error: variable " + id + " at " + ctx.decrement().ID().getSymbol().getLine() + ":" + ctx.decrement().ID().getSymbol().getCharPositionInLine()+ " declared but has no value");
				return;
			}

			expected_type = localAttributeTable.get(id).type;
		} else if(ctx.increment() != null) {
			String id = ctx.increment().ID().getText();
			if(!localAttributeTable.containsKey(id)) {
				System.out.println("Error: variable " + id + " at " + ctx.increment().ID().getSymbol().getLine() + ":" + ctx.increment().ID().getSymbol().getCharPositionInLine()+ " doesn't exist at symbol table (failed to be declared)");
				return;
			}

			if(!localAttributeTable.get(id).hasValue) {
				System.out.println("Error: variable " + id + " at " + ctx.increment().ID().getSymbol().getLine() + ":" + ctx.increment().ID().getSymbol().getCharPositionInLine()+ " declared but has no value");
				return;
			}

			expected_type = localAttributeTable.get(id).type;
		} else {
			String id = ctx.not_id().ID().getText();
			if(!localAttributeTable.containsKey(id)) {
				System.out.println("Error: variable " + id + " at " + ctx.not_id().ID().getSymbol().getLine() + ":" + ctx.not_id().ID().getSymbol().getCharPositionInLine()+ " doesn't exist at symbol table (failed to be declared)");
				return;
			}

			if(!localAttributeTable.get(id).hasValue) {
				System.out.println("Error: variable " + id + " at " + ctx.not_id().ID().getSymbol().getLine() + ":" + ctx.not_id().ID().getSymbol().getCharPositionInLine()+ " declared but has no value");
				return;
			}

			expected_type = localAttributeTable.get(id).type;
		}
		actualType.put(ctx, expected_type);
	}

	@Override public void exitGeneric_unary_declaration(VicuschiParser.Generic_unary_declarationContext ctx) {
		String id = ctx.getChild(0).getChild(1).getText();
		//System.out.println("generic_unary_declaration: "+id);
		addAttributeAtNodeTable(id, ctx);
		//System.out.println("tipo passado para cima: "+a.type);
		//System.out.println("generic_unary_declaration: "+id+". Nodo: "+ctx);
	}

	@Override public void exitString_declaration(VicuschiParser.String_declarationContext ctx) {
		Map<String, Attribute> localAttributeTable = scopeTables.get(scope.get(ctx.getParent()));
		//System.out.println("tabela de "+ctx.ID().getText()+" : \n"+localAttributeTable);

		Attribute<String> attribute = new Attribute<>();
		attribute.name = ctx.ID().getText();
		attribute.type = "string";
		attribute.value = null;
		attribute.scope = scope.get(ctx.getParent());

		boolean isDeclarationParams = ctx.getParent().getParent().getParent() instanceof VicuschiParser.Declaration_paramsContext;
		boolean isFunction = ctx.getParent().getParent() instanceof VicuschiParser.Function_declarationContext;
		if(localAttributeTable.containsKey(attribute.name) && !isDeclarationParams && !isFunction) {
			System.out.println("Warning: redeclaration of variable " + attribute.name + " at " + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine());
		}

		if(isDeclarationParams) {
			attribute.hasValue = true;
		}
		
		if(!isFunction) {
			localAttributeTable.put(attribute.name, attribute);
		}
		nodeTable.put(attribute.name, ctx);
	}

	@Override public void exitInteger_declaration(VicuschiParser.Integer_declarationContext ctx) { 
		Map<String, Attribute> localAttributeTable = scopeTables.get(scope.get(ctx.getParent()));
		//System.out.println("tabela de "+ctx.ID().getText()+" : \n"+localAttributeTable);

		Attribute<Integer> attribute = new Attribute<>();
		attribute.name = ctx.ID().getText();
		attribute.type = "int";
		attribute.value = null;
		attribute.scope = scope.get(ctx.getParent());

		boolean isDeclarationParams = ctx.getParent().getParent().getParent() instanceof VicuschiParser.Declaration_paramsContext;
		boolean isFunction = ctx.getParent().getParent() instanceof VicuschiParser.Function_declarationContext;
		if(localAttributeTable.containsKey(attribute.name) && !isDeclarationParams && !isFunction) {
			System.out.println("Warning: redeclaration of variable " + attribute.name + " at " + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine());
		}

		if(isDeclarationParams) {
			attribute.hasValue = true;
		}
		
		if(!isFunction) {
			localAttributeTable.put(attribute.name, attribute);
		}

		nodeTable.put(attribute.name, ctx);
	}

	@Override public void exitFloat_declaration(VicuschiParser.Float_declarationContext ctx) { 
		Map<String, Attribute> localAttributeTable = scopeTables.get(scope.get(ctx.getParent()));
		//System.out.println("tabela de "+ctx.ID().getText()+" : \n"+localAttributeTable);

		Attribute<Float> attribute = new Attribute<>();
		attribute.name = ctx.ID().getText();
		attribute.type = "float";
		attribute.value = null;
		attribute.scope = scope.get(ctx.getParent());

		boolean isDeclarationParams = ctx.getParent().getParent().getParent() instanceof VicuschiParser.Declaration_paramsContext;
		boolean isFunction = ctx.getParent().getParent() instanceof VicuschiParser.Function_declarationContext;
		if(localAttributeTable.containsKey(attribute.name) && !isDeclarationParams && !isFunction) {
			System.out.println("Warning: redeclaration of variable " + attribute.name + " at " + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine());
		}

		if(isDeclarationParams) {
			attribute.hasValue = true;
		}
		
		if(!isFunction) {
			localAttributeTable.put(attribute.name, attribute);
		}

		nodeTable.put(attribute.name, ctx);
	}

	@Override public void exitBoolean_declaration(VicuschiParser.Boolean_declarationContext ctx) { 
		Map<String, Attribute> localAttributeTable = scopeTables.get(scope.get(ctx.getParent()));
		//System.out.println("tabela de "+ctx.ID().getText()+" : \n"+localAttributeTable);
		
		Attribute<Boolean> attribute = new Attribute<>();
		attribute.name = ctx.ID().getText();
		attribute.type = "boolean";
		attribute.value = null;
		attribute.scope = scope.get(ctx.getParent());

		boolean isDeclarationParams = ctx.getParent().getParent().getParent() instanceof VicuschiParser.Declaration_paramsContext;
		boolean isFunction = ctx.getParent().getParent() instanceof VicuschiParser.Function_declarationContext;
		if(localAttributeTable.containsKey(attribute.name) && !isDeclarationParams && !isFunction) {
			System.out.println("Warning: redeclaration of variable " + attribute.name + " at " + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine());
		}

		if(isDeclarationParams) {
			attribute.hasValue = true;
		}
		
		if(!isFunction) {
			localAttributeTable.put(attribute.name, attribute);
		}

		nodeTable.put(attribute.name, ctx);
	}

	@Override public void exitGeneric_array_declaration(VicuschiParser.Generic_array_declarationContext ctx) {
		String id = ctx.getChild(0).getChild(1).getChild(0).getText();
		//System.out.println("generic_array_declaration: "+id);
		addAttributeAtNodeTable(id, ctx);
		//System.out.println("tipo passado para cima: "+a.type);
		//System.out.println("generic_unary_declaration: "+id+". Nodo: "+ctx);	
	}

	@Override public void exitString_array_declaration(VicuschiParser.String_array_declarationContext ctx) {
		Map<String, Attribute> localAttributeTable = scopeTables.get(scope.get(ctx.getParent()));
		//System.out.println("tabela de "+ctx.generic_array().ID().getText()+" : \n"+localAttributeTable);

		//verificação da presença da declaração do index
		TerminalNode id = ctx.generic_array().index().ID();
		//TerminalNodeImpl id = prc.ID();

		if (id != null){
			if (localAttributeTable.containsKey(id.getText())){
				if (localAttributeTable.get(id.getText()).type.equals("int")){
					// Adicionando o nodo
					Attribute<String[]> attribute = new Attribute<>();
					attribute.name = ctx.generic_array().getChild(0).getText();
					attribute.type = "string[]";
					attribute.value = null;
					attribute.scope = scope.get(ctx.getParent());

					boolean isDeclarationParams = ctx.getParent().getParent().getParent().getParent() instanceof VicuschiParser.Declaration_paramsContext;
					if(localAttributeTable.containsKey(attribute.name) && !isDeclarationParams) {
						System.out.println("Warning: redeclaration of variable " + attribute.name + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
					}

					if(isDeclarationParams) {
						attribute.hasValue = true;
					}

					localAttributeTable.put(attribute.name, attribute);
					nodeTable.put(attribute.name, ctx);
				} else {
					System.out.println("Error: array index at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine()+" has to be of type 'int' ");	
				}
			} else{
				System.out.println("Error: undeclared array index: " + id.getText() + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
			}
		} else { // se o indice eh um numero
			// Adicionando o nodo

			Attribute<String[]> attribute = new Attribute<>();
			attribute.name = ctx.generic_array().getChild(0).getText();
			attribute.type = "string[]";
			attribute.value = null;
			attribute.scope = scope.get(ctx.getParent());
			TerminalNode parsedSize = ctx.generic_array().index().INT_NUMBER();
			if (parsedSize != null){
				attribute.size = Integer.parseInt(parsedSize.getText());
			} else {
				System.out.println("Error: array as a param at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine() + " must have its size specified");
				attribute.size = 0;
			}
			//System.out.println(attribute.size);
			boolean isDeclarationParams = ctx.getParent().getParent().getParent().getParent() instanceof VicuschiParser.Declaration_paramsContext;
			if(localAttributeTable.containsKey(attribute.name) && !isDeclarationParams) {
				System.out.println("Warning: redeclaration of variable " + attribute.name + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
			}

			if(isDeclarationParams) {
				attribute.hasValue = true;
			}

			localAttributeTable.put(attribute.name, attribute);
			nodeTable.put(attribute.name, ctx);
		}
	}

	@Override public void exitInteger_array_declaration(VicuschiParser.Integer_array_declarationContext ctx) { 
		Map<String, Attribute> localAttributeTable = scopeTables.get(scope.get(ctx.getParent()));
		//System.out.println("tabela de "+ctx.generic_array().ID().getText()+" : \n"+localAttributeTable);

		//verificação da presença da declaração do index
		TerminalNode id = ctx.generic_array().index().ID();
		//TerminalNodeImpl id = prc.ID();

		if (id != null){
			if (localAttributeTable.containsKey(id.getText())){
				if (localAttributeTable.get(id.getText()).type.equals("int")){
					// Adicionando o nodo
					Attribute<Integer[]> attribute = new Attribute<>();
					attribute.name = ctx.generic_array().getChild(0).getText();
					attribute.type = "int[]";
					attribute.value = null;
					attribute.scope = scope.get(ctx.getParent());

					boolean isDeclarationParams = ctx.getParent().getParent().getParent().getParent() instanceof VicuschiParser.Declaration_paramsContext;
					if(localAttributeTable.containsKey(attribute.name) && !isDeclarationParams) {
						System.out.println("Warning: redeclaration of variable " + attribute.name + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
					}

					if(isDeclarationParams) {
						attribute.hasValue = true;
					}

					localAttributeTable.put(attribute.name, attribute);
					nodeTable.put(attribute.name, ctx);
				} else {
					System.out.println("Error: array index at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine()+ " has to be of type 'int' ");	
				}
			} else{
				System.out.println("Error: undeclared array index: " +id.getText() + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
			}
		} else { // se o indice eh um numero
			// Adicionando o nodo
			Attribute<Integer[]> attribute = new Attribute<>();
			attribute.name = ctx.generic_array().getChild(0).getText();
			attribute.type = "int[]";
			attribute.value = null;
			attribute.scope = scope.get(ctx.getParent());
			TerminalNode parsedSize = ctx.generic_array().index().INT_NUMBER();
			if (parsedSize != null){
				attribute.size = Integer.parseInt(parsedSize.getText());
			} else {
				System.out.println("Error: array as a param at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine() + " must have its size specified");
				attribute.size = 0;
			}
			boolean isDeclarationParams = ctx.getParent().getParent().getParent().getParent() instanceof VicuschiParser.Declaration_paramsContext;
			if(localAttributeTable.containsKey(attribute.name) && !isDeclarationParams) {
				System.out.println("Warning: redeclaration of variable " + attribute.name + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
			}

			if(isDeclarationParams) {
				attribute.hasValue = true;
			}

			localAttributeTable.put(attribute.name, attribute);
			nodeTable.put(attribute.name, ctx);
		}
	}

	@Override public void exitFloat_array_declaration(VicuschiParser.Float_array_declarationContext ctx) {
		Map<String, Attribute> localAttributeTable = scopeTables.get(scope.get(ctx.getParent()));
		//System.out.println("tabela de "+ctx.generic_array().ID().getText()+" : \n"+localAttributeTable);

		//verificação da presença da declaração do index
		TerminalNode id = ctx.generic_array().index().ID();
		//TerminalNodeImpl id = prc.ID();

		if (id != null){
			if (localAttributeTable.containsKey(id.getText())){
				if (localAttributeTable.get(id.getText()).type.equals("int")){
					// Adicionando o nodo
					Attribute<Float[]> attribute = new Attribute<>();
					attribute.name = ctx.generic_array().getChild(0).getText();
					attribute.type = "float[]";
					attribute.value = null;
					attribute.scope = scope.get(ctx.getParent());

					boolean isDeclarationParams = ctx.getParent().getParent().getParent().getParent() instanceof VicuschiParser.Declaration_paramsContext;
					if(localAttributeTable.containsKey(attribute.name) && !isDeclarationParams) {
						System.out.println("Warning: redeclaration of variable " + attribute.name + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
					}

					if(isDeclarationParams) {
						attribute.hasValue = true;
					}
			
					localAttributeTable.put(attribute.name, attribute);
					nodeTable.put(attribute.name, ctx);
				} else {
					System.out.println("Error: array index at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine()+ " has to be of type 'int' ");
				}
			} else{
				System.out.println("Error: undeclared array index: " +id.getText() + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
			}
		} else { // se o indice eh um numero
			// Adicionando o nodo
			Attribute<Float[]> attribute = new Attribute<>();
			attribute.name = ctx.generic_array().getChild(0).getText();
			attribute.type = "float[]";
			attribute.value = null;
			attribute.scope = scope.get(ctx.getParent());
			TerminalNode parsedSize = ctx.generic_array().index().INT_NUMBER();
			if (parsedSize != null){
				attribute.size = Integer.parseInt(parsedSize.getText());
			} else {
				System.out.println("Error: array as a param at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine() + " must have its size specified");
				attribute.size = 0;
			}
			boolean isDeclarationParams = ctx.getParent().getParent().getParent().getParent() instanceof VicuschiParser.Declaration_paramsContext;
			if(localAttributeTable.containsKey(attribute.name) && !isDeclarationParams) {
				System.out.println("Warning: redeclaration of variable " + attribute.name + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
			}

			if(isDeclarationParams) {
				attribute.hasValue = true;
			}

			localAttributeTable.put(attribute.name, attribute);
			nodeTable.put(attribute.name, ctx);
		}
	}

	@Override public void exitBoolean_array_declaration(VicuschiParser.Boolean_array_declarationContext ctx) { 
		Map<String, Attribute> localAttributeTable = scopeTables.get(scope.get(ctx.getParent()));
		//System.out.println("tabela de "+ctx.generic_array().ID().getText()+" : \n"+localAttributeTable);

		//System.out.println("exitBoolean_array_declaration");

		//verificação da presença da declaração do index
		TerminalNode id = ctx.generic_array().index().ID();
		//TerminalNodeImpl id = prc.ID();

		if (id != null){
			if (localAttributeTable.containsKey(id.getText())){
				if (localAttributeTable.get(id.getText()).type.equals("int")){
					// Adicionando o nodo
					Attribute<Boolean[]> attribute = new Attribute<>();
					attribute.name = ctx.generic_array().getChild(0).getText();
					attribute.type = "boolean[]";
					attribute.value = null;
					attribute.scope = scope.get(ctx.getParent());

					boolean isDeclarationParams = ctx.getParent().getParent().getParent().getParent() instanceof VicuschiParser.Declaration_paramsContext;
					if(localAttributeTable.containsKey(attribute.name) && !isDeclarationParams) {
						System.out.println("Warning: redeclaration of variable " + attribute.name + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
					}

					if(isDeclarationParams) {
						attribute.hasValue = true;
					}
					
					localAttributeTable.put(attribute.name, attribute);
					nodeTable.put(attribute.name, ctx);
				} else {
					System.out.println("Error: array index at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine()+ " has to be of type 'int' ");
				}
			} else{
				System.out.println("Error: undeclared array index: " +id.getText() + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
			}
		} else { // se o indice eh um numero
			// Adicionando o nodo
			Attribute<Boolean[]> attribute = new Attribute<>();
			attribute.name = ctx.generic_array().getChild(0).getText();
			attribute.type = "boolean[]";
			attribute.value = null;
			attribute.scope = scope.get(ctx.getParent());
			TerminalNode parsedSize = ctx.generic_array().index().INT_NUMBER();
			if (parsedSize != null){
				attribute.size = Integer.parseInt(parsedSize.getText());
			} else {
				System.out.println("Error: array as a param at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine() + " must have its size specified");
				attribute.size = 0;
			}
			boolean isDeclarationParams = ctx.getParent().getParent().getParent().getParent() instanceof VicuschiParser.Declaration_paramsContext;
			if(localAttributeTable.containsKey(attribute.name) && !isDeclarationParams) {
				System.out.println("Warning: redeclaration of variable " + attribute.name + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
			}

			if(isDeclarationParams) {
				attribute.hasValue = true;
			}
			

			localAttributeTable.put(attribute.name, attribute);
			nodeTable.put(attribute.name, ctx);
		}

		//System.out.println("end exitBoolean_array_declaration");
	}

	@Override
	public void exitArith_id(VicuschiParser.Arith_idContext ctx) {
		Map<String, Attribute> localAttributeTable = scopeTables.get(scope.get(ctx));

		String id = ctx.ID().getText();
		if(!localAttributeTable.containsKey(id)) {
			System.out.println("Error: variable " + id + " at " + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine() + " doesn't exist at symbol table (failed to be declared)");
			return;
		}

		Attribute attribute = localAttributeTable.get(id);

		if(!attribute.hasValue) {
			System.out.println("Error: variable " + id + " at " + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine() + " declared but has no value");
			return;
		}

		nodeTable.put(attribute.name, ctx);
	}

	@Override
	public void exitR_logic(VicuschiParser.R_logicContext ctx) {
		//System.out.println(scope.get(ctx));
		Map<String, Attribute> localAttributeTable = scopeTables.get(scope.get(ctx));

		if(ctx.getChild(1) instanceof VicuschiParser.ComparatorContext) {
			String[] id = {ctx.getChild(0).getText(), ctx.getChild(2).getText()};
			if(!localAttributeTable.containsKey(id[0])) {
				System.out.println("Error: variable " + id[0] + " at " + ctx.ID().get(0).getSymbol().getLine() + ":" + ctx.ID().get(0).getSymbol().getCharPositionInLine() + " doesn't exist at symbol table (failed to be declared)");
				return;
			}

			if(ctx.ID().size() > 1) {
				if(!localAttributeTable.containsKey(id[1])) {
					System.out.println("Error: variable " + id[1] + " at " + ctx.ID().get(1).getSymbol().getLine() + ":" + ctx.ID().get(1).getSymbol().getCharPositionInLine() + " doesn't exist at symbol table (failed to be declared)");
					return;
				}
			}



			Attribute[] attributes = { localAttributeTable.get(id[0]), localAttributeTable.get(id[1]) };

			if(!attributes[0].hasValue) {
				System.out.println("Error: variable " + id[0] + " at " + ctx.ID().get(0).getSymbol().getLine() + ":" + ctx.ID().get(0).getSymbol().getCharPositionInLine() + " declared but has no value");
				return;
			}

			if(ctx.ID().size() > 1) {
				if(!attributes[1].hasValue) {
					System.out.println("Error: variable " + id[1] + " at " + ctx.ID().get(1).getSymbol().getLine() + ":" + ctx.ID().get(1).getSymbol().getCharPositionInLine() + " declared but has no value");
					return;
				}
			}

			nodeTable.put(attributes[0].name, ctx);
			if(ctx.ID().size() > 1) {
				nodeTable.put(attributes[1].name, ctx);
			}
			return;
		}

		if(ctx.ID().size() == 1) {
			String id_name = ctx.ID().get(0).getText();
			if(!localAttributeTable.containsKey(id_name)){
				System.out.println("Error: variable " + id_name + " at " + ctx.ID().get(0).getSymbol().getLine() + ":" + ctx.ID().get(0).getSymbol().getCharPositionInLine() + " doesn't exist at symbol table (failed to be declared)");
				return;
			}

			Attribute attribute = localAttributeTable.get(id_name);

			if(!attribute.hasValue) {
				System.out.println("Error: variable " + id_name + " at " + ctx.ID().get(0).getSymbol().getLine() + ":" + ctx.ID().get(0).getSymbol().getCharPositionInLine() + " declared but has no value");
				return;
			}

			nodeTable.put(attribute.name, ctx);
		}
	}

	class Attribute<T> implements Comparable<Attribute> {
		public String name;
		public String type;
		public T value;
		public int size = 1;
		public Boolean hasValue = false;
		public Integer nparams;
		public Integer maxValue;
		public Integer scope;
/*
		@Override
		public String toString() {
			return "(name:" + name 
			    + ", type: " + type 
			    + ", value: " + value 
			    + ", size: " + size 
			    + ", hasValue: " + hasValue 
			    + ", nparams: " + nparams 
			    + ", maxValue: " + maxValue + ")";
		}*/
		@Override
		public String toString() {
			return "(scope: "+scope+ ")\n";
		}

		@Override
		public int compareTo(ANTLRVicuschiListener.Attribute other) {
			return this.name.equals(other.name) ? 1 : 0;
		}
	}
}
