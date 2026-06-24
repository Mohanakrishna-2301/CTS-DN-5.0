package module1.adapterpatternexample;

public class AdapterPatternTest 
{
    public static void main(String[] args) 
    {
        // Using PayPal through adapter
        PaymentProcessor paypal = new PayPalAdapter(new PayPalGateway());
        paypal.processPayment(1500);

        // Using Razorpay through adapter
        PaymentProcessor razorpay = new RazorpayAdapter(new RazorpayGateway());
        razorpay.processPayment(3500);
    }
}
