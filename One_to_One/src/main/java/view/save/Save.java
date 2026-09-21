package view.save;

import entity.Car;
import entity.Engine;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Save {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aditi");

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Engine e = new Engine("CNG", 20000);

		Car c = new Car("TATA", 19000, e);

		et.begin();
		em.persist(e);
		em.persist(c);
		et.commit();

	}

}
