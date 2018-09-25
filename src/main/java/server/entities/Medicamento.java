	package server.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import java.io.Serializable;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

@Entity
public class Medicamento implements Serializable{
	
	@Transient
	private static final long serialVersionUID= 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_medicamento")
	private Long id;
	
	@NotEmpty()
	@Column()
	private String nome;
	
	@NotEmpty()
	@Column()
	private Integer quantidade;
	
	@NotEmpty()
	@Column()
	private String horario;
	
	@NotEmpty()
	@Column()
	private String intervalo;
	
	@NotEmpty()
	@Column()
	private String dataInicial;
	
	@NotEmpty()
	@Column()
	private String dataFinal;
	
	@NotEmpty()
	@Column()
	private float dosagem;
	
	@NotEmpty()
	@Column()
	private boolean active;

	public Medicamento(String nome, Integer quantidade, String horario,
			 String intervalo, String dataInicial, String dataFinal,
			 float dosagem, boolean active) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.horario = horario;
		this.intervalo = intervalo;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.dosagem = dosagem;
		this.active = active;
	}
	
	
	

}
