package server.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	
	@Column()
	private String nomeAlergia;
	
	@NotEmpty()
	@Column()
	private Long cod_Paciente;
	
	@OneToMany(mappedBy = "cod_pac")
	Set<Paciente> paciente;
	
	public Alergias() {
		
	}

	public Alergias(String nomeAlergia, Long cod_Paciente) {
		super();
		this.nomeAlergia = nomeAlergia;
		this.cod_Paciente = cod_Paciente;
	}

	public String getNome_Alergia() {
		return nomeAlergia;
	}

	public void setNome_Alergia(String nomeAlergia) {
		this.nomeAlergia = nomeAlergia;
	}

	public Long getCod_Paciente() {
		return cod_Paciente;
	}

	public void setCod_Paciente(Long cod_Paciente) {
		this.cod_Paciente = cod_Paciente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
