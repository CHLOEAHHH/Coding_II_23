import java.util.InputMismatchException;
import java.util.Scanner;

public class Scheduler {
    
    //fields
    private int temperature;
    private int freezingTempCounter = 0;

    //constructor
    public Scheduler(){
        
        Scanner sch = new Scanner(System.in);

        System.out.println("Enter a temperature: ");
        temperature = sch.nextInt();
        scheduleSeason();

        sch.close();
        }
    //methods

    public void scheduleSeason(){
    //creating each team
    Team one = new Team("The Winners", 0, 0, 0, 0,0);
    Team two = new Team("The Great", 0, 0, 0, 0,0);
    Team three = new Team("The Awesomes", 0, 0, 0, 0,0);
    Team four = new Team("The fabulous", 0, 0, 0, 0,0);
    
    //try catch to make sure bad code does not break program
        try{
            //if statement to check if userinput tempt is above 32 
        System.out.println("I am making a season schedule!");
        while (freezingTempCounter != 3){
            if (getTemperature() > 32){
                //create a game if it is above 32
                Games gameOne = new Games();
                Games gameTwo = new Games();
                freezingTempCounter = 0;
                }
            else {
                //no creation of a game and add counter to freezing tempt
                System.out.println("The temperature is freezing. There is no game tonight.");
                freezingTempCounter++;
                if (freezingTempCounter == 3){
                    System.out.println("Season is Over.");
                    teamStats();
                }
             }    
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Enter a valid input: ");
            scheduleSeason();
        }
        
    }

    public void teamStats(){
        try {
        for (int i = 0; i <= Team.teams.size(); i++){
        System.out.println("*********RESULTS*********");
        System.out.println(Team.teams.get(i).getTeamName());
        System.out.println("Wins: " + Team.teams.get(i).getWinTotal() + " , " + "Losses: " + Team.teams.get(i).getLossTotal() + " , " + "Tie Total: " + Team.teams.get(i).getTieTotal());
        System.out.println("Points Scored: " + Team.teams.get(i).getTotalGoals() + "Total Goals Allowed: " + Team.teams.get(i).getTotalGoalsAllowed());
        }

          } catch (IndexOutOfBoundsException e) {
            System.out.println("For loop goes past arraylist index.");
        }
    }

    //getter setters
     public int getTemperature() {
        return temperature;
        }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        }

    }



