package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "TB_CARRO")
public class Carro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="carro_seq")
	@SequenceGenerator(name="carro_seq", sequenceName="sq_carro", initialValue = 1, allocationSize = 1)
	private Long idCarro;
	
	@Column(name = "Codigo_Carro", length = 10, nullable = false, unique = true)
	private Long codigoCarro;
	
	@Column(name = "Cor", length = 10, nullable = false)
	private String cor;
	
	@Column(name = "Ano", length = 10, nullable = false)
	private Long ano;
	
	@ManyToMany
	(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "TB_CARRO_ACESSORIO", 
        joinColumns = { @JoinColumn(name = "id_carro_fk") }, 
        inverseJoinColumns = { @JoinColumn(name = "id_acessorio_fk") }
    )
	private List<Acessorio> acessorios;
	
	@ManyToOne
	@JoinColumn(name = "id_carro_fk", 
	foreignKey = @ForeignKey(name = "fk_marca_carro"), 
	referencedColumnName = "idMarca", nullable = false
	)
	private Marca marca;
	
	@Column(name = "Modelo", length = 10, nullable = false)
	private String modelo;
	
	
	public Carro() {
		this.acessorios = new ArrayList<Acessorio>();
	}

	public Long getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(Long idCarro) {
		this.idCarro = idCarro;
	}

	public Long getCodigoCarro() {
		return codigoCarro;
	}

	public void setCodigoCarro(Long codigoCarro) {
		this.codigoCarro = codigoCarro;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Long getAno() {
		return ano;
	}

	public void setAno(Long ano) {
		this.ano = ano;
	}

	public List<Acessorio> getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(List<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void adicionarAcessorio(Acessorio acessorio) {
		this.acessorios.add(acessorio);
	}
	
	
	
}
