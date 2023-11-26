import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Create an instance of the PayrollSystem class
        PayrollSystem payrollSystem = new PayrollSystem();

        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            // Display menu options
            System.out.println("**** Welcome To Employee Payroll Management System ****");
            System.out.println("Enter 1 for Adding employee details");
            System.out.println("Enter 2 for Displaying employee details");
            System.out.println("Enter 3 for Removing employee details");
            System.out.println("Enter 0 To Exit the Program");

            // Read user choice
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Adding employee details
                    System.out.println("Enter Employee Type");
                    System.out.println("Enter 1 for Full Time Employee");
                    System.out.println("Enter 2 for Part Time Employee");
                    int employeeType = sc.nextInt();
                    
                    if(employeeType <= 0 || employeeType > 2) {
                    System.out.println("Wrong Input Number :( ");
                    break;
                    }

                    System.out.println("Enter Employee Name");
                    String name = sc.next();
                    System.out.println("Enter Employee ID");
                    int id = sc.nextInt();
                    System.out.println("Enter Employee City");
                    String city = sc.next();

                    // For full-time employee
                    if (employeeType == 1) {
                        System.out.println("Enter Employee Salary");
                        int salary = sc.nextInt();
                        FullTimeEmployee emp = new FullTimeEmployee(name, id, city, salary);
                        payrollSystem.addEmployee(emp);
                        System.out.println("FullTimeEmployee Added");
                    }
                    // For part-time employee
                    else  {
                        System.out.println("Enter Hours Worked");
                        int hoursWorked = sc.nextInt();
                        System.out.println("Enter Hours Salary");
                        int hoursSalary = sc.nextInt();
                        PartTimeEmployee emp = new PartTimeEmployee(name, id, city, hoursWorked, hoursSalary);
                        payrollSystem.addEmployee(emp);
                        System.out.println("PartTimeEmployee Added");
                    }
                    break;

                case 2:
                    // Displaying employee details
                    payrollSystem.displayEmployees();
                    break;

                case 3:
                    // Removing employee details
                    System.out.println("Enter Employee ID");
                    int id1 = sc.nextInt();
                    if (payrollSystem.removeEmployee(id1)) {
                        System.out.println("Employee Removed");
                    } else {
                        System.out.println("Employee Not Found");
                    }
                    break;

                case 0:
                    // Exit the program
                    System.out.println("Thank you for visiting!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);

        // Close the scanner
        sc.close();
    }
}
