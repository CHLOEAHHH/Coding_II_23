import java.util.Scanner;
class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner number = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        System.out.println("Provide three integers:");
        
        int numberOne = number.nextInt();
        int numberTwo = number.nextInt();
        int numberThree = number.nextInt();

        int totalSum = numberOne + numberTwo + numberThree;

        System.out.println("Here is the sum of the three numbers:" + " " + totalSum);
        
        //Remember to close the Scanner
        number.close();
    }
}
