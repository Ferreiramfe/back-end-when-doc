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
	private String cnpj;
	
	@NotEmpty()
	@Column()
	private String telefone;
	
	@NotEmpty()
	@Column()
	private Long cod_medico;

	public Clinica(String nome, String cnpj, String telefone, Long cod_medico) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.cod_medico = cod_medico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Long getCod_medico() {
		return cod_medico;
	}

	public void setCod_medico(Long cod_medico) {
		this.cod_medico = cod_medico;
	}	
	
}
