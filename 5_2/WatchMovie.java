import java.util.Scanner;

public class WatchMovie {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the movie ticket price \n");
        double ticketPrice = sc.nextDouble();
        int movieRating = 5;
        if (ticketPrice >= 12 && movieRating == 5){
            System.out.println("I\'m interested in watching the movie");
        }
        else{
            System.out.println("I am not interested in watching the movie");
        }
        sc.close();
    }
}
