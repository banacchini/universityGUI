package People;

import java.util.ArrayList;

public class DayStudent extends Student {


    public DayStudent(String name, String surname, String PESEL, int age, String sex, int nr, ArrayList<Course> coursesList, int index, int semester) {
        super(name, surname, PESEL, age, sex, nr, coursesList, index, semester);
        this.setRole("Student Dzienny");
    }


}
