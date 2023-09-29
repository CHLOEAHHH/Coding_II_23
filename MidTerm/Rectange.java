package MidTerm;

public class Rectange {
    //fields
    private int width;
    private int height;
    private int area;
    private int perimeter;

    //constructor
    public Rectange(int width, int height){
        this.width = width;
        this.height = height;
    }
    //methods
    public void calcArea(){
        area = width * height;
        System.out.println(area);
    }

    public void calcPerimeter(){
        perimeter = 2*(width + height);
        System.out.println(perimeter);
    }
    //getters + setters
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
