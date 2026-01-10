package command.commands;

import command.Receiver;

public class PressTriangleButtonCommand implements  Command {
    Receiver receiver;

    public PressTriangleButtonCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.actionTriangle();
    }
}
