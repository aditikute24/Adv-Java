package view;

import entity.Bank;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ReadBankAndAcount {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aditi");

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Bank b1 = em.find(Bank.class, 52);
		System.out.println(b1);
		System.out.println(b1.getAccounts());
	}

}
