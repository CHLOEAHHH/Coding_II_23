import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        Scanner testInput = new Scanner(System.in);
        int[] tests = new int[5];
       for (int i = 0; i < tests.length; i++){
            System.out.println("Enter the test score out of 100");
            tests[i] = testInput.nextInt();
       }
        testInput.close();
        int totalScore = 0;
        for (int i = 0; i < tests.length; i++){
            totalScore += tests[i];
        }
        double average = totalScore / tests.length;

        System.out.println(average);
        
        
    }

}
