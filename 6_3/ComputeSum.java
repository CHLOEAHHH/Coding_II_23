import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int sum = 0;
        
        System.out.println("Please enter 10 numbers.");
        System.out.println("Enter 0 to exit");
      
        for ( int i = 1; i <= 10; i++){
            int num = console.nextInt();
            sum = num + sum;
            System.out.println("Enter the next number: ");
                if (num == 0){
                    break;
                }
            }
            System.out.println("The total is: " + sum);
             console.close();
        }

       

    }

