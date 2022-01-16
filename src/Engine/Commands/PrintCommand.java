package Engine.Commands;

import Engine.Engine;
import Engine.Trace;

public class PrintCommand implements Command {
    private final String log;

    public PrintCommand(String log) {
        this.log = log;
    }

    @Override
    public Trace execute(Engine engine) throws IllegalArgumentException {
        engine.addLog(log);

        return null;
    }
}
