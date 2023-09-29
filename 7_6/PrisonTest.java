//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class PrisonTest {
    public static void main(String[] args){
        Cell cellA1 = new Cell("A1", false, 1234);
        Cell cellB1 = new Cell("B1", false, 1234);
        Cell cellC1 = new Cell("C1", false, 1234);
        Cell cellD1 = new Cell("D1", false, 1234);
        
      System.out.println(Prisoner.getPrisonerCount());

        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, cellA1);
        bubba.display();
        Prisoner bubba2 = new Prisoner("Bubba", 2.08, 4, cellA1);
        bubba2.display();
        Prisoner bubba3 = new Prisoner("Bubba", 2.08, 4, cellA1);
        bubba3.display();
        Prisoner bubba4 = new Prisoner("Bubba", 2.08, 4, cellA1);
        bubba4.display();

      System.out.println(Prisoner.getPrisonerCount());

    }
}
