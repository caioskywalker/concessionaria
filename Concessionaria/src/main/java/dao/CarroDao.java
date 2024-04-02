package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Carro;

public class CarroDao implements ICarroDao {

	
	public Carro cadastrarCarro(Carro carro) {
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = emf.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(carro);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		emf.close();
		
		
		
		return carro;
	}

}
