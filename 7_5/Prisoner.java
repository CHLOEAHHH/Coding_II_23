//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class Prisoner {
    //Fields 
    public String name;
    public double height;
    public int sentence;
    public Cell prisonCell;
    
    //Constructor
    public Prisoner(String name, double height, int sentence, Cell prisonCell){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    this.prisonCell = prisonCell;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(boolean b){
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);
        System.out.println("Cell: " + prisonCell.getNameOfCell());
    }

   /* public void openDoor(){

        /*  if (prisonCell.doorOpen){
            prisonCell.doorOpen = false;
            System.out.println("The door is now closed");
        } else {
            prisonCell.doorOpen = true;
            System.out.println("The door is now open.");
        } 

        if (prisonCell.doorOpen == false){
            prisonCell.doorOpen = true;
            System.out.println("Door opens");
        } else {
            prisonCell.doorOpen = false;
            System.out.println("Door closes");
        }
    }  */
    
}
