import java.util.ArrayList;
import java.util.List;
public class PayrollSystem {

	 private List<Employee> employeeList;

	    public PayrollSystem() {
	        employeeList = new ArrayList<Employee>();
	    }

	    public void addEmployee(Employee employee) {
	        employeeList.add(employee);
	    }

	    public boolean removeEmployee(int id) {
	    	
	    	if(employeeList.isEmpty()) {
	    		 return false;
	    	}
	    	
	        Employee employeeToRemove = null;
	        for (Employee employee : employeeList) {
	            if (employee.getId() == id) {
	                employeeToRemove = employee;
	                break;
	            }else {
	            	return false;
	            }
	        }
	        if (employeeToRemove != null) {
	            employeeList.remove(employeeToRemove);
	        }
	        
	        return true;
	    }

	    public void displayEmployees() {
	    	
	    	if(employeeList.isEmpty()) {
	    		 System.out.println("No employee is Added");
	    		 return;
	    	}
	        for (Employee employee : employeeList) {
	            System.out.println(employee);
	        }
	    }

}
