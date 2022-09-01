package Entities;

public abstract class TaxPayer {
    private String name;
    private double Income;

    public TaxPayer() {
    }

    public TaxPayer(String name, double income) {
        this.name = name;
        Income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return Income;
    }

    public void setIncome(double income) {
        Income = income;
    }

    public abstract double tax();

    }


