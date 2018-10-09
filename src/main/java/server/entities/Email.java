package server.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "email")
public class Email implements Serializable {
	
	@Transient
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_email")
	private Long id;
	
	@OneToMany(mappedBy = "cod_pac")
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "email_secundario")
	private String emailSec;
	
	public Email() {
	}
	
	public Email(String email, String emailSec) {
		super();
		this.email = email;
		this.emailSec = emailSec;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailSec() {
		return emailSec;
	}

	public void setEmailSec(String emailSec) {
		this.emailSec = emailSec;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}