import java.util.Scanner;
 
public class RestaurantOrder {
 
    // Method to display the menu
    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Burger - $5.99");
        System.out.println("2. Pizza - $8.99");
        System.out.println("3. Salad - $4.99");
        System.out.println("4. Soda - $1.99");
    }
 
    // Method to get the price of an item based on selection
    public static double getItemPrice(int itemNumber) {
        // TODO: Implement logic to return the price based on itemNumber
        switch (itemNumber) {
            case 1: 
                return 5.99;
            case 2: 
                return 8.99;
            case 3: 
                return 4.99;
            case 4: 
                return 1.99;
            default: 
                return 0.0;
        }
    }
 
    // Method to take an order from the user
    public static void takeOrder() {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;
        
        System.out.println("Enter the item number to order (0 to finish): ");
        
        while (true) {
            int choice = scanner.nextInt();
            if (choice == 0) break;
            
            // TODO: Call getItemPrice() and update totalCost
            double price = getItemPrice(choice);
            if (price == 0.0) {
                System.out.println("Invalid selection, please try again.");
            } else {
                totalCost += price;
                System.out.println("Item added. Current Total is $" + totalCost);
            }
        }
 
        // TODO: Display total cost
        System.out.println("Final total: $" + calculateTotal(totalCost));
        scanner.close();
    }
 
    // Overloaded method to apply a discount
    public static double calculateTotal(double totalCost) {
        // TODO: Implement method to return total cost
        return totalCost;
    }
 
    public static double calculateTotal(double totalCost, double discount) {
        // TODO: Implement method to return total cost after discount
        return totalCost;
    }
 
    // Main method to run the program
    public static void main(String[] args) {
        displayMenu();
        takeOrder();
    }
}
