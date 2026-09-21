package view.read;

import java.util.List;

import entity.Car;
import entity.Engine;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ReadBasedOnAllCar_Engine {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aditi");

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		// Simple query to get all cars
		List<Car> cars = em.createQuery(
				"SELECT c FROM Car c",
				Car.class
		).getResultList();

		System.out.println("All Cars with their Engines:");
		for (Car c : cars) {
			System.out.println("Car: " + c);
			Engine eng = c.getEngine();
			System.out.println("  Engine: " + eng);
		}

		em.close();
		emf.close();

	}

}
