package filteringMethods;

import People.Employee;
import People.Person;
import People.Student;

import java.util.ArrayList;

public class filteringMethods {

    public static ArrayList<Person> getStudentsList(ArrayList<Person> personList){
        ArrayList<Person> studentsList = new ArrayList<Person>();
        for (int i = 0; i< personList.size(); i++){
            Person p = personList.get(i);

            if (Student.class.isAssignableFrom(p.getClass())){
                studentsList.add(p);
            }
        }

        return studentsList;
    }

    public static ArrayList<Person> getEmployeesList(ArrayList<Person> personList){
        ArrayList<Person> employeesList = new ArrayList<Person>();
        for (int i = 0; i< personList.size(); i++){
            Person p = personList.get(i);

            if (Employee.class.isAssignableFrom(p.getClass())){
                employeesList.add(p);
            }
        }

        return employeesList;
    }

    public static ArrayList<Person> getScholarshipList(ArrayList<Person> personList){
        ArrayList<Person> scholarshipList = new ArrayList<Person>();
        for (int i = 0; i<personList.size(); i++){
            Person p = personList.get(i);

            if (p.checkScholarship()){
                scholarshipList.add(p);
            }

        }

        return scholarshipList;
    }
}
