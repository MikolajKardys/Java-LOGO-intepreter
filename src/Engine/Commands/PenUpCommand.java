package Engine.Commands;

import Engine.Engine;
import Engine.Trace;

public class PenUpCommand implements Command {
    @Override
    public Trace execute(Engine engine) {
        engine.setPenDown(false);
        return null;
    }
}
