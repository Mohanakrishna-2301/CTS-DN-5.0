package module1.strategypatternexample;

public class StrategyPatternTest 
{
    public static void main(String[] args) 
    {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012", "Alan");
        context.setPaymentStrategy(creditCard);
        context.makePayment(5000);

        System.out.println();

        // Pay using PayPal
        PaymentStrategy paypal = new PayPalPayment("alan@example.com");
        context.setPaymentStrategy(paypal);
        context.makePayment(2500);
    }
}
