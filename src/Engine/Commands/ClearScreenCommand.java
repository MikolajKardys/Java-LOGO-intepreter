package Engine.Commands;

import Engine.Commands.Command;
import Engine.Engine;
import Engine.Trace;

public class ClearScreenCommand implements Command {
    @Override
    public Trace execute(Engine engine) {
        engine.clearTraceList();
        engine.resetTurtle();
        return null;
    }
}
