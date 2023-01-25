package People;

import java.util.ArrayList;

public class AdministrativeEmployee extends Employee {

    private float overtime;

//    Constructor

    public AdministrativeEmployee(String name, String surname, String PESEL, int age, String sex, String position, int baseWage, float overtime) {
        super(name, surname, PESEL, age, sex, position, baseWage);
        this.overtime = overtime;
        this.setRole("Pracownik Administracyjny");
    }

//


//    Getters and Setters
    public float getOvertime() {
        return overtime;
    }

    public void setOvertime(float overtime) {
        this.overtime = overtime;
    }
//

//    toString
    public String toString(){
        return getRole() + ": " + super.toString() + ", ilosc nadgodzin: " + overtime;
    }
//

//    Override of abstract methods used in other classes


    @Override
    public ArrayList<Course> getCoursesList() {
        return null;
    }

    @Override
    public void setCoursesList(ArrayList<Course> coursesList) {

    }

    @Override
    public int getIndex() {
        return 0;
    }

    @Override
    public void setIndex(int index) {

    }

    @Override
    public int getSemester() {
        return 0;
    }

    @Override
    public void setSemester(int semester) {

    }
//
}
