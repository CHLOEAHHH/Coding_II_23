import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        //creating scanner
        Scanner input = new Scanner(System.in);
        //Prompting user
        System.out.println("Enter a wavelength between 380-750");
        //Input holding variable
        double waveLength = input.nextDouble();
        input.close();
        if (waveLength >= 380 && waveLength < 450){
            System.out.println("The color is Violet");
        }

        if (waveLength >= 450 && waveLength < 495){
            System.out.println("The color is Blue");
        }

        if (waveLength >= 495 && waveLength < 570){
            System.out.println("The color is Green");
        }
        if (waveLength >= 570 && waveLength < 590){
            System.out.println("The color is Yellow");
        }
        if (waveLength >= 590 && waveLength < 620){
            System.out.println("The color is Orange");
        }
        if (waveLength >= 620 && waveLength < 750){
            System.out.println("The color is Red");
        }
        if (waveLength < 380){
            System.out.println("The entered wavelength is not a part of the visible spectrum.");
        }

        }
    }
