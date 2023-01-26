package People;

import java.util.ArrayList;

public class WeekendStudent extends Student {
    private int tuition;

    public WeekendStudent(String name, String surname, String PESEL, int age, String sex, int nr, ArrayList<Course> coursesList, int index, int semester, int tuition) {
        super(name, surname, PESEL, age, sex, nr, coursesList, index, semester);
        this.tuition = tuition;
    }

    public WeekendStudent(String name, String surname, String PESEL, int age, String sex, int nr, int index, int semester, int tuition) {
        super(name, surname, PESEL, age, sex, nr, index, semester);
        this.tuition = tuition;
    }


    public int getTuition() {
        return tuition;
    }

    public void setTuition(int tuition) {
        this.tuition = tuition;
    }

    public String toString(){
        return  getRole() + ": " + super.toString() + "czesne: " + tuition;
    }
}
