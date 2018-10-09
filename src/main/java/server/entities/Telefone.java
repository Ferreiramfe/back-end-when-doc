package server.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "telefone")
public class Telefone implements Serializable {
	
	@Transient
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_telefone")
	private Long id;
	
	@OneToMany(mappedBy = "cod_pac")
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "telefone_secundario")
	private String telefoneSec;
	
	public Telefone() {
	}
	
	public Telefone(String telefone, String telefoneSec) {
		super();
		this.telefone = telefone;
		this.telefoneSec = telefoneSec;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefoneSec() {
		return telefoneSec;
	}

	public void setTelefoneSec(String telefoneSec) {
		this.telefoneSec = telefoneSec;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
