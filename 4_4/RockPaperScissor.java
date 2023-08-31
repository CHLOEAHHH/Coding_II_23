import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {

    public static void main(String[] args) {
        Scanner userHand = new Scanner(System.in);
        System.out.println("Enter a  number between 0 and 2");
        int userInput = userHand.nextInt();
        Random rockPaperScis = new Random();
     int hand = rockPaperScis.nextInt(3);
        if (hand == 0) {
            System.out.println("The computer is a rock.");
        }
        if (hand == 1) {
            System.out.println("The computer is paper.");
        }
        if (hand == 2) {
            System.out.println("The computer is a scissors.");
        }
        if (userInput == hand){
            System.out.println("It is a tie.");
        }
        
        userHand.close();
    }
}
