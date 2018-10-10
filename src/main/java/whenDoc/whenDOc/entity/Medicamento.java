package whenDoc.whenDOc.entity;

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

	public Medicamento() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(String intervalo) {
		this.intervalo = intervalo;
	}

	public String getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	public float getDosagem() {
		return dosagem;
	}

	public void setDosagem(float dosagem) {
		this.dosagem = dosagem;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
