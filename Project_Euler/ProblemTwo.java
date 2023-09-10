public class ProblemTwo {

    public static void main(String[] args){
// x = a + b, c = b + x
        int a = 1;
        int totalSum = 0;
        for (int i = 1; i <= 4000000;){
           
            if (i % 2 == 0){
                i = a + i;
            }
            if (a != i - 1){
                a = a + 1;
            }
            if(i<=4000){
            totalSum = i;
            }
        }
        System.out.println("The total sum is: ");
    }
}
