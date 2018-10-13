package whenDoc.whenDOc.entity;

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
import javax.persistence.OneToOne;
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
	private Long idPaciente;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "medicos")
	private Set<Medico> medicos;
	
	@NotEmpty()
	@Column(name = "nome")
	private String nome;

	@NotEmpty()
	@Column(name = "cpf")
	private String cpf;
	
	@NotEmpty()
	@Column(name = "email")
	private String email;
	
	@NotEmpty()
	@Column(name = "email_Secundario")
	private String emailSec;
	@NotEmpty()
	@Column(name = "Senha")
	private String senha;
	
	@NotEmpty()
	@Column(name = "telefone")
	private String telefone;
	
	@NotEmpty()
	@Column(name = "telefone_Secundario")
	private String telefoneSec;
	
	@NotEmpty()
	@Column(name = "tipo_Sanguineo")
	private String tipoSanguineo;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Alergias> alergias;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "endereco")
	private Endereco endereco;
	
	
	@Column()
	private boolean app;
	
	public Paciente(String nome, String cpf, String email, String emailSec, String senha, String telefone, String telefoneSec,
			String tipoSanguineo, Endereco endereco, boolean app) {	
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.emailSec = emailSec;
		this.senha = senha;
		this.telefone = telefone;
		this.telefoneSec = telefoneSec;
		this.tipoSanguineo = tipoSanguineo;
		this.endereco = endereco;
		this.app = app;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void add(Medico medico) {
		this.medicos.add(medico);
		
	}
}