package module2.inventorymanagementsystem;

import java.util.HashMap;

public class InventoryManagement
{
    private HashMap<Integer, Product> inventory;

    public InventoryManagement() 
    {
        inventory = new HashMap<>();
    }

    // Add Product
    public void addProduct(Product product) 
    {
        inventory.put(product.getProductId(), product);
        System.out.println("Product Added Successfully");
    }

    // Update Product
    public void updateProduct(int id, String name, int quantity, double price) 
    {
        Product product = inventory.get(id);

        if (product != null) {

            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);

            System.out.println("Product Updated Successfully");
        } else 
        {
            System.out.println("Product Not Found");
        }
    }

    // Delete Product
    public void deleteProduct(int id) 
    {
        if (inventory.remove(id) != null) 
        {
            System.out.println("Product Deleted Successfully");
        } else 
        {
            System.out.println("Product Not Found");
        }
    }

    // Display Products
    public void displayProducts() 
    {
        for (Product product : inventory.values()) 
        {
            System.out.println("------------------------");
            System.out.println(product);
        }
    }

    public static void main(String[] args) 
    {
        InventoryManagement inventory = new InventoryManagement();

        Product p1 = new Product(101, "Laptop", 20, 65000);
        Product p2 = new Product(102, "Mouse", 100, 500);
        Product p3 = new Product(103, "Keyboard", 50, 1200);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        System.out.println("\nInventory:");

        inventory.displayProducts();

        inventory.updateProduct(102, "Wireless Mouse", 80, 700);

        inventory.deleteProduct(103);

        System.out.println("\nUpdated Inventory:");

        inventory.displayProducts();
    }
}
