package repository;

import java.awt.List;

import entity.Employees;
import exception.EmployeeNotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeRepository {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aditi");
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction et = em.getTransaction();
	
	public void addEmployee(Employees employee) {
		try {
			et.begin();
			em.persist(employee);
			et.commit();
			System.out.println("Employee Saved successfully");
		} catch (Exception e) {
			
				et.rollback();
				e.printStackTrace();
			}
		}
	
	public Employees findEmployee(int id) {
		Employees employee = em.find(Employees.class, id);
		if (employee != null) 
		return employee;
		else
			throw new EmployeeNotFoundException("Employee not found with id: " + id);
		
	}
	
	//update employee salary with hike
	
	public Employees updateEmployeeSalary(int id) {
		
		Employees employee = findEmployee(id);
		double existingSalary = employee.getSalary();
		double updatedSalary = existingSalary + (existingSalary * 10 / 100); // 10% hike
		
		employee.setSalary(updatedSalary);
		try {
			et.begin();
			em.merge(employee);
			et.commit();
			System.out.println("Employee Salary Updated successfully");
		} catch (Exception e) {
			et.rollback();
			e.printStackTrace();
		}
		return employee;
	}
		
	
	//update employee
	
	/*public void updateEmployee(Employees employee) {
		try {
			et.begin();
			em.merge(employee);
			et.commit();
			System.out.println("Employee Updated successfully");
		} catch (Exception e) {
			et.rollback();
		
		}
	}*/
	
	public void updateEmployee(int id, String name, double salary, String dept) {

	    Employees employee = em.find(Employees.class, id);

	    if (employee == null) {
	        throw new EmployeeNotFoundException(
	                "Employee not found with id: " + id);
	    }

	    try {
	        et.begin();

	        if (name != null) {
	            employee.setName(name);
	        }

	        if (salary != -1) {
	            employee.setSalary(salary);
	        }

	        if (dept != null) {
	            employee.setDept(dept);
	        }

	        et.commit();

	        System.out.println("Employee Updated Successfully");

	    } catch (Exception e) {
	        et.rollback();
	        e.printStackTrace();
	    }
	}
	
	//delete employee
	public void deleteEmployee(int id) {

	    Employees employee = findEmployee(id);

	    if (employee == null) {
	        throw new EmployeeNotFoundException(
	                "Employee not found with id: " + id);
	    }

	    try {
	        et.begin();

	        em.remove(employee);

	        et.commit();

	        System.out.println("Employee Deleted Successfully");

	    } catch (Exception e) {
	        et.rollback();
	        e.printStackTrace();
	    }
	}
	
	//show employees list
	
	public java.util.List<Employees>findAllEmployees(){
		String jpql = "select e from Employees e";
		
		jakarta.persistence.Query query=em.createQuery(jpql);
		return query.getResultList();
		
	}

		
}