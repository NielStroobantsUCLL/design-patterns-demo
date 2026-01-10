import command.Invoker;
import command.Receiver;
import command.commands.Command;
import command.commands.PressCircleButtonCommand;
import command.commands.PressTriangleButtonCommand;

void main() {
    Invoker invoker = new Invoker();
    Receiver receiver = new Receiver();
    Command pressCircle = new PressCircleButtonCommand(receiver);

    Command pressTriangle = new PressTriangleButtonCommand(receiver);

    invoker.setCommand(pressCircle);

    invoker.pressTheButton();

    invoker.setCommand(pressTriangle);
    invoker.pressTheButton();

}
