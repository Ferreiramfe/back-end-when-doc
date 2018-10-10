package whenDoc.whenDOc.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "telefone")
public class Telefone implements Serializable {
	
	@Transient
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_telefone")
	private Long id;
	
	@OneToMany(mappedBy = "telefone")
	private Set<Paciente> pacientes;
	
	@Column(name = "telefone")
	private String telefone;
	
	public Telefone() {
	}
	
	public Telefone(String telefone) {
		super();
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Set<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(Set<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
