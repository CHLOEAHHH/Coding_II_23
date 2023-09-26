public class ProblemThree {
    //fields
    long initialNumber = 13195L;
    long primeNumber = 2L;
    long primeFactor;
    long largestPrimefactor = 0L;

    //constructors unneeded

    //methods
    public void calculator(){
        while (primeFactor != 0){
            // 1319 / 2
            // moves to next prime number
            primeFactor = initialNumber / primeNumber;

            //prime number adjuster
            primeNumber++;
            //prime numbers cannot be divided by 2 or 5 evenly
            if (primeNumber % 2 != 0 || primeNumber % 5 != 0){
                
            }

        }
    }

}
