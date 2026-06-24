package module1.adapterpatternexample;

public class RazorpayGateway 
{
    public void sendMoney(double amount) 
    {
        System.out.println("Payment of Rs." + amount + " processed using Razorpay.");
    }
}
