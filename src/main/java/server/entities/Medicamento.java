package server.entities;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

@Entity
public class Medicamento {
	
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
