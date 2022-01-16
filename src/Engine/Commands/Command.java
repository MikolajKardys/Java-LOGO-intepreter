package Engine.Commands;

import Engine.Engine;
import Engine.Trace;

public interface Command {
    Trace execute(Engine engine) throws IllegalArgumentException;
}
