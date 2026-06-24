package module1.observerpatternexample;

public class ObserverPatternTest 
{
    public static void main(String[] args) 
    {
        // Create stock market subject
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp1 = new MobileApp("Stock Tracker");
        Observer mobileApp2 = new MobileApp("Market Watch");
        Observer webApp1 = new WebApp("Finance Portal");

        // Register observers
        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp1);

        // Update stock prices
        stockMarket.setStockPrice("TCS", 3500.50);
        stockMarket.setStockPrice("Infosys", 1450.75);

        // Deregister one observer
        stockMarket.deregisterObserver(mobileApp2);

        // Update stock price again
        stockMarket.setStockPrice("Wipro", 420.30);
    }
}
