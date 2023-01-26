package People;

import java.util.ArrayList;

public abstract class Student extends Person{
    private ArrayList<Course> coursesList;
    private int index;
    private int semester;

//    Konstruktory, jeden z utworzona wczesniej lista kursow, drugi tworzy pusta liste kursow i przypisuje ja studentowi

    public Student(String name, String surname, String PESEL, int age, String sex, int nr, ArrayList<Course> coursesList, int index, int semester) {
        super(name, surname, PESEL, age, sex, nr);
        this.coursesList = coursesList;
        this.index = index;
        this.semester = semester;
    }

    public Student(String name, String surname, String PESEL, int age, String sex, int nr, int index, int semester) {
        super(name, surname, PESEL, age, sex, nr);
        this.index = index;
        this.semester = semester;
        this.coursesList = new ArrayList<Course>();
    }

    //  ______________________________________________________________________________

// Getters and setters

    public ArrayList<Course> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(ArrayList<Course> coursesList) {
        this.coursesList = coursesList;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
//  ______________________________________________________________________________

//    coursesList edditing methods
    public void addCourse(Course c){
        coursesList.add(c);
    }

    public void deleteCourse(int i){
        coursesList.remove(i);
    }
//  ______________________________________________________________________________

//  printing methods
    public String printCourses() {
        String courses = "[";


        for (int i = 0; i < coursesList.size() - 1; i++) {
            courses += "[" + coursesList.get(i).toString() + "], ";
        }

//        ta metoda zwrocilaby blad gdyby w liscie nie bylo zadnego kursu, takze upewniamy sie ze jakis jest
        if (coursesList.size() > 0) {
            return courses + "[" + coursesList.get(coursesList.size() - 1).toString() + "]]";
        } else {
            return "[]";
        }
    }

    public String toString(){
        return "" + index + "," + super.toString() + ", kursy: " + printCourses() + ", semestr: " + semester;
    }
//  ______________________________________________________________________________


//    Override of abstract methods used in other classes

    @Override
    public int getBaseWage() {
        return 0;
    }

    @Override
    public int getNumberOfPublications() {
        return 0;
    }

    @Override
    public float getOvertime() {
        return 0;
    }

    //   ______________________________________________________________________________


}
