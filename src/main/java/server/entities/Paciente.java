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
	private Long id;
	
	@ManyToMany(targetEntity = Medico.class, mappedBy = "paciente")
	
	@NotEmpty()
	@Column()
	private String nome;

	@NotEmpty()
	@Column()
	private String cpf;
	
	@NotEmpty()
	@Column()
	private String senha;
	
	@NotEmpty()
	@Column()
	private String tipoSanguineo;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "telefone_paciente")
	private Set<Telefone> telefones;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "email_paciente")
	private Set<Email> email;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "alergias_paciente")
	private Set<Alergias> alergias;
	
	@NotEmpty()
	@Column()
	private boolean app;

	@NotEmpty()
	@Column()
	private Long cod_Paciente;
	
	public Paciente(String nome, String cpf, String senha, String tipoSanguineo,
			boolean app, Long cod_Paciente) {	
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
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
	
	public Set<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(Set<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Set<Email> getEmail() {
		return email;
	}

	public void setEmail(Set<Email> email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public Set<Alergias> getAlergias() {
		return alergias;
	}

	public void setAlergias(Set<Alergias> alergias) {
		this.alergias = alergias;
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
