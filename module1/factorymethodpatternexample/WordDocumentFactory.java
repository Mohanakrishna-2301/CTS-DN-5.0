package module1.factorymethodpatternexample;

public class WordDocumentFactory extends DocumentFactory 
{
    @Override
    public Document createDocument() 
    {
        return new WordDocument();
    }
}
