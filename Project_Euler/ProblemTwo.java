public class ProblemTwo {
    
// x = a + b, c = b + x
//Fn = Fn-1+Fn-2
//fields
long fnOne = 0L;
long fnTwo = 1L;
long fn = 0L;
long totalEvenSum;
//constructors none
//methods
    public void evenFibNumbe(){
     //   for (int b = 0; b < 4000000; b++){ 
            while ( fn < 4000000 ){
            //1 = 1 + 0
            //2 = 1 + 1
            //3 = 2 + 1
            fn = fnOne + fnTwo;

            if(fn % 2 == 0){
                totalEvenSum += fn;
            }
            //0 becomes 1
            //1 becomes 1
            //1 becomes 2
            fnTwo = fnOne;
            //1 becomes 1
            //1 becomes 2
            //2 becomes 3
            fnOne = fn;
            }
        System.out.println(fn);
        System.out.println(totalEvenSum);
    }
}
        
    //tesitng space on a small scale
   /* public void mathTest(){
        for (int b = 0; b < 10; b++){ 
            //1 = 1 + 0
            //2 = 1 + 1
            //3 = 2 + 1
            fn = fnOne + fnTwo;
            //0 becomes 1
            //1 becomes 1
            //1 becomes 2
            fnTwo = fnOne;
            //1 becomes 1
            //1 becomes 2
            //2 becomes 3
            fnOne = fn;
            if(fn % 2 == 0){
                totalEvenSum += fn;
            }
        System.out.println(fn);
        }
        System.out.println(totalEvenSum);
        */