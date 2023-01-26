package People;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String surname;
    private String PESEL;
    private int age;
    private String sex;
    private String role;

    private Integer nr;

//      Constructor
    public Person(String name, String surname, String PESEL, int age, String sex, int nr) {
        this.name = name;
        this.surname = surname;
        this.PESEL = PESEL;
        this.age = age;
        this.sex = sex;
        this.nr = nr;
    }
//    ______________________________________________________________________________

//    Getters and setters

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRole(){return role;}

    public void setRole(String role){this.role = role;}
//    ______________________________________________________________________________

//    toString
    public String toString() {
        return "" + surname + " " + name + ", PESEL: " + PESEL + ", wiek: " + age + ", plec: " + sex;
    }
//    ______________________________________________________________________________

//    abstract methods used in later stages

//    Students methods
    public abstract ArrayList<Course> getCoursesList();

    public abstract void setCoursesList(ArrayList<Course> coursesList);


    public abstract int getIndex();

    public abstract void setIndex(int index);

    public abstract int getSemester();

    public abstract void setSemester(int semester);
//    ______________________________________________________________________________

//    Employee methods

    public abstract int getBaseWage();
    public abstract int getNumberOfPublications();

    public abstract float getOvertime();
}
