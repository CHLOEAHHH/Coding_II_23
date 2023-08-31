public class TestClass {

    public static void main(String args[]) {
        ComputeMethods fun = new ComputeMethods();
        //Create an instance of ComputeMethods, 
        //invoke the 3 methods and dispay their results
       System.out.println("The temperature in celsius is: " + fun.fToC(87.5));
        System.out.println("The hypotenuse is: " + fun.hypotenuse(10, 7));
        System.out.println("The sum of the two dice is: " + fun.roll());
    }
}
//System.out.println("The temperature in celsius is: " + celsius);
//System.out.println("The sum of the two dice is: " + bothDi);
