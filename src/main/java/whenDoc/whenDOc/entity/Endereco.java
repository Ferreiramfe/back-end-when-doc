package whenDoc.whenDOc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {
	
	@Transient
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_endereco")
	private Long id;
	
	@NotEmpty()
	@Column(name = "rua")
	private String rua;
	
	@NotEmpty()
	@Column(name = "bairro")
	private String bairro;
	
	@NotEmpty()
	@Column(name = "numero")
	private String numero;
	
	@NotEmpty()
	@Column(name = "complemento")
	private String complemento;
	
	@NotEmpty()
	@Column(name = "cidade")
	private String cidade;
	
	@NotEmpty()
	@Column(name = "estado")
	private String estado;
	
	@NotEmpty()
	@Column(name = "pais")
	private String pais;
	
	@NotEmpty()
	@Column(name = "cep")
	private String cep;
	
	@NotEmpty()
	@Column(name = "id_paciente")
	private Long id_paciente;

	public Endereco(String rua, String bairro, String numero,
			 String complemento, String cidade, String estado, String pais, String cep, Long id_paciente) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.cep = cep;
		this.id_paciente = id_paciente;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Long getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(Long id_paciente) {
		this.id_paciente = id_paciente;
	}
}
