public class Calculator2 {
    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 12;
    // i love you so so much more
    public void findTotal(){
        //Calculate an individual's total after tax and tip
        double totalFees = originalPrice + (originalPrice * tax) + (originalPrice * tip);
        //Print this value
        System.out.println("Your total is: " + totalFees);
    }


}
