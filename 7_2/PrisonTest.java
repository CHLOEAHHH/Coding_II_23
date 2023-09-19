public class PrisonTest {
    
    public static void main(String[] args){

        Prisoner bubba = new Prisoner();
        bubba.name = "Bubba";
        bubba.height = 2.08;
        bubba.yearsSentenced = 4;
        bubba.reflection();

        Prisoner twitch = new Prisoner();
        twitch.name = "Twitch";
        twitch.height = 1.73;
        twitch.yearsSentenced = 3;
        twitch.reflection();

        System.out.println(bubba==twitch);

        System.out.println(bubba.name == twitch.name);

        bubba.name = "Bubba";
        twitch.name = "Bubba";

        
        System.out.println(bubba.name == twitch.name);        
    }

}
