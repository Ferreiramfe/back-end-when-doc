package whenDoc.whenDOc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "alergias")
public class Alergias implements Serializable {
	

	
	@Id
	@Column(name = "nome_alergia")
	private String nomeAlergia;
	
	@OneToMany(mappedBy = "alergias")
	private Set<Paciente> paciente;
	
	public Alergias() {
		
	}

	

	



	public Alergias(String nomeAlergia) {
		super();
		this.nomeAlergia = nomeAlergia;
	}







	public String getNome_Alergia() {
		return nomeAlergia;
	}

	public void setNome_Alergia(String nomeAlergia) {
		this.nomeAlergia = nomeAlergia;
	}

	
}
