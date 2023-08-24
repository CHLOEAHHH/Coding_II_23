public class CalculatorTest3 {
    public static void main(String[] args) {
        
       Calculator3 calc = new Calculator3();
       
       calc.findTotal(10, "Jesse");
       calc.findTotal(12, "Micheal");
       calc.findTotal(9, "Fred");
       calc.findTotal(8, "Ryan");
       calc.findTotal(7, "Jacob");
       calc.findTotal(15, "Alex");
       calc.findTotal(11, "Rex");
       calc.findTotal(30, "Doc");
       //Use the Calculator object and arguments supplied to findTotal()
       //to print the total for each person

       
       
       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
    }    
}
