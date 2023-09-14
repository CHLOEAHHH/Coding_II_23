import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        int pin = 6503;
        System.out.println("Enter your four digit pin");
        int userInput = console.nextInt();

        while ( userInput != pin){
            System.out.println("Re-enter the pin: ");
            userInput = console.nextInt();
        }
        System.out.println("Correct pin");

        console.close();

    }
}
