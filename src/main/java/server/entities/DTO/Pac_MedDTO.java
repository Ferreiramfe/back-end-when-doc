package server.entities.DTO;

public class Pac_MedDTO {
	
	private Long cod_paciente;
	
	private Long cod_medico;
	
	public Pac_MedDTO() {
	}

	public Long getCod_paciente() {
		return cod_paciente;
	}

	public void setCod_paciente(Long cod_paciente) {
		this.cod_paciente = cod_paciente;
	}

	public Long getCod_medico() {
		return cod_medico;
	}

	public void setCod_medico(Long cod_medico) {
		this.cod_medico = cod_medico;
	}

}
