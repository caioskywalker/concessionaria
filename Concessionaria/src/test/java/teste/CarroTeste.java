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
		Carro carrocriado = criarCarro(129l, 8732l, 8798l);
		Carro result = carroDao.cadastrarCarro(carrocriado);
		assertNotNull(result);
	}
	
	public Carro criarCarro(Long codigoCarro, Long codigoMarca, Long CodigoAcessorio) {
		criarAcessorio(164164l);
		
		Carro carro = new Carro();
		carro.setAno(2020l);
		carro.setCodigoCarro(codigoCarro);
		carro.setCor("Branco");
		carro.setMarca(criarMarca(codigoMarca));
		carro.setModelo("Volvo");
		carro.adicionarAcessorio(criarAcessorio(CodigoAcessorio));
		return carro;
		
	}
	
	
	public Marca criarMarca(Long codigoMarca) {
		
		Marca novaMarca = new Marca();
		novaMarca.setCodigoMarca(codigoMarca);
		novaMarca.setNomeDaMarca("Tigo");
		marcaDao.cadastrarMarca(novaMarca);
		return novaMarca;
		
	}
	
	public Acessorio criarAcessorio(Long codigoAcessorio) {
		
		Acessorio acessorio = new Acessorio();
		acessorio.setCodigoAcessorio(codigoAcessorio);
		acessorio.setNomeAcessorio("Janela");
		//return acessorioDao.cadastrarAcessorio(acessorio);
		return acessorio;
	}
	
	public void criarTeste() {
	
	}

}
