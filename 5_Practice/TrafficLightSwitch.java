import java.util.Scanner;


public class TrafficLightSwitch {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number coreseponding to a traffic light. Red = 1, Green = 2,  Yellow = 3");

        int lightColor = input.nextInt();
        
        input.close();

        switch (lightColor){
            case 1:
                 System.out.println("The next color is green.");
                 break;
            case 2:
                 System.out.println("The next color is yellow.");
                 break;
            case 3:
                 System.out.println("The next color is red.");
                 break;
            default: 
                System.out.println("Invalid color.");
        }
       
    }

}
