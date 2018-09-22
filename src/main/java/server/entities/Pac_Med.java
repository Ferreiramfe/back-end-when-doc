package server.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Pac_Med {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_Paciente_Medico")
	private Long id;
	
	@NotEmpty()
	@Column()
	private Long cod_Paciente;
	
	@NotEmpty()
	@Column()
	private Long cod_Medico;

	public Pac_Med(Long cod_Paciente, Long cod_Medico) {
		super();
		this.cod_Paciente = cod_Paciente;
		this.cod_Medico = cod_Medico;
	}

	public Long getCod_Paciente() {
		return cod_Paciente;
	}

	public void setCod_Paciente(Long cod_Paciente) {
		this.cod_Paciente = cod_Paciente;
	}

	public Long getCod_Medico() {
		return cod_Medico;
	}

	public void setCod_Medico(Long cod_Medico) {
		this.cod_Medico = cod_Medico;
	}

}
