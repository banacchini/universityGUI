package strategy;

import People.Person;

public class ResearchSalaryCalculator implements CalculateSalary{
    @Override
    public float calculate(Person p) {
        return p.getBaseWage()*40 *  (float) Math.pow(1.05, p.getNumberOfPublications());
    }
}
