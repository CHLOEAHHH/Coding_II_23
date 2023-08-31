import java.util.Random;


public class ComputeMethods {
    public double fToC(double degreesF){
    double celsius = 0.5555555556*(degreesF - 32);
    return celsius;
    
    }
    public double hypotenuse(int a, int b){
    double hypotenuse = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    return hypotenuse;
    }
    public int roll(){
    Random rndDice = new Random();
    int diceOne = rndDice.nextInt(6) + 1;
    int diceTwo = rndDice.nextInt(6) + 1;
    int bothDi = diceOne + diceTwo;
    return bothDi;
    }
}

