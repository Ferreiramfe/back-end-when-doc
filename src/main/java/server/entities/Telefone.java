package server.entities;

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
	
	@Column(name = "telefone")
	private String telefone;
	
	@OneToMany(mappedBy = "cod_pac")
	Set<Paciente> paciente;
	
	public Telefone() {
	}
	
	public Telefone(String telefone) {
		super();
		this.telefone = telefone;
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
