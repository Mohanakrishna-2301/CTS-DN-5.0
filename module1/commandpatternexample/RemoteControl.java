package module1.commandpatternexample;

public class RemoteControl 
{
    private Command command;

    // Set command
    public void setCommand(Command command) 
    {
        this.command = command;
    }

    // Execute command
    public void pressButton() 
    {
        if (command != null) 
        {
            command.execute();
        } else 
        {
            System.out.println("No command assigned.");
        }
    }
}
