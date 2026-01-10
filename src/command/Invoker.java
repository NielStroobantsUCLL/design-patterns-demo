package command;

import command.commands.Command;

public class Invoker {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressTheButton(){
        command.execute();
    }
}
