public class Cat {
    public String name = "Buddy";
    public int age = 20;
    public String breed = "Simease Cat";
    public String favoriteFood = "Burgers";

    public void catMeow () {
        System.out.println(name + " goes MEOW");
    }
    public void catPlay () {
        System.out.println(name + " plays");
    }
    public void catWash () {
        System.out.println(name + " does not like baths");
    }
    public void catEats () {
        System.out.println(name + " eats " + favoriteFood );
    }
    public void catHunts () {
        System.out.println(name + " hunts mice");
    }
}