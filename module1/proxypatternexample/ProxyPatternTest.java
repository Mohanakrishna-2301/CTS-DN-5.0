package module1.proxypatternexample;

public class ProxyPatternTest 
{
    public static void main(String[] args) 
    {

        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        System.out.println("First time displaying photo1:");
        image1.display();   // Loads from server + displays

        System.out.println("\nSecond time displaying photo1:");
        image1.display();   // Uses cached image, only displays

        System.out.println("\nDisplaying photo2:");
        image2.display();   // Loads from server + displays
    }
}
