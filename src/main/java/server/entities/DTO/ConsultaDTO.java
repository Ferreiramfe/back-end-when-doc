package server.entities.DTO;


public class ConsultaDTO {
	
	private String data;
	
	private Long id_consulta;
	
	private Long cod_paciente;
	
	private Long cod_medico;
	
	public ConsultaDTO() {
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Long getId_consulta() {
		return id_consulta;
	}

	public void setId_consulta(Long id_consulta) {
		this.id_consulta = id_consulta;
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
