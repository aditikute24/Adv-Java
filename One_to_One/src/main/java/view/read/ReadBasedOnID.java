package view.read;

import entity.Car;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ReadBasedOnID {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aditi");

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

//		Car c = em.find(Car.class, 1);

//		System.out.println(c);
//		System.out.println(c.getEngine());

		Car car = em.find(Car.class, 1);

		if (car != null) {

			System.out.println("Car:");
			System.out.println(car);

			System.out.println("Engine:");
			System.out.println(car.getEngine());

		} else {
			System.out.println("Car not found");
		}

	}

}
