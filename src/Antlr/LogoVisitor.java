// Generated from C:/Users/mikol/Desktop/Studia/MIAK/src/Interpreter\Logo.g4 by ANTLR 4.9.2
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogoParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(LogoParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(LogoParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableUse}
	 * labeled alternative in {@link LogoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableUse(LogoParser.VariableUseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link LogoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(LogoParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operation}
	 * labeled alternative in {@link LogoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(LogoParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modulo}
	 * labeled alternative in {@link LogoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(LogoParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link LogoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(LogoParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#printExpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpresion(LogoParser.PrintExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalsCondition}
	 * labeled alternative in {@link LogoParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsCondition(LogoParser.EqualsConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanCondition}
	 * labeled alternative in {@link LogoParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanCondition(LogoParser.GreaterThanConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallerThanCondition}
	 * labeled alternative in {@link LogoParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallerThanCondition(LogoParser.SmallerThanConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallerEqualCondition}
	 * labeled alternative in {@link LogoParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallerEqualCondition(LogoParser.SmallerEqualConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterEqualCondition}
	 * labeled alternative in {@link LogoParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqualCondition(LogoParser.GreaterEqualConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#variableDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclare(LogoParser.VariableDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(LogoParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#whileRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileRule(LogoParser.WhileRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#ifRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfRule(LogoParser.IfRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#printCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCommand(LogoParser.PrintCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#turtleMoveCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurtleMoveCommand(LogoParser.TurtleMoveCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#turtleOtherCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurtleOtherCommand(LogoParser.TurtleOtherCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#procedureDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclare(LogoParser.ProcedureDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#procedureExecute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureExecute(LogoParser.ProcedureExecuteContext ctx);
}