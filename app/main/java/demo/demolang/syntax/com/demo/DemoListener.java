// Generated from com/demo/Demo.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DemoParser}.
 */
public interface DemoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DemoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DemoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DemoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DemoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DemoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(DemoParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(DemoParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#ifthenelse}.
	 * @param ctx the parse tree
	 */
	void enterIfthenelse(DemoParser.IfthenelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#ifthenelse}.
	 * @param ctx the parse tree
	 */
	void exitIfthenelse(DemoParser.IfthenelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DemoParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DemoParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(DemoParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(DemoParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(DemoParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(DemoParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negArithmeticExp}
	 * labeled alternative in {@link DemoParser#arithmExp}.
	 * @param ctx the parse tree
	 */
	void enterNegArithmeticExp(DemoParser.NegArithmeticExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negArithmeticExp}
	 * labeled alternative in {@link DemoParser#arithmExp}.
	 * @param ctx the parse tree
	 */
	void exitNegArithmeticExp(DemoParser.NegArithmeticExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valArithmeticExp}
	 * labeled alternative in {@link DemoParser#arithmExp}.
	 * @param ctx the parse tree
	 */
	void enterValArithmeticExp(DemoParser.ValArithmeticExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valArithmeticExp}
	 * labeled alternative in {@link DemoParser#arithmExp}.
	 * @param ctx the parse tree
	 */
	void exitValArithmeticExp(DemoParser.ValArithmeticExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binArithmeticExp}
	 * labeled alternative in {@link DemoParser#arithmExp}.
	 * @param ctx the parse tree
	 */
	void enterBinArithmeticExp(DemoParser.BinArithmeticExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binArithmeticExp}
	 * labeled alternative in {@link DemoParser#arithmExp}.
	 * @param ctx the parse tree
	 */
	void exitBinArithmeticExp(DemoParser.BinArithmeticExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code baseArithmeticExp}
	 * labeled alternative in {@link DemoParser#arithmExp}.
	 * @param ctx the parse tree
	 */
	void enterBaseArithmeticExp(DemoParser.BaseArithmeticExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseArithmeticExp}
	 * labeled alternative in {@link DemoParser#arithmExp}.
	 * @param ctx the parse tree
	 */
	void exitBaseArithmeticExp(DemoParser.BaseArithmeticExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varArithmeticExp}
	 * labeled alternative in {@link DemoParser#arithmExp}.
	 * @param ctx the parse tree
	 */
	void enterVarArithmeticExp(DemoParser.VarArithmeticExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varArithmeticExp}
	 * labeled alternative in {@link DemoParser#arithmExp}.
	 * @param ctx the parse tree
	 */
	void exitVarArithmeticExp(DemoParser.VarArithmeticExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolComparisonExp}
	 * labeled alternative in {@link DemoParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterBoolComparisonExp(DemoParser.BoolComparisonExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolComparisonExp}
	 * labeled alternative in {@link DemoParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitBoolComparisonExp(DemoParser.BoolComparisonExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negBoolExp}
	 * labeled alternative in {@link DemoParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterNegBoolExp(DemoParser.NegBoolExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negBoolExp}
	 * labeled alternative in {@link DemoParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitNegBoolExp(DemoParser.NegBoolExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valBoolExp}
	 * labeled alternative in {@link DemoParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterValBoolExp(DemoParser.ValBoolExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valBoolExp}
	 * labeled alternative in {@link DemoParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitValBoolExp(DemoParser.ValBoolExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code baseBoolExp}
	 * labeled alternative in {@link DemoParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterBaseBoolExp(DemoParser.BaseBoolExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseBoolExp}
	 * labeled alternative in {@link DemoParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitBaseBoolExp(DemoParser.BaseBoolExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticComparisonExp}
	 * labeled alternative in {@link DemoParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticComparisonExp(DemoParser.ArithmeticComparisonExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticComparisonExp}
	 * labeled alternative in {@link DemoParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticComparisonExp(DemoParser.ArithmeticComparisonExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varBoolExp}
	 * labeled alternative in {@link DemoParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterVarBoolExp(DemoParser.VarBoolExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varBoolExp}
	 * labeled alternative in {@link DemoParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitVarBoolExp(DemoParser.VarBoolExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binBoolExp}
	 * labeled alternative in {@link DemoParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterBinBoolExp(DemoParser.BinBoolExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binBoolExp}
	 * labeled alternative in {@link DemoParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitBinBoolExp(DemoParser.BinBoolExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(DemoParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(DemoParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(DemoParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(DemoParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(DemoParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(DemoParser.BoolContext ctx);
}