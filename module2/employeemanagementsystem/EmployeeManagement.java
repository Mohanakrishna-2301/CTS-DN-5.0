package module2.employeemanagementsystem;

public class EmployeeManagement 
{
    Employee[] employees = new Employee[10];
    int size = 0;

    // Add Employee
    public void addEmployee(Employee employee) 
    {
        if (size < employees.length) 
        {
            employees[size] = employee;
            size++;

            System.out.println("Employee Added Successfully");
        }else 
        {
            System.out.println("Array is Full");
        }
    }

    // Search Employee
    public Employee searchEmployee(int id) 
    {
        for (int i = 0; i < size; i++) 
        {
            if (employees[i].employeeId == id) 
            {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse Employees
    public void traverseEmployees() 
    {
        for (int i = 0; i < size; i++) 
        {
            System.out.println("-----------------------");
            System.out.println(employees[i]);
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) 
    {
        int index = -1;

        for (int i = 0; i < size; i++) 
        {
            if (employees[i].employeeId == id) 
            {
                index = i;
                break;
            }
        }

        if (index == -1) 
        {
            System.out.println("Employee Not Found");
            return;
        }

        for (int i = index; i < size - 1; i++) 
        {
            employees[i] = employees[i + 1];
        }

        employees[size - 1] = null;
        size--;

        System.out.println("Employee Deleted Successfully");
    }

    public static void main(String[] args) 
    {
        EmployeeManagement management = new EmployeeManagement();

        management.addEmployee(new Employee(101, "Alan", "Manager", 60000));
        management.addEmployee(new Employee(102, "Bob", "Developer", 45000));
        management.addEmployee(new Employee(103, "Charlie", "Tester", 40000));

        System.out.println("\nEmployee Records:");

        management.traverseEmployees();

        System.out.println("\nSearching Employee:");

        Employee employee = management.searchEmployee(102);

        if (employee != null)
            System.out.println(employee);
        else
            System.out.println("Employee Not Found");

        System.out.println();

        management.deleteEmployee(102);

        System.out.println("\nUpdated Employee Records:");

        management.traverseEmployees();
    }
}
