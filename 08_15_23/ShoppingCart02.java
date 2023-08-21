public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 15.99;
        
        double tax = 1.03;

        int quantity = 3;
        
        // Declare and assign a calculated totalPrice
        
        double totalPrice = tax * ( quantity *price);
        
        // Modify message to include quantity 
        
        System.out.println(message + custName + " " + "bought " + quantity + " three shirts");
        
        // Print another message with the total cost
        System.out.println("The total cost is $" + totalPrice);
    }    
}
