package it.uniroma3.museo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MuseoMain {

public static void main(String[] args) {
		
		//creazione emf & em
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("museo-unit");
		EntityManager em = emf.createEntityManager();
		//EntityTransaction tx = em.getTransaction();

		//chiusura emf & em
		emf.close();
		em.close();		
	}
	
	
	
}
