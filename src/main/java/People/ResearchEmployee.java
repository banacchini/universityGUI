package People;

import java.util.ArrayList;

public class ResearchEmployee extends Employee {
    private int numberOfPublications;

//    Constructor

    public ResearchEmployee(String name, String surname, String PESEL, int age, String sex, int nr, String position, int baseWage, int numberOfPublications) {
        super(name, surname, PESEL, age, sex, nr, position, baseWage);
        this.numberOfPublications = numberOfPublications;
        this.setRole("Pracownik Naukowy");
    }



//

//    Getters and Setters
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

// Override of abstract methods used in other classes


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
