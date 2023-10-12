import java.net.IDN;

public class Games{
    //fields
   private String teamOnePlaying;
   private String teamTwoPlaying;
   private int teamOneScore;
   private int teamTwoScore;
   private int IDNumber = 0;
   private int totalGames;

    //Constructor

    public Games(String teamOnePlaying, String teamTwoPlaying, int teamOneScore, int teamTwoScore){
        //change the teamone playing. teams > scheduler decides what teams are playing > sends to games
        this.teamOnePlaying = teamOnePlaying;
        this.teamTwoPlaying = teamOnePlaying;
        this.teamTwoScore = teamTwoScore;
        IDNumber++;
    }

    //methods

    public void scores(int getTemperature){
        
    }

    //getter and setter
    public String getTeamOnePlaying() {
        return teamOnePlaying;
    }
    public void setTeamOnePlaying(String teamOnePlaying) {
        this.teamOnePlaying = teamOnePlaying;
    }
    public String getTeamTwoPlaying() {
        return teamTwoPlaying;
    }
    public void setTeamTwoPlaying(String teamTwoPlaying) {
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
}