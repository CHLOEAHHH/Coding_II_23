//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonTest {
    public static void main(String[] args){
        Cell bubbaCell = new Cell("Cell One", false, 5435);
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4,bubbaCell);
        
        bubba.display(false);
        bubbaCell.setDoorOpen(4356);

    }
}
