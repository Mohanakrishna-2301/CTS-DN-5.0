package module1.dependencyinjectionexample;

public class DependencyInjectionTest 
{
    public static void main(String[] args) 
    {
        // Create repository object
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject repository into service using constructor
        CustomerService service = new CustomerService(repository);

        // Use service
        service.displayCustomer(101);

        System.out.println();

        service.displayCustomer(999);
    }
}
