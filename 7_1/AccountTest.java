public class AccountTest{

    public static void main(String[] args){

    CheckingAccount accountOne = new CheckingAccount();
    accountOne.balance = 1000;
    accountOne.name = "Chloe";
    accountOne.interestRate = 0.04;

    accountOne.displayCustomer();
    accountOne.withdrawl(0);

    SavingsBond bondOne = new SavingsBond(40, 1500.00);
    bondOne.displayBonds();
    }

}