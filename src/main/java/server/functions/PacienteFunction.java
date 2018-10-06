package server.functions;

import java.util.List;

import org.springframework.http.HttpStatus;

import server.entities.Paciente;

public interface PacienteFunction {
	
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
	 * Find Paciente by code_pac.
	 * @param cod_pac
	 * @return
	 */
	Paciente findByCodPac(Long cod_pac);
	
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
	
	/*
	 * Delete Paciente by id.
	 * @param id
	 */
	
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
	 * Edit Paciente email.
	 * @param email, id
	 */
	HttpStatus editEmail(String email, Long id);
	
	/*
	 * Edit Paciente emailSec.
	 * @param emailSec, id
	 */
	HttpStatus editEmailSec(String emailSec, Long id);
	
	/*
	 * Edit Paciente senha.
	 * @param senha, id
	 */
	HttpStatus editSenha(String senha, Long id);
	
	/*
	 * Edit Paciente telefone.
	 * @param telefone, id
	 */
	HttpStatus editTelefone(String telefone, Long id);
	
	/*
	 * Edit Paciente telefoneSec.
	 * @param telefoneSec, id
	 */
	HttpStatus editTelefoneSec(String telefoneSec, Long id);
	
	/*
	 * Edit Paciente tipoSanguineo.
	 * @param tipoSanguineo, id
	 */
	HttpStatus editTipoSanguineo(String tipoSanguineo, Long id);
	
	HttpStatus delete(Long id);

}
