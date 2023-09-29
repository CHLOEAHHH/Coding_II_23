package MidTerm;
import java.util.Scanner;
public class ProblemThree {
    public static void main(String[] args){
    //variables
    Scanner sc = new Scanner(System.in);
    int month;
    int year;
    String phrase = "";

    System.out.println("Input a month number: ");
    month = sc.nextInt();
    System.out.println("Input a year: ");
    year = sc.nextInt();
    sc.close();

    //finding month
    switch(month){
        case 1:
            phrase += "January ";
            break;
        case 2:
            phrase += "Feburary ";
            break;
        case 3:
            phrase += "March ";
            break;
        
        case 4:
            phrase += "April ";
            break;
        case 5:
            phrase += "May ";
            break;
        case 6:
            phrase += "June ";
            break;
         case 7:
            phrase += "July ";
            break;
        case 8:
            phrase += "Augest ";
            break;
        case 9:
            phrase += "September ";
            break;
        case 10:
            phrase += "October ";
            break;
        case 11:
            phrase += "November ";
            break;
        case 12:
            phrase += "December ";
            break;
        default:
          System.out.println("Rerun the code and enter a month number.");
        }

        if (month == 1|| month == 3 || month == 5 ||month == 7 || month == 8 || month == 10 || month == 12){
            phrase += year;
            phrase += " has "; 
            phrase += "31 days";
            //2016 2013/4= 503.25 how do I make an if statement identify if a decimal is present...
        } else if ( year % 4 == 0 && month == 2){
             phrase += year;
            phrase += " has "; 
            phrase += "29 days";
        } 
        
    }
}
