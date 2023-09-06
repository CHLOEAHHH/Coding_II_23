import java.util.Scanner;


public class ProcessName {
    
    
public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your full name: ");
       String userFullName = console.nextLine();
       int spaceFinder = userFullName.indexOf(' ');
       String firstInitial = userFullName.substring(0,1);
       String lastName = userFullName.substring(spaceFinder + 1);
       System.out.println("Your name is: " + lastName + "," + " " + firstInitial + ".");
        // your code goes here

        console.close();

        
    }
}