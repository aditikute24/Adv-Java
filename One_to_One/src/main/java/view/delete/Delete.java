package view.delete;

import entity.Car;
import entity.Engine;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Delete {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aditi");

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();

		Car deleteCar = em.find(Car.class, 1);

		if (deleteCar != null) {

			Engine deleteEngine = deleteCar.getEngine();

			em.remove(deleteCar);

			if (deleteEngine != null) {
				em.remove(deleteEngine);
			}

			System.out.println("Car and Engine deleted");
		}

		et.commit();

		em.close();
		emf.close();
	}
}