package Entities;

public class Person extends TaxPayer {

    private double healthCost;

    public Person() {
    }

    public Person(String name, double income, double healthCost) {
        super(name, income);
        this.healthCost = healthCost;
    }

    public double getHealthCost() {
        return healthCost;
    }

    public void setHealthCost(double healthCost) {
        this.healthCost = healthCost;
    }

    @Override
    public double tax() {
        if (getIncome() < 20000.00) {
            return getIncome() * 0.15 - healthCost * 0.5;
        } else {
            return getIncome() * 0.25 - healthCost * 0.5;
        }

    }
}
