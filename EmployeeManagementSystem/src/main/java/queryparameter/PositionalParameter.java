package queryparameter;

import entity.Employees;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class PositionalParameter {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aditi");
		EntityManager em =emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		String jpql="select e from Employees e where e.id = ?1 and e.name=?2";
		
		Query query=em.createQuery(jpql);
		query.setParameter(1, 101);
		query.setParameter(2, "Aditi");
		
		Employees emp=(Employees)query.getSingleResult();
		
		System.out.println(emp);	
		
	}
	
}
