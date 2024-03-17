package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ACESSORIO")
public class Acessorio {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="acessorio_seq")
	@SequenceGenerator(name="acessorio_seq", sequenceName="sq_acessorio", initialValue = 1, allocationSize = 1)
	private Long idAcessorio;
	
	@Column(name = "Codigo_Acessorio", length = 10, nullable = false, unique = true)
	private Long codigoAcessorio;
	
	@Column(name = "Nome_Acessorio", length = 10, nullable = false)
	private String nomeAcessorio;
	
	@ManyToMany(mappedBy = "acessorios")
	private List<Carro> carros;

	public Long getIdAcessorio() {
		return idAcessorio;
	}

	public void setIdAcessorio(Long idAcessorio) {
		this.idAcessorio = idAcessorio;
	}

	public Long getCodigoAcessorio() {
		return codigoAcessorio;
	}

	public void setCodigoAcessorio(Long codigoAcessorio) {
		this.codigoAcessorio = codigoAcessorio;
	}

	public String getNomeAcessorio() {
		return nomeAcessorio;
	}

	public void setNomeAcessorio(String nomeAcessorio) {
		this.nomeAcessorio = nomeAcessorio;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

	
	
	
	
	
	

}
