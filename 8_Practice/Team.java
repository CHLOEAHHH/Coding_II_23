import java.util.ArrayList;

public class Team {
    
    //fields
    private String teamName;
    private int winTotal;
    private int lossTotal;
    private int tieTotal;
    private int totalGoals;
    private int totalGoalsAllowed; 
    public static ArrayList<Team> teams = new ArrayList<Team>();  

    //constructor

    public Team(String teamName, int winTotal, int lossTotal, int tieTotal, int totalGoals, int totalGoalsAllowed){
        this.teamName = teamName;
        this.winTotal = winTotal;
        this.lossTotal = lossTotal;
        this.tieTotal = tieTotal;
        this.totalGoals = totalGoals;
        this.totalGoalsAllowed = totalGoalsAllowed;
        teams.add(this);
    }

    //methods
    public void teamStats(){

        System.out.println("*********RESULTS*********");
        System.out.println(teamName);
        System.out.println("Wins: " + winTotal + " , " + "Losses: " + lossTotal + " , " + "Tie Total: " + tieTotal);
        System.out.println("Points Scored: " + totalGoals + "Total Goals Allowed: " + totalGoalsAllowed);
    }

    //getters & setters
        public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public int getWinTotal() {
        return winTotal;
    }
    public void setWinTotal(int winTotal) {
        this.winTotal = winTotal;
    }
    public int getLossTotal() {
        return lossTotal;
    }
    public void setLossTotal(int lossTotal) {
        this.lossTotal = lossTotal;
    }
    public int getTieTotal() {
        return tieTotal;
    }
    public void setTieTotal(int tieTotal) {
        this.tieTotal = tieTotal;
    }
    public int getTotalGoalsAllowed() {
        return totalGoalsAllowed;
    }
    public void setTotalGoalsAllowed(int totalGoalsAllowed) {
        this.totalGoalsAllowed = totalGoalsAllowed;
    }
    public int getTotalGoals() {
        return totalGoals;
    }

    public void setTotalGoals(int totalGoals) {
        this.totalGoals = totalGoals;
    }
}
