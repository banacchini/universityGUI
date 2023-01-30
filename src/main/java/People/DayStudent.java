package People;

import editStrategy.DayStudentEdit;
import scholarshipStrategy.DayStudentScholarship;

import java.util.ArrayList;

public class DayStudent extends Student {

    private float attendance;

    public DayStudent(String name, String surname, String PESEL, int age, String sex, int nr, ArrayList<Course> coursesList, int index, int semester, float attendance) {
        super(name, surname, PESEL, age, sex, nr, coursesList, index, semester);
        this.attendance = attendance;

        this.setEditor(new DayStudentEdit());
        this.setRole("Student Dzienny");
        this.setChecker(new DayStudentScholarship());

    }

    public DayStudent(String name, String surname, String PESEL, int age, String sex, int nr, int index, int semester, float attendance) {
        super(name, surname, PESEL, age, sex, nr, index, semester);
        this.setCoursesList(new ArrayList<Course>());
        this.attendance = attendance;

        this.setEditor(new DayStudentEdit());
        this.setRole("Student Dzienny");
        this.setChecker(new DayStudentScholarship());
    }

    public float getAttendance() {
        return attendance;
    }

    public void setAttendance(float attendance) {
        this.attendance = attendance;
    }


//    toString()
    public String toString(){
        return getRole() + ": " + super.toString() + ", frekwencja: " + attendance*100 + "%";
    }

}
