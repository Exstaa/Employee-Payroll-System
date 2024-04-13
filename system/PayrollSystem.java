package az.hafizrzazade.payrollsys.system;

import java.util.ArrayList;

import az.hafizrzazade.payrollsys.model.FullTimeEmployee;
import az.hafizrzazade.payrollsys.model.PartTimeEmployee;
import az.hafizrzazade.payrollsys.model.Employee;

public class PayrollSystem {
    private ArrayList<Employee> employeeList;
    
    public PayrollSystem() {
    	employeeList = new ArrayList<>();
    }
    
    public void addEmployee(Employee employee) {
    	employeeList.add(employee);
    }
    
    public void removeEmployee(int id) {
    	Employee employeeToRemove = null;
    	for(Employee employee : employeeList) {
    		if(employee.getId()==id) {
    			employeeToRemove = employee;
    			break;
    		}
    	}
    	if(employeeToRemove != null) {
    		 employeeList.remove(employeeToRemove);
    	}
    }
    
    public void displayEmployees() {
    	for(Employee employee : employeeList) {
    		System.out.println(employee);
    	}
    }
}
