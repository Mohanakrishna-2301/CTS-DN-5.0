package module1.dependencyinjectionexample;

public class CustomerService 
{
    private CustomerRepository customerRepository;

    // Constructor Injection
    public CustomerService(CustomerRepository customerRepository) 
    {
        this.customerRepository = customerRepository;
    }

    public void displayCustomer(int id) 
    {
        Customer customer = customerRepository.findCustomerById(id);

        if (customer != null) 
        {
            System.out.println("Customer Found:");
            System.out.println("ID   : " + customer.getId());
            System.out.println("Name : " + customer.getName());
        } else 
        {
            System.out.println("Customer not found.");
        }
    }
}