import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        Scanner userAge = new Scanner(System.in);
        System.out.println("Enter your age:");
        int yearOfUser = userAge.nextInt();
        boolean drivingUnderAge = false;
        drivingUnderAge = userAge <= 18;
        System.out.println(drivingUnderAge);
        
        userAge.close();
       
    }
}
