// Classes & Objects - Question 1: CoffeeOrder
// Author: S08-8511-2024
// Date: Nov 24, 2025

public class CoffeeOrder {
 
    String size;
    double price;

    
    public CoffeeOrder(String size, double price) {
        this.size = size;
        this.price = price;
    }

  
    public void displayOrder() {
        System.out.println("Coffee Size: " + size + ", Price: $" + price);
    }

   
    public static void main(String[] args) {
      
        CoffeeOrder order1 = new CoffeeOrder("Small", 2.50);
        CoffeeOrder order2 = new CoffeeOrder("Large", 4.75);

       
        order1.displayOrder();
        order2.displayOrder();
    }
}
