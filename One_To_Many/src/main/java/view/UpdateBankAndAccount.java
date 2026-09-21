package view;

import entity.Bank;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateBankAndAccount {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aditi");

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Bank b1 = em.find(Bank.class, 52);
		b1.setName("HDFC");
		b1.setIfsc("HDF123");
		em.merge(b1);
		et.commit();
	}

}
