package whenDoc.whenDOc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "alergias")
public class Alergias implements Serializable {
	
	@Transient
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_alergias")
	private Long id;
	
	@Column(name = "nome_alergia")
	private String nomeAlergia;
	
	@NotEmpty()
	@Column()
	private Long idPaciente;
	
//	@OneToMany(mappedBy = "id_paciente")
//	private Set<Paciente> paciente;
//	
	public Alergias() {
		
	}

	public Alergias(String nomeAlergia, Long idPaciente) {
		super();
		this.nomeAlergia = nomeAlergia;
		this.idPaciente = idPaciente;
	}

	public String getNome_Alergia() {
		return nomeAlergia;
	}

	public void setNome_Alergia(String nomeAlergia) {
		this.nomeAlergia = nomeAlergia;
	}

	public Long getCodPaciente() {
		return idPaciente;
	}

	public void setCodPaciente(Long cod_Paciente) {
		this.idPaciente = cod_Paciente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
