package server.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import server.entities.Paciente;

public interface PacienteService {
	
	/*
	 * Find Paciente by id which is the primary key.
	 * @param id
	 * @return
	 */
	Paciente findById(Long id);
	
	/*
	 * Find Paciente by name.
	 * @param nome
	 * @return
	 */
	Paciente findByName(String nome);
	
	/*
	 * Find Paciente by cpf.
	 * @param cpf
	 * @return
	 */
	Paciente findByCPF(String cpf);
	
	/*
	 * Find all Paciente 
	 * @return All Paciente in database.
	 */
	List<Paciente> findAll();
	/*
	 * Save Paciente into database.
	 * @param paciente
	 */
	HttpStatus save(Paciente newPaciente);
	
	void setTelefones(String telefone, String telefoneSec, Long id);
	
	void setEmails(String email, String emailSec, Long id);
	
	void setAlergias(String nomeAlergia, Long id);
	
	/*
	 * Edit Paciente name.
	 * @param nome, id
	 */
	HttpStatus editNome(String nome, Long id);
	
	/*
	 * Edit Pacient cpf.
	 * @param cpf, id
	 */
	HttpStatus editCPF(String cpf, Long id);
	
	/*
	 * Edit Paciente senha.
	 * @param senha, id
	 */
	HttpStatus editSenha(String senha, Long id);
	
	/*
	 * Edit Paciente tipoSanguineo.
	 * @param tipoSanguineo, id
	 */
	HttpStatus editTipoSanguineo(String tipoSanguineo, Long id);
	
	/*
	 * Delete Paciente by id.
	 * @param id
	 */
	HttpStatus delete(Long id);

}
