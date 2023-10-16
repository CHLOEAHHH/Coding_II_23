import java.util.ArrayList;
import java.util.Random;

public class Games{
    //fields
   private int teamOnePlaying;
   private int teamTwoPlaying;
   private int teamOneScore;
   private int teamTwoScore;
   private int IDNumber = 0;
   private int totalGames;
   public static ArrayList<Games> listGame = new ArrayList<Games>();  


    //Constructor

    public Games(){
    
        System.out.println("Constructing a game.");
        IDNumber++;
        totalGames++;
        matchMaker();
        listGame.add(this);

    }

    //methods

    public void matchMaker(){

        try {
        Random rand = new Random();
        //creating a random numbers from 0-3 
        int randomOne = rand.nextInt(Team.teams.size()); 
        int randomTwo;
        //making sure randomtwo does not equal random one with a post test.
        do {
            randomTwo = rand.nextInt(Team.teams.size());
        } while (randomOne == randomTwo);
        // setting team one playing = to random one
        setTeamOnePlaying(randomOne);

            //printing team one playing
        System.out.println(getTeamOnePlaying());

       
        setTeamTwoPlaying(randomTwo);

        //printing team two playing
        System.out.println(teamTwoPlaying);
    } 
    catch (IndexOutOfBoundsException e) {
        System.out.println("There was an error in matchmaking try again.");
    }


    }

    public void scores(int getTemperature){
        Random rand = new Random();
        //if temp is higher than 80 each team's score is randomized from a 0 - 10 defense is weak
        if (getTemperature > 80){
            teamOneScore = rand.nextInt(10);
            teamTwoScore = rand.nextInt(10);
        }
        //weather is normal then defence is good meaning less goals will be scored for both teams
        else {
            teamOneScore = rand.nextInt(5);
            teamTwoScore = rand.nextInt(5);
        }
        Team.teams.get(teamOnePlaying).setTotalGoals(++teamOneScore);
        Team.teams.get(teamTwoPlaying).setTotalGoals(++teamTwoScore);
        Team.teams.get(teamOnePlaying).setTotalGoalsAllowed(++teamTwoScore);
        Team.teams.get(teamTwoPlaying).setTotalGoals(++teamOneScore);
    }

    public void winLoss(){
        int teamOneWins =  Team.teams.get(teamOnePlaying).getWinTotal();
        int teamTwoWins =  Team.teams.get(teamTwoPlaying).getWinTotal();
        if (teamOneScore > teamTwoScore){
            Team.teams.get(teamOnePlaying).setWinTotal(teamOneWins + 1);
        }
    }

    //getter and setter
    public int getTeamOnePlaying() {
        return teamOnePlaying;
    }
    public void setTeamOnePlaying(int teamOnePlaying) {
        this.teamOnePlaying = teamOnePlaying;
    }
    public int getTeamTwoPlaying() {
        return teamTwoPlaying;
    }
    public void setTeamTwoPlaying(int teamTwoPlaying) {
        this.teamTwoPlaying = teamTwoPlaying;
    }
    public int getTeamOneScore() {
        return teamOneScore;
    }
    public void setTeamOneScore(int teamOneScore) {
        this.teamOneScore = teamOneScore;
    }
    public int getTeamTwoScore() {
        return teamTwoScore;
    }
    public void setTeamTwoScore(int teamTwoScore) {
        this.teamTwoScore = teamTwoScore;
    }
    public int getIDNumber() {
        return IDNumber;
    }
    public void setIDNumber(int iDNumber) {
        IDNumber = iDNumber;
    }
    public int getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(int totalGames) {
        this.totalGames = totalGames;
    }
}