package People;

import java.io.Serializable;

public class Course implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String teacher;
    private int ECTS;
    private float grade;


//    Constructor

    public Course(String name, String teacher, int ECTS, float grade) {
        this.name = name;
        this.teacher = teacher;
        this.ECTS = ECTS;
        this.grade = grade;
    }
//    ______________________________________________________________________________

//    Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
//    ______________________________________________________________________________

//    toString
    public String toString(){
        return "Kurs: " + name + ", prowadzacy: " + teacher + ", ECTS: " + ECTS + ", ocena: " + grade;
    }
//    ______________________________________________________________________________
}
