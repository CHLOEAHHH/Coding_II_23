package MidTerm;

public class Employee {
    //fields
    private int  employee_id;
    private String employee_name;
    private int employee_salary;
    //constructor
    public Employee(int employee_id, String employee_name, int employee_salary){
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }
    //methods
  /*   public void displayEmployee(){
        System.out.println("Name:" + getEmployee_name());
        System.out.println("ID: " + employee_id);
        System.out.println("Salary: " + getEmployee_salary());
    }*/
    //getter + setter
    public int getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
    public String getEmployee_name() {
        char spaceComp = ' ';
        String lastFirst = "";
        //Chloe Williams
        //Steve Jobs
        lastFirst += employee_name.substring(employee_name.indexOf(spaceComp) + 1);
        lastFirst += ',';
        lastFirst += spaceComp;
        lastFirst += employee_name.substring(0, employee_name.indexOf(spaceComp));
        return lastFirst;
    }
    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;

    }
    public int getEmployee_salary() {
        return employee_salary;
    }
    public void setEmployee_salary(int employee_salary) {
        this.employee_salary = employee_salary;
    }
}
