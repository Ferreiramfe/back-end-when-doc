package server.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;


@Entity
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_paciente")
	private Long id;
	
	@OneToMany(mappedBy = "paciente")
	public Set<Alergias> alergias;
	
	@NotEmpty()
	@Column()
	private String nome;

	@NotEmpty()
	@Column()
	private String cpf;
	
	@NotEmpty()
	@Column()
	private String email;
	
	@NotEmpty()
	@Column()
	private String emailSec;
	
	@NotEmpty()
	@Column()
	private String senha;
	
	@NotEmpty()
	@Column()
	private String telefone;

	@NotEmpty()
	@Column()
	private String telefoneSec;
	
	@NotEmpty()
	@Column()
	private String tipoSanguineo;
	
	@NotEmpty()
	@Column()
	private boolean app;

	@NotEmpty()
	@Column()
	private Long cod_Paciente;
	

	
	public Paciente(String nome, String cpf, String email, String emailSec, String senha,
			String telefone, String telefoneSec, String tipoSanguineo, boolean app, Long cod_Paciente) {	
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.emailSec = emailSec;
		this.senha = senha;
		this.telefone = telefone;
		this.telefoneSec = telefoneSec;
		this.tipoSanguineo = tipoSanguineo;
		this.app = app;
		this.cod_Paciente = cod_Paciente;

	}
	
	public Paciente() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getEmailSec() {
		return emailSec;
	}

	public void setEmailSec(String emailSec) {
		this.emailSec = emailSec;
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

	public String getTelefoneSec() {
		return telefoneSec;
	}

	public void setTelefoneSec(String telefoneSec) {
		this.telefoneSec = telefoneSec;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public boolean isApp() {
		return app;
	}

	public void setApp(boolean app) {
		this.app = app;
	}

	public Long getCod_Paciente() {
		return cod_Paciente;
	}

	public void setCod_Paciente(Long cod_Paciente) {
		this.cod_Paciente = cod_Paciente;
	}
	
	
}
