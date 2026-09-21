package view;

import java.util.ArrayList;
import java.util.List;

import entity.Account;
import entity.Bank;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aditi");

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Account a1 = new Account(1234, "Aditi");
		Account a2 = new Account(4567, "Reshama");
		Account a3 = new Account(7890, "Tarun");
		Account a4 = new Account(7890, "Dhruvi");


		List<Account> accounts = new ArrayList<Account>();
		accounts.add(a1);
		accounts.add(a2);
		accounts.add(a3);
		accounts.add(a4);
		

		Bank b1 = new Bank("ICICI", "ICI123", accounts);


		et.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(a4);
		em.persist(b1);
		et.commit();

	}

}
