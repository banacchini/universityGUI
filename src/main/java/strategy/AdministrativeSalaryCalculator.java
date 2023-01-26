package strategy;

import People.Person;

public class AdministrativeSalaryCalculator implements CalculateSalary{
    @Override
    public float calculate(Person p) {
        return p.getBaseWage()*160 + p.getOvertime() * 20;
    }
}
