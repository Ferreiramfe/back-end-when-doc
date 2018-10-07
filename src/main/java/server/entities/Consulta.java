package server.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

@Entity
public class Consulta implements Serializable {
	
	@Transient
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_consulta")
	private Long id;
	
	@NotEmpty()
	@Column()
	private String data;
	
	@NotEmpty()
	@Column()
	private Long id_consulta;
	
	@NotEmpty()
	@Column()
	private Long cod_paciente;
	
	@NotEmpty()
	@Column()
	private Long cod_medico;

	public Consulta(String data, Long id_consulta, Long cod_paciente,
			Long cod_medico) {
		super();
		this.data = data;
		this.id_consulta = id_consulta;
		this.cod_paciente = cod_paciente;
		this.cod_medico = cod_medico;
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
