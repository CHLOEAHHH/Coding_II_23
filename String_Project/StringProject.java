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
        String spaceComp = " ";

        for (int i = 0; i < myString.length(); i++){
            if (temporaryString.charAt(i) == spaceComp){
                newString += "\n";
            } else {
                newString += temporaryString.charAt(i);
            }
        }

        return newString();
     }  
}

