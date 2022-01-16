// Generated from C:/Users/mikol/Desktop/Studia/MIAK/src/Interpreter\Logo.g4 by ANTLR 4.9.2
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogoParser}.
 */
public interface LogoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogoParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(LogoParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(LogoParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(LogoParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(LogoParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableUse}
	 * labeled alternative in {@link LogoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterVariableUse(LogoParser.VariableUseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableUse}
	 * labeled alternative in {@link LogoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitVariableUse(LogoParser.VariableUseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link LogoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterNumber(LogoParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link LogoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitNumber(LogoParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operation}
	 * labeled alternative in {@link LogoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterOperation(LogoParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operation}
	 * labeled alternative in {@link LogoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitOperation(LogoParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modulo}
	 * labeled alternative in {@link LogoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterModulo(LogoParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modulo}
	 * labeled alternative in {@link LogoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitModulo(LogoParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link LogoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(LogoParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link LogoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(LogoParser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#printExpresion}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpresion(LogoParser.PrintExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#printExpresion}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpresion(LogoParser.PrintExpresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalsCondition}
	 * labeled alternative in {@link LogoParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEqualsCondition(LogoParser.EqualsConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalsCondition}
	 * labeled alternative in {@link LogoParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEqualsCondition(LogoParser.EqualsConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanCondition}
	 * labeled alternative in {@link LogoParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanCondition(LogoParser.GreaterThanConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanCondition}
	 * labeled alternative in {@link LogoParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanCondition(LogoParser.GreaterThanConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallerThanCondition}
	 * labeled alternative in {@link LogoParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterSmallerThanCondition(LogoParser.SmallerThanConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallerThanCondition}
	 * labeled alternative in {@link LogoParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitSmallerThanCondition(LogoParser.SmallerThanConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallerEqualCondition}
	 * labeled alternative in {@link LogoParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterSmallerEqualCondition(LogoParser.SmallerEqualConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallerEqualCondition}
	 * labeled alternative in {@link LogoParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitSmallerEqualCondition(LogoParser.SmallerEqualConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterEqualCondition}
	 * labeled alternative in {@link LogoParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqualCondition(LogoParser.GreaterEqualConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterEqualCondition}
	 * labeled alternative in {@link LogoParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqualCondition(LogoParser.GreaterEqualConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#variableDeclare}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclare(LogoParser.VariableDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#variableDeclare}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclare(LogoParser.VariableDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(LogoParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(LogoParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#whileRule}.
	 * @param ctx the parse tree
	 */
	void enterWhileRule(LogoParser.WhileRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#whileRule}.
	 * @param ctx the parse tree
	 */
	void exitWhileRule(LogoParser.WhileRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#ifRule}.
	 * @param ctx the parse tree
	 */
	void enterIfRule(LogoParser.IfRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#ifRule}.
	 * @param ctx the parse tree
	 */
	void exitIfRule(LogoParser.IfRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#printCommand}.
	 * @param ctx the parse tree
	 */
	void enterPrintCommand(LogoParser.PrintCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#printCommand}.
	 * @param ctx the parse tree
	 */
	void exitPrintCommand(LogoParser.PrintCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#turtleMoveCommand}.
	 * @param ctx the parse tree
	 */
	void enterTurtleMoveCommand(LogoParser.TurtleMoveCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#turtleMoveCommand}.
	 * @param ctx the parse tree
	 */
	void exitTurtleMoveCommand(LogoParser.TurtleMoveCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#turtleOtherCommand}.
	 * @param ctx the parse tree
	 */
	void enterTurtleOtherCommand(LogoParser.TurtleOtherCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#turtleOtherCommand}.
	 * @param ctx the parse tree
	 */
	void exitTurtleOtherCommand(LogoParser.TurtleOtherCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#procedureDeclare}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclare(LogoParser.ProcedureDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#procedureDeclare}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclare(LogoParser.ProcedureDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#procedureExecute}.
	 * @param ctx the parse tree
	 */
	void enterProcedureExecute(LogoParser.ProcedureExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#procedureExecute}.
	 * @param ctx the parse tree
	 */
	void exitProcedureExecute(LogoParser.ProcedureExecuteContext ctx);
}