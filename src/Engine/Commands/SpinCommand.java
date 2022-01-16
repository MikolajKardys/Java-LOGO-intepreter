package Engine.Commands;

import Engine.Commands.Command;
import Engine.Engine;
import Engine.Trace;

public class SpinCommand implements Command {
    private final double spinValue;

    public SpinCommand(double spinValue) {
        this.spinValue = spinValue;
    }

    @Override
    public Trace execute(Engine engine) throws IllegalArgumentException{
        engine.getTurtle().spin(spinValue);

        return null;
    }
}
