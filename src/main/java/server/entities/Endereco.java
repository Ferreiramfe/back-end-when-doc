package server.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

@Entity
public class Endereco implements Serializable {
	
	@Transient
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_endereco")
	private Long id;
	
	@NotEmpty()
	@Column()
	private String rua;
	
	@NotEmpty()
	@Column()
	private String bairro;
	
	@NotEmpty()
	@Column()
	private String numero;
	
	@NotEmpty()
	@Column()
	private String complemento;
	
	@NotEmpty()
	@Column()
	private String cidade;
	
	@NotEmpty()
	@Column()
	private String estado;
	
	@NotEmpty()
	@Column()
	private String pais;
	
	@NotEmpty()
	@Column()
	private Long cod_Paciente;
	
	@NotEmpty()
	@Column()
	private String cep;

	public Endereco(String rua, String bairro, String numero,
			 String complemento, String cidade, String estado, String pais,
			 Long cod_Paciente, String cep) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.cod_Paciente = cod_Paciente;
		this.cep = cep;
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

	public Long getCod_Paciente() {
		return cod_Paciente;
	}

	public void setCod_Paciente(Long cod_Paciente) {
		this.cod_Paciente = cod_Paciente;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
	
	
	
}
