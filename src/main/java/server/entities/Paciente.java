package server.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Table(name = "paciente")
public class Paciente {
	
	@Transient 
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_paciente")
	private Long id;
	
	@ManyToMany(targetEntity = Medico.class, mappedBy = "paciente")
	private Set<Medico> medicos;
	
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
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "telefone_paciente")
	private Set<Telefone> telefones;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "email_paciente")
	private Set<Email> emails;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "alergias_paciente")
	private Set<Alergias> alergias;
	
	@NotEmpty()
	@Column()
	private boolean app;

	@NotEmpty()
	@Column()
	private Long cod_Paciente;
	
	public Paciente(String nome, String cpf, String email, String emailSec, String senha, String telefone, String telefoneSec,
			String tipoSanguineo, boolean app, Long cod_Paciente) {	
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
	
	
	public Set<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(Set<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Set<Email> getEmails() {
		return emails;
	}

	public void setEmails(Set<Email> emails) {
		this.emails = emails;
	}
	
	public Set<Alergias> getAlergias() {
		return alergias;
	}

	public void setAlergias(Set<Alergias> alergias) {
		this.alergias = alergias;
	}

	public Set<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(Set<Medico> medicos) {
		this.medicos = medicos;
	}
}
