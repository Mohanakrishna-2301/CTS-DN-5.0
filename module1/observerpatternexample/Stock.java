package module1.observerpatternexample;

public interface Stock 
{
    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers();
}
