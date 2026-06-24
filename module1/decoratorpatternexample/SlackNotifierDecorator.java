package module1.decoratorpatternexample;

public class SlackNotifierDecorator extends NotifierDecorator 
{
    public SlackNotifierDecorator(Notifier notifier) 
    {
        super(notifier);
    }

    @Override
    public void send(String message) 
    {
        super.send(message);     // first send previous notification
        sendSlack(message);      // then add Slack notification
    }

    private void sendSlack(String message) 
    {
        System.out.println("Sending Slack message: " + message);
    }
}
