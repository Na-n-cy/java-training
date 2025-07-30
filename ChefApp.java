package gradecalculator;
class OrderManager {
    void placeOrder(String dish) {
        System.out.println("Order placed: " + dish);
    }
    void placeOrder(String dish, int quantity) {
        System.out.println("Order placed: " + quantity + dish);
    }
    void placeOrder(String dish, int quantity, int tableNumber) {
        System.out.println("Order placed: " +  quantity + dish + " for table number " + tableNumber);
    }
}
public class ChefApp {
	 public static void main(String[] args) {
	        OrderManager manager = new OrderManager();
	        manager.placeOrder("Pasta");
	        manager.placeOrder("Burger", 2);
	        manager.placeOrder("Pizza", 3, 5);
	    }
	}

