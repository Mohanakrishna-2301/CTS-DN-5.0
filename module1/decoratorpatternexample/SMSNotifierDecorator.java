package module1.decoratorpatternexample;

public class SMSNotifierDecorator extends NotifierDecorator 
{

    public SMSNotifierDecorator(Notifier notifier) 
    {
        super(notifier);
    }

    @Override
    public void send(String message) 
    {
        super.send(message);   // first send existing notification
        sendSMS(message);      // then add SMS functionality
    }

    private void sendSMS(String message) 
    {
        System.out.println("Sending SMS: " + message);
    }
}
