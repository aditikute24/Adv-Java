package controller;

import java.util.Scanner;

import entity.Employees;
import repository.EmployeeRepository;

public class Main {
	
	static EmployeeRepository employeeRepository = new EmployeeRepository();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Add Employee");
		System.out.println("2.Find Employee based on ID");
		System.out.println("3.Update Employee");
		System.out.println("4.Update Employee Salary with hike");
		System.out.println("5. Delete Employee");
		System.out.println("6. Retrieve All Employees");

		
		System.out.print("Enter the Option :");
		int option=sc.nextInt();
		
		switch (option) {
		//create employee
		case 1:
			System.out.println("ID :");
			int id = sc.nextInt();
			System.out.println("Name :");
			String name = sc.next();
			System.out.println("Salary :");
			double salary = sc.nextDouble();
			System.out.println("Department :");
		    String dept = sc.next();
			
		    Employees employee = new Employees(id, name, salary, dept);
		    employeeRepository.addEmployee(employee);
		    break;
		   
		    //find employee
		 case 2:
			 System.out.println("ID :");
			 id = sc.nextInt();
			 System.out.println(employeeRepository.findEmployee(id));
			 break;
			 
			//update employee
		 case 3:    
			System.out.println("Enter Employee ID:");
		    id = sc.nextInt();

		    System.out.println("Do you want to update Name? (yes/no)");
		    String nameChoice = sc.next();
            name = null;

		    if (nameChoice.equalsIgnoreCase("yes")) {
		        System.out.println("Enter New Name:");
		        name = sc.next();
		    }

		    System.out.println("Do you want to update Salary? (yes/no)");
		    String salaryChoice = sc.next();

		    salary = -1;

		    if (salaryChoice.equalsIgnoreCase("yes")) {
		        System.out.println("Enter New Salary:");
		        salary = sc.nextDouble();
		    }

		    System.out.println("Do you want to update Department? (yes/no)");
		    String deptChoice = sc.next();

		     dept = null;

		    if (deptChoice.equalsIgnoreCase("yes")) {
		        System.out.println("Enter New Department:");
		        dept = sc.next();
		    }

		    employeeRepository.updateEmployee(id, name, salary, dept);

		    break; 
		    
		 //update employee salary with hike
		 case 4:
			 System.out.println("Enter Employee ID to Update Salary:");
			 id = sc.nextInt();
			 System.out.println(employeeRepository.updateEmployeeSalary(id));
			 break;
		    
		 //delete employee
		    case 5:
			 System.out.println("Enter Employee ID to Delete:");
			 id = sc.nextInt();
			 employeeRepository.deleteEmployee(id);
			 break;
			 
		//show employee list
			 case 6:
				 System.out.println("Employee List :");
				 System.out.println(employeeRepository.findAllEmployees());
				 break;
			 
						
		default:
			break;
			
		}
	}

}
