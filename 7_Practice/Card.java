public class Card {
    
//fields
private int currentCreditBalance;
private int ticketBalance;
private int cardNumber;

//constructor
public Card(int currentCreditBalance, int ticketBalance, int cardNumber){
    this.currentCreditBalance = currentCreditBalance;
    this.ticketBalance = ticketBalance;
    this.cardNumber = cardNumber;
    cardNumber = (int) (Math.random() * 1000);
}
//methods

//getters
public int getCurrentCreditBalance(){
    return currentCreditBalance;
}
public int getTicketBalance(){
    return ticketBalance;
}
public int getCardNumber(){
    return cardNumber;
}
//setters
public void setCurrentCreditBalance(int currentCreditBalance){
    this.currentCreditBalance = currentCreditBalance;
}
public void setTicketBalance(int ticketBalance){
    this.ticketBalance = ticketBalance;
}
public void setGetCardNumber(int CardNumber){
    this.cardNumber = cardNumber;
}
}
