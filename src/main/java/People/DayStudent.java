package People;

import java.util.ArrayList;

public class DayStudent extends Student {

    private float attendance;

    public DayStudent(String name, String surname, String PESEL, int age, String sex, int nr, ArrayList<Course> coursesList, int index, int semester, float attendance) {
        super(name, surname, PESEL, age, sex, nr, coursesList, index, semester);
        this.setRole("Student Dzienny");
        this.attendance = attendance;
    }

    public DayStudent(String name, String surname, String PESEL, int age, String sex, int nr, int index, int semester, float attendance) {
        super(name, surname, PESEL, age, sex, nr, index, semester);
        this.setCoursesList(new ArrayList<Course>());
        this.setRole("Student Dzienny");
        this.attendance = attendance;
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
