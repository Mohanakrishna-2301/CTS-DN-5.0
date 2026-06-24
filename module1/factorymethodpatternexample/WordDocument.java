package module1.factorymethodpatternexample;

public class WordDocument implements Document 
{
    @Override
    public void open() 
    {
        System.out.println("Opening Word document...");
    }
    
}
