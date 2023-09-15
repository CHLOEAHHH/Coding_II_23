public class SavingsBond {
    //fields
    //bond length
    public int term;
    public double interest;
    public double initialDeposit;
    public double earnings;

    //class constructor
    public SavingsBond(int userTerm, double intialAmount){
        term = userTerm;
        initialDeposit = intialAmount;
        //determining interest
        if (term >= 48 && term <= 60){
            interest = 0.025;
            System.out.println("Your interest is 2.5%");
        }
         else if (term >= 36 && term <= 47){
            interest = 0.02;
            System.out.println("Your interest is 2.0%");
        }
         else if (term >= 24 && term <= 35){
            interest = 0.015;
            System.out.println("Your interest is 1.5%");
        }
         else if (term >= 12 && term <= 23){
            interest = 0.01;
            System.out.println("Your interest is 1.0%");
        }
         else if (term >= 0 && term <= 11) {
            interest = 0.005;
            System.out.println("Your interest is 0.5%");
        }
        else {
            System.out.println("Please enter a term between one and sixty months.");
        }

        //determing how much they make back
        //A = P(1 + r)^n
        earnings = (initialDeposit * (Math.pow(1 + interest, term)));
    }
    public void displayBonds(){
        System.out.println("Bond term: " + term);
        System.out.println("Purchased for: " + initialDeposit);
        System.out.println("Your earning is: " + earnings);
    }
}
