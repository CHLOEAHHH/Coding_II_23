import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
      
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number coreseponding to a traffic light. Red = 1, Green = 2,  Yellow = 3");

        int lightColor = input.nextInt();
        
        input.close();

        if (lightColor == 1) {
            System.out.println("The next color is green.");
        } else if (lightColor == 2) {
            System.out.println("The next color is yellow.");
        } else if (lightColor == 3){
            System.out.println("The next color is red.");
        } else {
            System.out.println("Invalid color.");
        }


    }

}
