package remotecontrol.command;

public interface Command {
    void execute();
    void undo();
}
