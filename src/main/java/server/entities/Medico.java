package server.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

@Entity
public class Medico {
	
	@Transient 
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_medico")
	private Long id;
	
	@NotEmpty()
	@Column()
	private String nome;
	
	@NotEmpty()
	@Column()
	private String crm;
	
	@NotEmpty()
	@Column()
	private String especialidade;
	
	@NotEmpty()
	@Column()
	private String cpf;
	
	@NotEmpty()
	@Column()
	private String email;
	
	@NotEmpty()
	@Column()
	private String senha;
	
	@NotEmpty()
	@Column()
	private String telefone;
	
	@NotEmpty()
	@Column()
	private Long cod_medico;

	public Medico(String nome,String crm, String especialidade, String cpf,
			String email, String senha, String telefone, Long cod_medico) {
		super();
		this.nome = nome;
		this.crm = crm;
		this.especialidade = especialidade;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		this.cod_medico = cod_medico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
