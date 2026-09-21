package queryparameter;

import entity.Employees;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class NamedParameter {
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aditi");
		EntityManager em =emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		String jpql="select e from Employees e where e.id = :empId and e.name= :empName";
		
		Query query=em.createQuery(jpql);
		query.setParameter("empId", 101);
		query.setParameter("empName", "Aditi");
		
		Employees emp=(Employees)query.getSingleResult();
		
		System.out.println(emp);	
		
	}
	

}
