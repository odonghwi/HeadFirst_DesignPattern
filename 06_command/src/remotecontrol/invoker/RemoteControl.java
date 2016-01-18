package remotecontrol.invoker;

import remotecontrol.command.Command;
import remotecontrol.command.NoCommand;

public class RemoteControl {

    final int REMOTE_SLOT = 7;

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {

        onCommands = new Command[REMOTE_SLOT];
        offCommands = new Command[REMOTE_SLOT];

        Command noCommand = new NoCommand();

        for(int i = 0; i < REMOTE_SLOT ; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offBUttonWasPushed(int slot) {
        offCommands[slot].execute();
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

        return stringBuilder.toString();

    }

}
