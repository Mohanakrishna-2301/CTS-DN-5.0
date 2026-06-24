package module1.commandpatternexample;

public class CommandPatternTest 
{
    public static void main(String[] args) 
    {
        // Receiver
        Light light = new Light();

        // Concrete Commands
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Turn light ON
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn light OFF
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
