package az.hafizrzazade.payrollsys.main;

import az.hafizrzazade.payrollsys.model.FullTimeEmployee;
import az.hafizrzazade.payrollsys.model.PartTimeEmployee;
import az.hafizrzazade.payrollsys.system.PayrollSystem;

public class Main {
   public static void main(String[] args) {
	   PayrollSystem payrollSystem = new PayrollSystem();
	   FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Alex",1,7000.0);
	   PartTimeEmployee partTimeEmp = new PartTimeEmployee("Nick",2,40,34.4);
	   payrollSystem.addEmployee(partTimeEmp);
	   payrollSystem.addEmployee(fullTimeEmp);
	   System.out.println("Initial Employee Details: ");
	   payrollSystem.displayEmployees();
	   System.out.println("Removing Employee with id == 2");
	   payrollSystem.removeEmployee(2);
	   System.out.println("Remaining Employees Details: ");
	   payrollSystem.displayEmployees();

   }
}
