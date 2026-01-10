package command.commands;

import command.Receiver;

public class PressSquareButtonCommand implements  Command {
    Receiver receiver;

    public PressSquareButtonCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.actionSquare();
    }
}
