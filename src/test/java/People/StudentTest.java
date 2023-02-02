package People;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void calculateGPA() {
        DayStudent ds1 = new DayStudent("test", "test", "test", 0, "test", 0, 0,0,0);
        DayStudent ds2 = new DayStudent("test", "test", "test", 0, "test", 0, 0,0,0);
        DayStudent ds3 = new DayStudent("test", "test", "test", 0, "test", 0, 0,0,0);

        WeekendStudent ws1 = new WeekendStudent("test", "test", "test", 0, "test", 0, 0,0,0);
        WeekendStudent ws2 = new WeekendStudent("test", "test", "test", 0, "test", 0, 0,0,0);
        WeekendStudent ws3 = new WeekendStudent("test", "test", "test", 0, "test", 0, 0,0,0);

        ArrayList<Course> cl1 = new ArrayList<Course>();
        ArrayList<Course> cl2 = new ArrayList<Course>();
        ArrayList<Course> cl3 = new ArrayList<Course>();

        Course c1 = new Course("name", "teacher", 6, 5.5f);
        Course c2 = new Course("name", "teacher", 4, 3.5f);
        Course c3 = new Course("name", "teacher", 4, 4);
        Course c4 = new Course("name", "teacher", 0, 5);

        cl2.add(c1);
        cl2.add(c2);
        cl2.add(c3);

        cl3.add(c4);

        ds1.setCoursesList(cl1);
        ws1.setCoursesList(cl1);

        ds2.setCoursesList(cl2);
        ws2.setCoursesList(cl2);

        ds3.setCoursesList(cl3);
        ws3.setCoursesList(cl3);

        assertAll(
                () -> assertEquals(0,ds1.calculateGPA()),
                () -> assertEquals(0, ws1.calculateGPA()),
                () -> assertEquals(4.5f, ds2.calculateGPA()),
                () -> assertEquals(4.0f, ws2.calculateGPA()),
                () -> assertEquals(0, ds3.calculateGPA()),
                () -> assertEquals(0, ws3.calculateGPA())
        );


    }
}