package server.entities;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

@Entity
public class Alergias {

	@Column()
	private String nome_Alergia;
	
	@NotEmpty()
	@Column()
	private Long cod_Paciente;

	public Alergias(String nome_Alergia, Long cod_Paciente) {
		super();
		this.nome_Alergia = nome_Alergia;
		this.cod_Paciente = cod_Paciente;
	}

	public String getNome_Alergia() {
		return nome_Alergia;
	}

	public void setNome_Alergia(String nome_Alergia) {
		this.nome_Alergia = nome_Alergia;
	}

	public Long getCod_Paciente() {
		return cod_Paciente;
	}

	public void setCod_Paciente(Long cod_Paciente) {
		this.cod_Paciente = cod_Paciente;
	}
	
	
	
	
}
