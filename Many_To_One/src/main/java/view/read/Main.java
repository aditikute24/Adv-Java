package view.read;

import entity.Book;
import entity.Library;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aditi");

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Library l1=new Library("ABC","Thane");
		Library l2=new Library("PQR","Nashik");

		
		
		Book b1 = new Book("abc",100,l1);
		Book b2 = new Book("pqe",300,l2);
		Book b3 = new Book("jkl",600,l1);
		Book b4 = new Book("nmo",800,l2);
		
		et.begin();
		em.persist(l1);
		em.persist(l2);
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		em.persist(b4);
		et.commit();



		
		
		
		
	}

}
