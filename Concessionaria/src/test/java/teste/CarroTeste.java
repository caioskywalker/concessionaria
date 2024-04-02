package teste;

import dao.ICarroDao;
import dao.IMarcaDao;
import dao.MarcaDao;
import entity.Acessorio;
import entity.Carro;
import entity.Marca;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dao.AcessorioDao;
import dao.CarroDao;
import dao.IAcessorioDao;

public class CarroTeste {
	
	private ICarroDao carroDao;
	private IMarcaDao marcaDao;
	private IAcessorioDao acessorioDao;
	
	public CarroTeste() {
		carroDao = new CarroDao();
		marcaDao = new MarcaDao();
		acessorioDao = new AcessorioDao();
	}
	
	@Test
	public void criarCarroTest() {
		Carro carro = new Carro();
		List<Acessorio> acessorioCriado = criarAcessorio(1565l);
		Marca marca = criarMarca(546l);
		carro.setAno(2012l);
		carro.setCodigoCarro(152l);
		carro.setCor("vermelho");
		carro.setModelo("Celta");
		
		carro.setAcessorios(acessorioCriado);
		
		carro.setMarca(marca);
		Carro carroCriado = carroDao.cadastrarCarro(carro);
		
		assertNotNull(carroCriado);
		
		
		
	}
	
	public Marca criarMarca(Long codigoMarca) {
		Marca marca = new Marca();
		
		marca.setCodigoMarca(codigoMarca);
		marca.setNomeDaMarca("Chevrolet");
		marcaDao.cadastrarMarca(marca);
		
		return marca;
		
	}
	
	public List<Acessorio> criarAcessorio(Long codigoAcessorio) {
		
		Acessorio acessorio = new Acessorio();
		acessorio.setCodigoAcessorio(codigoAcessorio);
		acessorio.setNomeAcessorio("Capa de volante");
		List<Acessorio> acessorioList = new ArrayList();
		acessorioList.add(acessorio);
		acessorioDao.cadastrarAcessorio(acessorio);
		return acessorioList;
	}
	
	public void criarTeste() {
	
	}

}
