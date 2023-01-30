package People;

import editStrategy.AdministrativeEmployeeEdit;
import salaryStrategy.AdministrativeSalaryCalculator;

import java.util.ArrayList;

public class AdministrativeEmployee extends Employee {

    private float overtime;

//    Konstruktor

    public AdministrativeEmployee(String name, String surname, String PESEL, int age, String sex, int nr, String position, int baseWage, float overtime) {
        super(name, surname, PESEL, age, sex, nr, position, baseWage);
        this.overtime = overtime;

        this.setRole("Pracownik Administracyjny");
        this.setSalary(new AdministrativeSalaryCalculator().calculate(this));
        this.setEditor(new AdministrativeEmployeeEdit());
    }


//


//    Gettery i settery
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

//    Override metod, z ktorych korzystam w innych klasach


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
    public void setSemester(int semester) {    }
    @Override
    public int getNumberOfPublications() {
        return 0;
    }

    @Override
    public void setNumberOfPublications(int numberOfPublications) {     }
//
}
