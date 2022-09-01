package Entities;

public class Company extends TaxPayer {

    private int workers;

    public Company() {
    }

    public Company(String name, double income, int workers) {
        super(name, income);
        this.workers = workers;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    @Override
    public double tax() {
        if (workers < 10) {
            return getIncome() * 0.16;
        } else {
            return getIncome() * 0.14;
        }


    }
}
