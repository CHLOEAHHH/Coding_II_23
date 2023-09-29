public class Game {
    
    //fields
    private boolean swipeCard;
    private int creditSubtractor;
    private int ticketReward;
    private Card card;

    //constructor
    public Game(boolean swipeCard, int creditSubtractor, int ticketReward, Card card){
        this.swipeCard = swipeCard;
        this.creditSubtractor = creditSubtractor;
        this.ticketReward = ticketReward;
        this.card = card;
    }

    //methods
    public void play(Card card){    
        card.setCurrentCreditBalance(card.getCurrentCreditBalance() - 5);
    }
    public void recieveTickets(Card card){
        ticketReward = (int) (Math.random() * 100);
        card.setTicketBalance(card.getTicketBalance() + ticketReward);
    }

    //getters & setters
    public void setSwipeCard(boolean swipeCard) {
        this.swipeCard = swipeCard;
    }

    public void setCreditSubtractor(int creditSubtractor) {
        this.creditSubtractor = creditSubtractor;
    }

    public void setTicketReward(int ticketReward) {
        this.ticketReward = ticketReward;
    }

    public boolean isSwipeCard() {
        return swipeCard;
    }

    public int getCreditSubtractor() {
        return creditSubtractor;
    }

    public int getTicketReward() {
        return ticketReward;
    }
}
