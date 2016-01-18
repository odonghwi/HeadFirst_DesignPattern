package remotecontrol.invoker;

import remotecontrol.command.Command;
import remotecontrol.command.NoCommand;

public class RemoteControlWithUndo {

    final int REMOTE_SLOT = 7;

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {

        onCommands = new Command[REMOTE_SLOT];
        offCommands = new Command[REMOTE_SLOT];

        Command noCommand = new NoCommand();

        for(int i = 0; i < REMOTE_SLOT ; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offBUttonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control ------\n");
        for(int i = 0; i < REMOTE_SLOT; i++) {
            stringBuilder.append("[slot ").append(i).append("] ");
            stringBuilder.append(onCommands[i].getClass().getName());
            stringBuilder.append("      ");
            stringBuilder.append(offCommands[i].getClass().getName());
            stringBuilder.append("\n");
        }
        stringBuilder.append("[undo] ").append(undoCommand.getClass().getName()).append("\n");

        return stringBuilder.toString();

    }

}
