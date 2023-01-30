//package People;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class StudentTest {
//
//    @Test
//    void calculateGPA() {
//        Student ds = new DayStudent("test", "test", "test", 0, "test", 0, 0, 0,0);
//        Student ws = new WeekendStudent("test", "test", "test", 0, "test", 0, 0, 0, 0);
//
//        Course c1 = new Course("test", "test", 0, 5);
//        Course c2 = new Course("test", "test", 2, 3.5f);
//        Course c3 = new Course("test", "test",  6, 4.5f);
//        Course c4 = new Course("test", "test", 4, 3.5f);
//
//        ArrayList<Course> cl1 = new ArrayList<Course>();
//        cl1.add(c1);
//        cl1.add(c2);
//        cl1.add(c3);
//        cl1.add(c4);
//
//        ArrayList<Course> cl2 = new ArrayList<Course>();
//        cl2.add(c1);
//
//
//
//        Student ds1 = new DayStudent("test", "test", "test", 0, "test", 0, cl1, 0,0,0);
//        Student ds2 = new DayStudent("test", "test", "test", 0, "test", 0, cl2, 0,0,0);
//
//
//
//
//
//        Assertions.assertAll(
//                () -> assertEquals(0f, ds.calculateGPA()),
//                () -> assertEquals(0f, ds.calculateGPA()),
//                () -> assertEquals( 4.0f, ds1.calculateGPA()),
//                () -> assertEquals(0f, ds2.calculateGPA())
//        );
//
//    }
//}