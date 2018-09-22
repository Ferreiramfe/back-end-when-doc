package server.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
public class Diagnostico {
	
	@NotEmpty()
	@Column()
	private String nomeDiagnostico;
	
	@NotEmpty()
	@Column()
	private String descricao;
	
	@NotEmpty()
	@Column()
	private Long id_consulta;

	public Diagnostico(String nomeDiagnostico, String descricao, Long id_consulta) {
		super();
		this.nomeDiagnostico = nomeDiagnostico;
		this.descricao = descricao;
		this.id_consulta = id_consulta;
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
