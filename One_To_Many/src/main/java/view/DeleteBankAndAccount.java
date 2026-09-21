package view;

import entity.Bank;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteBankAndAccount {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aditi");

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		Bank b1 = em.find(Bank.class, 52);
		em.remove(b1);
		et.commit();
	}

}
