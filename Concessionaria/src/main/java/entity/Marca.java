package entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "TB_MARCA")
public class Marca {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="marca_seq")
	@SequenceGenerator(name="marca_seq", sequenceName="sq_marca", initialValue = 1, allocationSize = 1)
	private Long idMarca;
	
	@Column(name = "Codigo_Marca", length = 10, nullable = false, unique = true)
	private Long codigoMarca;
	
	@Column(name = "Nome_Marca", length = 10, nullable = false)
	private String nomeDaMarca;
	
	@OneToMany(mappedBy = "marca")
	private List<Carro> carros;

	public Long getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Long idMarca) {
		this.idMarca = idMarca;
	}

	public Long getCodigoMarca() {
		return codigoMarca;
	}

	public void setCodigoMarca(Long codigoMarca) {
		this.codigoMarca = codigoMarca;
	}

	public String getNomeDaMarca() {
		return nomeDaMarca;
	}

	public void setNomeDaMarca(String nomeDaMarca) {
		this.nomeDaMarca = nomeDaMarca;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
	
	
	

	
	

}
