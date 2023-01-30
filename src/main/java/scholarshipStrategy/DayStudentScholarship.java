package scholarshipStrategy;

import People.DayStudent;
import People.Person;

import java.io.Serializable;

public class DayStudentScholarship implements CheckScholarship, Serializable {
    private static final long serialVersionUID = 1L;


    @Override
//    Stypendium jest przyznawane wszystkim studentom dziennym z frekwencja powyzej 90% oraz srednia ocen co najmniej 4.5
    public boolean check(Person p) {
        DayStudent st = (DayStudent) p;
        if(st.getAttendance()>0.9 && st.getGPA()>=4.5){
            return true;
        }
        else{
            return false;
        }
    }
}
