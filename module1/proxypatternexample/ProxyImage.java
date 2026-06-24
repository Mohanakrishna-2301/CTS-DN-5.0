package module1.proxypatternexample;

public class ProxyImage implements Image 
{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) 
    {
        this.fileName = fileName;
    }

    @Override
    public void display() 
    {
        // Lazy initialization: load real image only when needed
        if (realImage == null) 
        {
            realImage = new RealImage(fileName);
        }

        // Cached object reused after first load
        realImage.display();
    }
}
