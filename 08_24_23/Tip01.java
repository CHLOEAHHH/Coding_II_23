public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        double taxPercent = 0.05;
    double tip = 0.15;
    int personOne = 10;
    int personTwo = 12;
    int personThree = 9;
    int personFour = 8;
    int personFive = 7;
    int personSix = 15;
    int personSeven = 11;
    int  personEight = 30;
    //Calculating total
    double personOneTotal = personOne + (personOne *taxPercent) + (personOne * tip);
     double personTwoTotal = personTwo + (personTwo *taxPercent) + (personTwo * tip);
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
         System.out.println(personOneTotal);

    }    
}
