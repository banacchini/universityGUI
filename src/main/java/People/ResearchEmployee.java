package People;

import editStrategy.ResearchEmployeeEdit;
import salaryStrategy.ResearchSalaryCalculator;

import java.util.ArrayList;

public class ResearchEmployee extends Employee {
    private int numberOfPublications;

//    Konstruktor

    public ResearchEmployee(String name, String surname, String PESEL, int age, String sex, int nr, String position, int baseWage, int numberOfPublications) {
        super(name, surname, PESEL, age, sex, nr, position, baseWage);
        this.numberOfPublications = numberOfPublications;

        this.setRole("Pracownik Naukowy");
        this.setSalary(new ResearchSalaryCalculator().calculate(this));
        this.setEditor(new ResearchEmployeeEdit());
    }



//

//    Gettery i settery
    public int getNumberOfPublications() {
        return numberOfPublications;
    }


    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }


//

//    toString
    public String toString(){
        return getRole() + ": " + super.toString() + ", liczba publikacji: " + numberOfPublications;
    }
//

// Override abstrakcyjnych metod

    @Override
    public void setOvertime(float overtime) {

    }
    @Override
    public float getOvertime(){ return 0;}
//

}
