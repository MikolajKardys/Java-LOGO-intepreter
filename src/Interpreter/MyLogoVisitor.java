package Interpreter;

import Antlr.LogoBaseVisitor;
import Antlr.LogoParser;
import Engine.Commands.*;
import Engine.Engine;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyLogoVisitor extends LogoBaseVisitor<Object> {
    private final Engine engine;

    private Map<String, Double> variables = new HashMap<>();

    private final Map<String, LogoParser.InputContext> procedureContexts = new HashMap<>();
    private final Map<String, List<String>> procedureArgumentNames = new HashMap<>();

    private final BaseErrorListener errorListener;

    public MyLogoVisitor(Engine engine, BaseErrorListener errorListener) {
        this.engine = engine;
        this.errorListener = errorListener;
    }

    @Override
    public Object visitProcedureDeclare(LogoParser.ProcedureDeclareContext ctx) {
        String procedureName = ctx.PROCEDURE_NAME().getText();

        List<String> variableNames = ctx.VARIABLE().stream().map(ParseTree::getText).collect(Collectors.toList());

        procedureContexts.put(procedureName, ctx.input());
        procedureArgumentNames.put(procedureName, variableNames);

        return null;
    }

    @Override
    public Object visitProcedureExecute(LogoParser.ProcedureExecuteContext ctx) {
        String procedureName = ctx.PROCEDURE_NAME().getText();
        if (!procedureContexts.containsKey(procedureName)){
            int line = ctx.getStart().getLine();
            int pos = ctx.getStart().getCharPositionInLine();

            String message = "procedure '" + procedureName + "' has not been declared";

            errorListener.syntaxError(null, null, line, pos, message, null);
        }


        List<LogoParser.ExpresionContext> argumentContexts = ctx.expresion();
        if (argumentContexts.size() != procedureArgumentNames.get(procedureName).size()){
            int line = ctx.getStart().getLine();
            int pos = ctx.getStart().getCharPositionInLine();

            String message = "procedure '" + procedureName + "' takes " +
                    procedureArgumentNames.get(procedureName).size() + " arguments, got " + argumentContexts.size();

            errorListener.syntaxError(null, null, line, pos, message, null);
        }


        List<Double> argumentValues = argumentContexts.stream().map(e -> (Double) visit(e)).collect(Collectors.toList());

        Map<String, Double> variablesMain = new HashMap<>();
        for (String key : variables.keySet()){
            variablesMain.put(key, variables.get(key));
        }
        variables.clear();

        List<String> argumentNames = procedureArgumentNames.get(procedureName);
        for (int i = 0; i < argumentValues.size(); i++){
            variables.put(argumentNames.get(i), argumentValues.get(i));
        }

        visit(procedureContexts.get(procedureName));

        variables = variablesMain;  // Wróć do głównych zmiennych

        return null;
    }


    @Override
    public Object visitTurtleMoveCommand(LogoParser.TurtleMoveCommandContext ctx) {
        double steps = (Double) visit(ctx.expresion());
        if (ctx.FORWARD() != null)
            engine.addCommand(new MoveCommand(steps));
        else if (ctx.BACK() != null)
            engine.addCommand(new MoveCommand(-steps));
        else if (ctx.RIGHT() != null)
            engine.addCommand(new SpinCommand(steps));
        else if (ctx.LEFT() != null)
            engine.addCommand(new SpinCommand(-steps));

        return null;
    }

    @Override
    public Object visitTurtleOtherCommand(LogoParser.TurtleOtherCommandContext ctx) {
        if (ctx.PENUP() != null)
            engine.addCommand(new PenUpCommand());
        else if (ctx.PENDOWN() != null)
            engine.addCommand(new PenDownCommand());

        return null;
    }

    @Override
    public Object visitRepeat(LogoParser.RepeatContext ctx) {
        double steps = (Double) visit(ctx.expresion());

        for (int i = 0; i < steps; i++){
            visit(ctx.input());
        }

        return null;
    }

    @Override
    public Object visitEqualsCondition(LogoParser.EqualsConditionContext ctx) {
        double x = (Double) visit(ctx.expresion(0));
        double y = (Double) visit(ctx.expresion(1));

        return x == y;
    }

    @Override
    public Object visitGreaterThanCondition(LogoParser.GreaterThanConditionContext ctx) {
        double x = (Double) visit(ctx.expresion(0));
        double y = (Double) visit(ctx.expresion(1));

        return x > y;
    }

    @Override
    public Object visitSmallerThanCondition(LogoParser.SmallerThanConditionContext ctx) {
        double x = (Double) visit(ctx.expresion(0));
        double y = (Double) visit(ctx.expresion(1));

        return x < y;
    }

    @Override
    public Object visitSmallerEqualCondition(LogoParser.SmallerEqualConditionContext ctx) {
        double x = (Double) visit(ctx.expresion(0));
        double y = (Double) visit(ctx.expresion(1));

        return x <= y;
    }

    @Override
    public Object visitGreaterEqualCondition(LogoParser.GreaterEqualConditionContext ctx) {
        double x = (Double) visit(ctx.expresion(0));
        double y = (Double) visit(ctx.expresion(1));

        return x >= y;
    }

    @Override
    public Object visitWhileRule(LogoParser.WhileRuleContext ctx) {
        while ((boolean) visit(ctx.condition())){
            visit(ctx.input());
        }

        return null;
    }

    @Override
    public Object visitIfRule(LogoParser.IfRuleContext ctx) {
        if ((boolean) visit(ctx.condition())) {
            visit(ctx.input());
        }

        return null;
    }

    @Override
    public Object visitVariableDeclare(LogoParser.VariableDeclareContext ctx) {
        String variableName = ctx.STRING().getText().substring(1);
        double value = (Double) visit(ctx.expresion());

        variables.put(":" + variableName, value);

        return null;
    }

    @Override
    public Object visitPrintCommand(LogoParser.PrintCommandContext ctx) {
        StringBuilder string = new StringBuilder();
        for (LogoParser.PrintExpresionContext context : ctx.printExpresion())
                string.append((String) visit(context)).append(" ");

        engine.addCommand(new PrintCommand(string.toString()));

        return null;
    }




    @Override
    public Object visitPrintExpresion(LogoParser.PrintExpresionContext ctx) {
        if (ctx.STRING() != null)
            return ctx.STRING().getText().substring(1);
        else if (ctx.expresion() != null)
            return visit(ctx.expresion()).toString();

        return null;
    }

    @Override
    public Object visitVariableUse(LogoParser.VariableUseContext ctx) {
        String variableName = ctx.VARIABLE().getText();
        if (!variables.containsKey(variableName)){
            int line = ctx.getStart().getLine();
            int pos = ctx.getStart().getCharPositionInLine();

            String message = "undeclared variable: '" + variableName + "'";

            errorListener.syntaxError(null, null, line, pos, message, null);
        }

        return variables.get(ctx.VARIABLE().getText());
    }

    @Override
    public Object visitNumber(LogoParser.NumberContext ctx) {
        return Double.parseDouble(ctx.NUMBER().getText());
    }

    @Override
    public Object visitOperation(LogoParser.OperationContext ctx) {
        double firstNum = (Double) visit(ctx.expresion(0));
        double secondNum = (Double) visit(ctx.expresion(1));

        if (ctx.PLUS() != null)
            return firstNum + secondNum;
        else if (ctx.MINUS() != null)
            return firstNum - secondNum;
        else if (ctx.STAR() != null)
            return firstNum * secondNum;
        else if (ctx.SLASH() != null)
            return firstNum / secondNum;

        return null;
    }

    @Override
    public Object visitModulo(LogoParser.ModuloContext ctx) {
        double firstNum = (Double) visit(ctx.expresion(0));
        double secondNum = (Double) visit(ctx.expresion(1));

        return firstNum % secondNum;
    }
}
