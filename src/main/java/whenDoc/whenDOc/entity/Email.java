package whenDoc.whenDOc.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;



@Entity
@Table(name = "email")
public class Email implements Serializable {
	
	@Transient
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_email")
	private Long id;
	
	@OneToMany(mappedBy = "email")
	private Set<Paciente> paciente;
	
	@Column(name = "email")
	private String email;
	
	public Email() {
	}
	
	public Email(String email) {
		super();
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Paciente> getPaciente() {
		return paciente;
	}

	public void setPaciente(Set<Paciente> paciente) {
		this.paciente = paciente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}