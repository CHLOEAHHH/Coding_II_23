import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[])
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Type a non-negative integer: ");
        int number = console.nextInt();
        double squareRt = Math.sqrt( number);
        while (number <= 0){
            System.out.println("Invalid number, try again: " + number );
            number = console.nextInt();
        }
        System.out.println("The square root of " + number + " is " + squareRt);
    
        console.close();
    }
    
}
