
import java.util.ArrayList;
import java.util.List;

abstract class Employee {

	private String name;
    private int id;
    private String location;

    public Employee(String name, int id, String location) {
        this.name = name;
        this.id = id;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    public String getLocation() {
        return location;
    }
    

    // Abstract method to be implemented by subclasses
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + calculateSalary() + ", Location = " + location + "]";
    }

}
