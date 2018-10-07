package server.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import java.io.Serializable;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

@Entity
public class Clinica implements Serializable{
	
	@Transient
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_clinica")
	private Long id;
	
	@NotEmpty()
	@Column()
	private String nome;
	
	@NotEmpty()
	@Column()
	private String rua;
	
	@NotEmpty()
	@Column()
	private String cnpj;
	
	@NotEmpty()
	@Column()
	private String bairro;
	
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
	private String cep;
	
	@NotEmpty()
	@Column()
	private Long cod_medico;

	public Clinica(String nome, String rua, String bairro, String complemento,
			String cidade, String estado, String pais, String cnpj, String cep, Long cod_medico) {
		super();
		this.nome = nome;
		this.rua = rua;
		this.bairro = bairro;
		this.cnpj = cnpj;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.cep = cep;
		this.cod_medico = cod_medico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
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

	public Long getCod_medico() {
		return cod_medico;
	}

	public void setCod_medico(Long cod_medico) {
		this.cod_medico = cod_medico;
	}	
	
}
