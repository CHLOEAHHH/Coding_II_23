public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int eggsPerChicken = 4;
        int totalEggs = 0;
        //Monday Chickens
        int chickenCount = 8;
        totalEggs = eggsPerChicken * chickenCount;
        System.out.println(totalEggs);
        //Tuesday Chickens
        chickenCount++;
        totalEggs = (eggsPerChicken * chickenCount) + totalEggs;
        System.out.println(totalEggs);
        //Wednesday Chickens
        chickenCount/= 2;
        totalEggs = (eggsPerChicken * chickenCount) + totalEggs;
        System.out.println(totalEggs);
    }   
}
