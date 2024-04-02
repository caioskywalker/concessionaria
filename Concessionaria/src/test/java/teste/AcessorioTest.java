package teste;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import dao.AcessorioDao;
import dao.IAcessorioDao;
import dao.IMarcaDao;
import dao.MarcaDao;
import entity.Acessorio;
import entity.Carro;

public class AcessorioTest {
	
	IAcessorioDao acessorioDao;
	IMarcaDao marcaDao;
	
	public AcessorioTest() {
		acessorioDao = new AcessorioDao();
		marcaDao = new MarcaDao();
	}
	
	@Test
	public void acessorioTest() {
		Acessorio acessorio = new Acessorio();
		acessorio.setCodigoAcessorio(22l);
		acessorio.setNomeAcessorio("Cinto");
		acessorio.setCarros(null);
		Acessorio acessorioCriado = acessorioDao.cadastrarAcessorio(acessorio);
		assertNotNull(acessorioCriado);
		
	}
	
	public void criarCarro() {
		Carro carro = new Carro();
		
		
		
	}

}
