package Engine.Commands;

import Engine.Engine;
import Engine.Trace;
import Engine.Turtle;

public class MoveCommand implements Command {
    private final double moveUnits;

    public MoveCommand(double moveUnits) {
        this.moveUnits = moveUnits;
    }

    @Override
    public Trace execute(Engine engine) {
        Turtle turtle = engine.getTurtle();
        double oldX = turtle.getX();
        double oldY = turtle.getY();

        turtle.move(moveUnits);

        if (engine.isPenDown())
            return new Trace(oldX, oldY, turtle.getX(), turtle.getY());

        return null;
    }
}
