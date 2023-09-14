public class CheckingAccount {
    //fields

   public double balance;
   
   public String name;

   public double interestRate;

   //methods
    public void displayCustomer(){
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);  
    }
     public void withdrawl(double x){
        if ( x < 0){
            System.out.println("Please enter a positive number");
        }
        else if (balance < x){
            System.out.println("You lack the funds to withdrawl.");
        }
        else {
            balance = balance - x;
            System.out.println("Your new balance is: " + balance);
        }
     }

}
