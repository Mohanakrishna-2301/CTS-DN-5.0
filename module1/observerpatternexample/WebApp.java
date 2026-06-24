package module1.observerpatternexample;

public class WebApp implements Observer 
{
    private String appName;

    public WebApp(String appName) 
    {
        this.appName = appName;
    }

    @Override
    public void update(String stockName, double price) 
    {
        System.out.println(appName + " (Web App) received update: " +
                stockName + " price is now Rs." + price);
    }
}
