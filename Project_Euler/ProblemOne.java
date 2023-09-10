public class ProblemOne {

    public static void main(String[] args){

        int totalSum = 0;

    for (int startingInt = 1; startingInt < 1000; startingInt++){
      
      if (startingInt % 3 == 0 || startingInt % 5 == 0){

        totalSum += startingInt;

      }

    }
      
        System.out.println(totalSum);
    }
}