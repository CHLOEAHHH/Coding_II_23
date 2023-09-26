//Section 7, Lesson 4 Starter for Exercise 2 - Slide 14

public class Prisoner_Student_7_4 {
    //Fields 
    public String name;
    public double height;
    public int sentence;
    
    //Constructor
    public Prisoner_Student_7_4(String name, double height, int sentence){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    }
    public Prisoner_Student_7_4(){
        name = null;
        height = 0.0;
        sentence = 0;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void reflection(boolean think){

        System.out.println("My name is, " + name + " I am in prison for: " + sentence);

        if( think == true){
            think();
        }
     }
    
    
}
