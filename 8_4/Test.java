public class Test{
public static void main(String[] args){
    int n = 10;
    int sum = 0;
    while (n >= 1){
    sum = sum + n;
    n--;
    }//end while
    System.out.println("The sum of the integers 1 to 10 is " + sum);
    }
}