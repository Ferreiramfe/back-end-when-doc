package server.entities.DTO;


public class DiagnosticoDTO {
	
	private String nomeDiagnostico;
	
	private String descricao;
	
	private Long id_consulta;
	
	public DiagnosticoDTO() {
	
	}

	public String getNomeDiagnostico() {
		return nomeDiagnostico;
	}

	public void setNomeDiagnostico(String nomeDiagnostico) {
		this.nomeDiagnostico = nomeDiagnostico;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getId_consulta() {
		return id_consulta;
	}

	public void setId_consulta(Long id_consulta) {
		this.id_consulta = id_consulta;
	}
}
