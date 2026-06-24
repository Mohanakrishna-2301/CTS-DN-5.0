package module1.factorymethodpatternexample;

public class PdfDocument implements Document 
{
    @Override
    public void open() 
    {
        System.out.println("Opening PDF document...");
    }
    
}
