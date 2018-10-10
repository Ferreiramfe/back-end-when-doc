package whenDoc.whenDOc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import java.io.Serializable;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "clinica")
public class Clinica implements Serializable{
	
	@Transient
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_clinica")
	private Long id;
	
	@NotEmpty()
	@Column(name = "nome")
	private String nome;
	
	@NotEmpty()
	@Column(name = "cnpj")
	private String cnpj;
	
	@NotEmpty()
	@Column(name = "telefone")
	private String telefone;

	public Clinica(String nome, String cnpj, String telefone) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
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
}
