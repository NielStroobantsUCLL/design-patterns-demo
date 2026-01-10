package command.commands;

import command.Receiver;

public class PressCrossButtonCommand implements Command {
    Receiver receiver;

    public PressCrossButtonCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.actionCross();
    }
}
