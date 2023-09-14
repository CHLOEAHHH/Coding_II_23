import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
       
        Scanner console = new Scanner(System.in);

        System.out.println("Enter a number.");
        int userInput = console.nextInt();
        int multiplier = 0;
        for (int i = 1; i <= 12; i++ ){
          multiplier = userInput*i;
          System.out.println(userInput + "x" + i + "=" + multiplier);
        }

        console.close();

    }

}
