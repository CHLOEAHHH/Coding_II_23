public class CalculatorTest4 {
    public static void main(String[] args) {
        double tableTotal = 0;
        Calculator4 calc = new Calculator4();
        
        //Name your friends
        tableTotal += calc.findTotal(10, "Peter");
        tableTotal += calc.findTotal(12, "Steve");
        tableTotal += calc.findTotal(9,  "Donald");
        tableTotal += calc.findTotal(8,  "Ryab");
        tableTotal += calc.findTotal(7,  "John");
        tableTotal += calc.findTotal(15, "Alex");
        tableTotal += calc.findTotal(11, "Sven");
        tableTotal += calc.findTotal(30, "Religh");

        //Find and print the entire table's total, including tax and tip
        System.out.println("Your table's total is: " + tableTotal);
    } 
}
