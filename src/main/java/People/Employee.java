package People;

public abstract class Employee extends Person {

    private String position;
    private int baseWage;

    private float salary;

//    Constructor

    public Employee(String name, String surname, String PESEL, int age, String sex, int nr, String position, int baseWage) {
        super(name, surname, PESEL, age, sex, nr);
        this.position = position;
        this.baseWage = baseWage;
    }

//

//  Getters and Setters
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getBaseWage() {
        return baseWage;
    }

    public void setBaseWage(int baseWage) {
        this.baseWage = baseWage;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    //

//    toString()
    public String toString(){
        return "" + position + ", " + super.toString() + ", stawka godzinowa: " + baseWage + ", pensja: " + salary;
    }
}
//
