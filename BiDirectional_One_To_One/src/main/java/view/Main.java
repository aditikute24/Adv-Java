package view;

import entity.Car;
import entity.Engine;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aditi");

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

//		Car car = new Car();
//		car.setBrand("Thar");
//		car.setPrice(20000);
//
//		Engine engine = new Engine();
//		engine.setType("Disel");
//		engine.setHp(1500);
//		
//		car.setEngine(engine);
//		engine.setCar(car);
//
//		et.begin();
//		em.persist(engine);
//		em.persist(car);
//		et.commit();

//		Car car1 = em.find(Car.class, 1);
//		Engine e = car1.getEngine();
//		System.out.println(car1);
//		System.out.println(e);

	}
}
