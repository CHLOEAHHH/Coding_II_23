import java.util.Scanner;
import java.util.ListIterator;

public class Scheduler {
    
    //fields
    private int temperature;

    //constructor
    public Scheduler(int temperature){

        this.temperature = temperature;
        
        Scanner sch = new Scanner(System.in);

        sch.close();
        }
    //methods

    public void schedule(){

        if (getTemperature() > 32){
            //use listIterator to get random team from index or whatever
            setTeamOnePlaying = 
        } 
        else {
            System.out.println("The temperature is freezing. There is no game tonight.");
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



