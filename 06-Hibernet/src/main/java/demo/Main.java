package demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aditi");
		
		EntityManager em =emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s = new Student(101, "AditiK",24);
		
		try {
			et.begin();
			em.persist(s);
			et.commit();
			System.out.println("Record Inserted");
		} catch (Exception e) {
			et.rollback();
		} 
		
	}
}
