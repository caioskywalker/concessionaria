package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Marca;

public class MarcaDao implements IMarcaDao {

	@Override
	public Marca cadastrarMarca(Marca marca) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = emf.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(marca);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		emf.close();
		
		
		
		return marca;
	}
}
	
