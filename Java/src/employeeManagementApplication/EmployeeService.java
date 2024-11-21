package employeemanagementapplication;

import java.util.HashSet;
import java.util.Scanner;

abstract class Details{
	abstract void addEmployee();
	abstract void viewEmployee();
	abstract void updateEmployee();
	abstract void deleteEmployee();
	abstract void viewAllEmployees();
}

class EmployeeService extends Details {

	HashSet<Employee> employeeDetails = new HashSet<Employee>();

	Employee emp1 = new Employee(1, "Thanya", 24, "Coimbatore", 25000);
	Employee emp2 = new Employee(2, "Abi", 22, "Pollachi", 57000);
	Employee emp3 = new Employee(3, "Kiki", 20, "Coimbatore", 5000);
	Employee emp4 = new Employee(4, "Nithya", 21, "Chennai", 70000);
 

	Scanner sc = new Scanner(System.in);
	boolean found = false;
	int id;
	String name;
	int age;
	String address;
	double salary; 
    

	public EmployeeService() {

		employeeDetails.add(emp1);
		employeeDetails.add(emp2);
		employeeDetails.add(emp3);
		employeeDetails.add(emp4);

	}

	public void viewAllEmployees() {
		for (Employee emp : employeeDetails) {
			System.out.println(emp);
		}
	}

	public void viewEmployee() {

		System.out.println("Enter id: ");
		id = sc.nextInt();
		for (Employee emp : employeeDetails) {
			if (emp.getId() == id) {
				System.out.println(emp);
				found = true;
			}

		}
		if(!found) {
			System.out.println("Employee with this id is not present");
		}
	}

	public void updateEmployee() {
		System.out.println("Enter id: ");
		id = sc.nextInt();
		boolean found = false;
		for (Employee emp : employeeDetails) {
			if (emp.getId() == id) {
				System.out.println("Enter name: ");
				name = sc.next();
				System.out.println("Enter new Salary");
				salary = sc.nextDouble();
				emp.setName(name);
				emp.setSalary(salary);
				System.out.println("Updated Details of employee are: ");
				System.out.println(emp);
				found = true;
			}
		}
		if (!found) {
			System.out.println("Employee is not present");
		} else {
			System.out.println("Employee details updated successfully !!");
		}
	}

	public void deleteEmployee() {
		System.out.println("Enter id");
		id = sc.nextInt();
		boolean found = false;
		Employee empdelete = null;
		for (Employee emp : employeeDetails) {
			if (emp.getId() == id) {
				empdelete = emp;
				found = true;
			}
		}
		if (!found) {
			System.out.println("Employee is not present");
		} else {
			employeeDetails.remove(empdelete);
			System.out.println("Employee deleted successfully!!");
		}
	}

	public void addEmployee() {
		System.out.println("Enter Id:");
		id = sc.nextInt();
		System.out.println("Enter Name");
		name = sc.next();
		System.out.println("Enter Age");
		age = sc.nextInt();
		System.out.println("Enter Address");
		address = sc.next();
		System.out.println("Enter Salary");
		salary = sc.nextDouble();

		Employee emp = new Employee(id, name, age, address, salary);

		employeeDetails.add(emp);
		System.out.println(emp);
		System.out.println("Employtee addeed successsfully");

	}

}