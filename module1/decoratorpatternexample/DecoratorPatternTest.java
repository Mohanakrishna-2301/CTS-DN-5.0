package module1.decoratorpatternexample;

public class DecoratorPatternTest 
{
    public static void main(String[] args) 
    {
        System.out.println("---- Email Only ----");
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Hello User!");

        System.out.println("\n---- Email + SMS ----");
        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send("Hello User!");

        System.out.println("\n---- Email + SMS + Slack ----");
        Notifier fullNotifier = new SlackNotifierDecorator(
                                    new SMSNotifierDecorator(
                                        new EmailNotifier()));
        fullNotifier.send("Hello User!");
    }
}