public class StringProjectTest {

    public static void main(String[] args){

        StringProject stats = new StringProject ("This land is your land.");
        System.out.println("Current string: " + stats); 
        System.out.println("Current String with reversed case: " + stats.reverseCase());
        System.out.println("Times 'a' appears in the string: " + stats.characterCount('a'));
        System.out.println("String Reversed: " + stats.reverseString());
        System.out.println("Number of words in the String: " + stats.wordCount());
    }
}
