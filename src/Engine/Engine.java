package Engine;

import Engine.Commands.Command;

import java.util.ArrayList;
import java.util.List;

public class Engine {
    private final Turtle turtle = new Turtle();



    public Turtle getTurtle(){
        return turtle;
    }


    private boolean isPenDown = true;
    public void setPenDown(boolean setDown){
        isPenDown = setDown;
    }
    public boolean isPenDown(){
        return isPenDown;
    }

    private final List<Command> commandList = new ArrayList<>();

    public void addCommand(Command newCommand){
        commandList.add(newCommand);
    }

    private final List<Trace> traceList = new ArrayList<>();
    public List<Trace> getTraceList (){
        return traceList;
    }

    public void clearTraceList(){
        traceList.clear();
    }

    private final List<String> logs = new ArrayList<>();
    public void addLog(String log){
        logs.add(log);
    }
    public List<String> getLogs(){
        return logs;
    }

    public void resetTurtle(){
        turtle.resetTurtle();
    }

    public void runCommands(){
        for (Command command : commandList) {
            Trace trace = command.execute(this);

            if (trace != null) {
                traceList.add(trace);
            }
        }
    }
}
