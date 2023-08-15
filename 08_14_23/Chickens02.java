public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        final int MEGGS;
        final int TEGGS;
        final int WEGGS;
        //Monday
        MEGGS = 100;
        //Tuesday
        TEGGS = 121;
        //Wednesday
        WEGGS = 117;
        //Calculating
        int dailyAverage = (MEGGS + TEGGS + WEGGS)/3;
        int monthlyAverage = dailyAverage * 30;
        double monthlyProfit = 0.18 * monthlyAverage;
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
