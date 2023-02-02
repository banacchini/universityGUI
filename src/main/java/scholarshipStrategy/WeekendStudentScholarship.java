package scholarshipStrategy;

import People.Person;
import People.WeekendStudent;

import java.io.Serializable;

import static com.example.universitygui.HelloApplication.mainList;

public class WeekendStudentScholarship implements CheckScholarship, Serializable {
    private static final long serialVersionUID = 1L;

    @Override
//    Stypendium jest przyznawane studentowi zaocznemu z najwyzsza srednia ocen (remis na 1. miejscu oznacza zwyciestwo obu)
    public boolean check(Person p) {
        if (p instanceof WeekendStudent){
            for (Person another : mainList){
                if (another.getClass() == WeekendStudent.class ){
                    if (another.getGPA()>p.getGPA()){
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
