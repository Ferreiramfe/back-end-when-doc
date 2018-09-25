package server.entities.DTO;

public class PacienteDTO {
	
	private String nome;
	
	private String cpf;
	
	private String email;
	
	private String emailSec;
	
	private String senha;
	
	private String telefone;
	
	private String telefoneSec;
	
	private String tipoSanguineo;
	
	private boolean app;
	
	private Long cod_paciente;
	
	public PacienteDTO() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public boolean isApp() {
		return app;
	}

	public void setApp(boolean app) {
		this.app = app;
	}

	public Long getCod_paciente() {
		return cod_paciente;
	}

	public void setCod_paciente(Long cod_paciente) {
		this.cod_paciente = cod_paciente;
	}

}
