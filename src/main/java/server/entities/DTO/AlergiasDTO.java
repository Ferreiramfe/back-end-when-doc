package server.entities.DTO;

public class AlergiasDTO {
	
	private String nome_Alergia;
	
	private Long cod_paciente;
	
	public AlergiasDTO() {
	}

	public String getNome_Alergia() {
		return nome_Alergia;
	}

	public void setNome_Alergia(String nome_Alergia) {
		this.nome_Alergia = nome_Alergia;
	}

	public Long getCod_paciente() {
		return cod_paciente;
	}

	public void setCod_paciente(Long cod_paciente) {
		this.cod_paciente = cod_paciente;
	}
	
}
