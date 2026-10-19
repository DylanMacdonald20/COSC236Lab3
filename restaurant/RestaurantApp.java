package restaurant;
// Main class to demonstrate collaboration
public class RestaurantApp {
    public static void main(String[] args) {
        // Creating customer
        // Changed customer name to Bob
    	Customer customer = new Customer("Bob");
        
        // Creating menu items
    	// Added a dollar to each price
        MenuItem pizza = new MenuItem("Pizza", 8.99+1.00);
        MenuItem burger = new MenuItem("Burger", 5.49+1.00);
        MenuItem soda = new MenuItem("Soda", 1.99+1.00);
        
        // Customer adds items to their order
        // Changed method calls from addMenuItemToOrder to addToOrder
        customer.addToOrder(pizza);  // Collaborating with MenuItem and Order
        customer.addToOrder(burger);
        customer.addToOrder(soda);
        
        // Customer places the order
        customer.placeOrder();  // Collaborating with Order to show order summary
    }
}
