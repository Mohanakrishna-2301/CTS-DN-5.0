package module1.factorymethodpatternexample;

public class PdfDocumentFactory extends DocumentFactory 
{
    @Override
    public Document createDocument() 
    {
        return new PdfDocument();
    }
    
}
