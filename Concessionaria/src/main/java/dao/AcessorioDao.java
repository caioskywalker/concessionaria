package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Acessorio;

public class AcessorioDao implements IAcessorioDao {

	@Override
	public Acessorio cadastrarAcessorio(Acessorio acessorio) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = emf.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(acessorio);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		emf.close();
		
		
		
		return acessorio;
	}
	
	

}
