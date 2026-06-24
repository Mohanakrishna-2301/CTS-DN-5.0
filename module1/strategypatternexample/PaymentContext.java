package module1.strategypatternexample;

public class PaymentContext 
{
    private PaymentStrategy paymentStrategy;

    // Set strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) 
    {
        this.paymentStrategy = paymentStrategy;
    }

    // Execute selected strategy
    public void makePayment(double amount) 
    {
        if (paymentStrategy == null) 
        {
            System.out.println("Payment method not selected!");
        } else 
        {
            paymentStrategy.pay(amount);
        }
    }
}
