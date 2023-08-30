import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[])
    {
        String firstName;

        String middleName;

        String lastName; 

        String fullName;

        Scanner names = new Scanner(System.in);

        System.out.println("Enter your first name:");
        firstName = names.nextLine();

        System.out.println("Entter your middle name:");
        middleName = names.nextLine();

        System.out.println("Enter your last name:");
        lastName = names.nextLine();

        fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("Your full name is: " + fullName);

        names.close();
    }
    
}
