package module1.dependencyinjectionexample;

public class CustomerRepositoryImpl implements CustomerRepository 
{
    @Override
    public Customer findCustomerById(int id) 
    {
        // Simulating database/customer data lookup
        if (id == 101) 
        {
            return new Customer(101, "Alan Jones");
        } else if (id == 102) 
        {
            return new Customer(102, "Mark Anderson");
        } else 
        {
            return null;
        }
    }
}
