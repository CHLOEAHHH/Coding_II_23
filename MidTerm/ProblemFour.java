package MidTerm;
import java.util.Scanner;
public class ProblemFour {
    public static void main(String[] args){
        //variables
        double userInput;
        double meterConvsersion = 39.37;
        double meter;
        //getting user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a value for an inch: ");
        userInput = sc.nextDouble();
        sc.close();
        //conversions
        meter = userInput/meterConvsersion;
        System.out.println(userInput + " inch is " + meter + " meters");
    }
}
