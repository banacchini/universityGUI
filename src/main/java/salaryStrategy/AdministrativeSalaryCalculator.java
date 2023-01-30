package salaryStrategy;

import People.Person;

import java.io.Serializable;

public class AdministrativeSalaryCalculator implements CalculateSalary, Serializable {

    private static final long serialVersionUID = 1L;
    @Override
    public float calculate(Person p) {
        return p.getBaseWage()*160 + p.getOvertime() * 20;
    }
}
