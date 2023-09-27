public class StringProject {
    
    //fields
    private String myString;
    public String reverseCaseString = "";
    public String temporaryString;

    //constructor   
    public StringProject (String str) {
        myString = str;
    }
    
    //methods
    public String toString() {
        return myString;
    }

   public String reverseCase(){
        for (int i = 0; i < myString.length(); i++){
        char charComparision = myString.charAt(i);
            if (Character.isUpperCase(charComparision)){
               reverseCaseString += Character.toLowerCase(charComparision);
            } else if (Character.isLowerCase(charComparision)){
                reverseCaseString += Character.toUpperCase(charComparision);
            }
            else {
                reverseCaseString += charComparision;
            }
        }
            return reverseCaseString;
            }

    public int characterCount(char ily){
        int characterOccurance = 0;
        for (int i = 0; i < myString.length(); i++){
            char charComparision = myString.charAt(i);
            if (charComparision == ily){
                characterOccurance++;
            }
            else {

            }
        }
        return characterOccurance;
    }
//This land is your land.
    public String reverseString(){
        String reversalString = "";
        for (int i = myString.length() - 1; i >= 0; i--){
            char charComparision = myString.charAt(i);
            reversalString += charComparision;
        }
         return reversalString;
        }

     public String eachWordOnALine(){
      String temporaryString = myString;
        String newString = " ";
        char spaceComp = ' ';

        for (int i = 0; i < myString.length(); i++){
            if (temporaryString.charAt(i) == spaceComp){
                newString += "\n";
            } else {
                newString += temporaryString.charAt(i);
            }
        }

        return newString;
     }  

     public int wordCount(){
        int wordCounter = 0;
        char spaceComp = ' ';
        for (int i = 0; i < myString.length(); i++){
            if (myString.charAt(i) == spaceComp){
                wordCounter++;
            }
        }
        wordCounter++;
        return wordCounter;
     }

     public int characterCount(){

         int characterCounter = 0;
        char spaceComp = ' ';

        for (int i = 0; i < myString.length(); i++){
           if (myString.charAt(i) != spaceComp){
            characterCounter++;
           }
        }
        return characterCounter;
     }

     public int averageWordLength(){

        int wordCounter = wordCount();
        int characterCounter = characterCount();

        int averageWordL = characterCounter / wordCounter;

        return averageWordL;

     }

     public int vowelCount(){

        int vowelCounter = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

         for (int i = 0; i < myString.length(); i++){

            for (char vowel : vowels){
                
                if (myString.charAt(i) == vowel){
                    vowelCounter++;
                    break;
                }
            }
         }
        return vowelCounter;
     }

    /* public String substrCount(String str){

        int subsTringOccurance = 0;

        for (int i = 0; i < myString.length(); i++){

            if (){

            }

        }

     }  */

     public boolean isPalindrome(){

        boolean isPalindromee = true;
        String temporaryString = " ";

        for (int i = 0; i < myString.length(); i++){
            char charComparision = myString.charAt(i);
            temporaryString += charComparision;
            }

        temporaryString = temporaryString.toLowerCase();

        String reversalString = "";

        for (int i = myString.length() - 1; i >= 0; i--){
            char charComparision = myString.charAt(i);
            reversalString += charComparision;
        }
         
        if (temporaryString.equals(reversalString)){
            isPalindromee = false;
        } 
        return isPalindromee;
    }
    
}


