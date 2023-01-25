package People;

import java.util.ArrayList;

public class DayStudent extends Student {


    public DayStudent(String name, String surname, String PESEL, int age, String sex, ArrayList<Course> coursesList, int index, int semester) {
        super(name, surname, PESEL, age, sex, coursesList, index, semester);
        this.setRole("Student Dzienny");
    }

    public DayStudent(String name, String surname, String PESEL, int age, String sex, int index, int semester) {
        super(name, surname, PESEL, age, sex, index, semester);
        this.setRole("Student Dzienny");
    }


}
