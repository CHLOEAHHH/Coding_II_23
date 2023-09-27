public class Cell{  

    //fields
  private  String nameOfTheCell;
  private  boolean doorOpen;
  private int securityCode;


    //constructors

    public Cell(String n, boolean d, int code){

        nameOfTheCell = n;

        doorOpen = d;

        securityCode = code;
    }

    //methods

    public String getNameOfCell(){
        return nameOfTheCell;
    }
    public boolean getDoorOpen(){
        return doorOpen;
    }

    public void setDoorOpen(int fourDigits){

        if (fourDigits != securityCode){
            System.out.println("Inccorect code");
        } else if (doorOpen == false){
            doorOpen = true;
        } else {
            doorOpen = false;
        }

        System.out.println(doorOpen);

    }

}