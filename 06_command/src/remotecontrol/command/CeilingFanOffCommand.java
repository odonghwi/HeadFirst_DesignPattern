package remotecontrol.command;

import remotecontrol.receiver.CeilingFan;

public class CeilingFanOffCommand implements Command {
    CeilingFan cellingFan;

    public CeilingFanOffCommand(CeilingFan cellingFan)
    {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        cellingFan.off();
    }
}
