package remotecontrol.command;

import remotecontrol.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command {
    CeilingFan cellingFan;

    public CeilingFanOnCommand(CeilingFan cellingFan)
    {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        cellingFan.high();
    }

    @Override
    public void undo() {
        cellingFan.off();
    }
}
