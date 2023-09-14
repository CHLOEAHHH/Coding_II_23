import javax.sound.sampled.SourceDataLine;

public class LoopShape {
    
    static void createRectangle(int width, int height){
    if (width < 1 || height < 1){
        System.out.println("Cannot print this rectangle.");
    }
        else {
        //Draw a Rectangle
        String rectangle = ""; 
    // first row
       for (int i = 0; i < width; i++){
        rectangle += "#";
       }
       // in between rows
       rectangle += "\n";
       for (int i = 0; i < height - 2; i++){
            rectangle += "#";
            for (int a = 0; a < width - 2; a++){
                rectangle += " ";
            }
            rectangle += "# \n";
       }

       // final row
       for (int i = 0; i < width; i++){
        rectangle += "#";
       }
       System.out.print(rectangle);
            }
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
       String triangle = "";

       //legs...
       for (int i = 0; i < leg; i++){
        triangle += "#";
        }
       } 
       //inner row legs?
       
    System.out.println(triangle);
    }
}
