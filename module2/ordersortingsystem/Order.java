package module2.ordersortingsystem;

class Order 
{
    int orderId;
    String customerName;
    double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) 
    {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;

    }

    @Override
    public String toString() 
    {
        return "Order ID : " + orderId +
                "\nCustomer : " + customerName +
                "\nTotal Price : " + totalPrice;
    }
}
