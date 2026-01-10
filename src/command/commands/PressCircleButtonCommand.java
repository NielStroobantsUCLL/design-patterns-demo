package command.commands;

import command.Receiver;

public class PressCircleButtonCommand implements Command {
    Receiver receiver;

    public PressCircleButtonCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.actionCircle();
    }
}
