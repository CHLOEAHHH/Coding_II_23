
import java.util.Scanner;
//BMI=WEIGHT/HEIGHT^2*703
public class ComputeBMI {
    public static void main(String[] args){
        Scanner bmiScanner = new Scanner(System.in);
        System.out.println("Enter your weight in pounds:");
        double userWeight = bmiScanner.nextDouble();
        System.out.println("Enter your height in inches");
        double userHeight = bmiScanner.nextDouble();
        double bmi = Math.ceil((userWeight/(Math.pow(userHeight, 2)))*703);
        System.out.println("Your body mass index is: " + bmi);
        bmiScanner.close();

    }
}
