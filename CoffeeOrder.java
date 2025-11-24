// Classes & Objects - Question 1: CoffeeOrder
// Author: Erick
// Date: Nov 24, 2025

public class CoffeeOrder {
    // Attributes
    String size;
    double price;

    // Constructor to set both attributes
    public CoffeeOrder(String size, double price) {
        this.size = size;
        this.price = price;
    }

    // Method to display order details
    public void displayOrder() {
        System.out.println("Coffee Size: " + size + ", Price: $" + price);
    }

    // Main method to test CoffeeOrder class
    public static void main(String[] args) {
        // Create two CoffeeOrder objects using the constructor
        CoffeeOrder order1 = new CoffeeOrder("Small", 2.50);
        CoffeeOrder order2 = new CoffeeOrder("Large", 4.75);

        // Display details of each order
        order1.displayOrder();
        order2.displayOrder();
    }
}
