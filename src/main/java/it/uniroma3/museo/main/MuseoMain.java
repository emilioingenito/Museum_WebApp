package it.uniroma3.museo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import it.uniroma3.museo.model.Opera;
import lombok.Cleanup;

public class MuseoMain {

	public static void main(String[] args) {

		//creazione emf & em
		@Cleanup EntityManagerFactory emf = Persistence.createEntityManagerFactory("museo-unit");
		@Cleanup EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		//elementi del dominio
		Opera o = new Opera();
		
		//transazione
		tx.begin();
		em.persist(o);
		tx.commit();
		
			
	}


}
