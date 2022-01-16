package Engine.Commands;

import Engine.Commands.Command;
import Engine.Engine;
import Engine.Trace;

public class PenDownCommand implements Command {
    @Override
    public Trace execute(Engine engine) {
        engine.setPenDown(true);
        return null;
    }
}
