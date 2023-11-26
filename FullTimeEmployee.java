import java.util.ArrayList;
import java.util.List;

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, String location, double monthlySalary) {
        super(name, id, location);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}