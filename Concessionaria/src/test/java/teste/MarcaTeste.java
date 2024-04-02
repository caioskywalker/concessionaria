package teste;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import dao.IMarcaDao;
import dao.MarcaDao;
import entity.Marca;

public class MarcaTeste {
	
	IMarcaDao marcaDao;
	Marca marca;
	
	public MarcaTeste() {
		marcaDao = new MarcaDao();
	}
	
	@Test
	public void criarMarcaTest() {
		marca = new Marca();
		marca.setCodigoMarca(153l);
		marca.setNomeDaMarca("Chevrolet");
		Marca marcaCriada = marcaDao.cadastrarMarca(marca);		
		assertNotNull(marcaCriada);
	}

}
