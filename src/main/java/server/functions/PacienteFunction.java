package server.functions;

import java.util.List;

import server.entities.Paciente;
import server.entities.DTO.PacienteDTO;

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
	Paciente save(PacienteDTO pacienteDTO);
	
	/*
	 * Delete Paciente by id.
	 * @param id
	 */
	
	/*
	 * Edit Paciente name.
	 * @param nome
	 */
	void editNome(String nome);
	
	/*
	 * Edit Pacient cpf.
	 * @param cpf
	 */
	void editCPF(String cpf);
	
	/*
	 * Edit Paciente email.
	 * @param email
	 */
	void editEmail(String email);
	
	/*
	 * Edit Paciente emailSec.
	 * @param emailSec
	 */
	void editEmailSec(String emailSec);
	
	/*
	 * Edit Paciente senha.
	 * @param senha
	 */
	void editSenha(String senha);
	
	/*
	 * Edit Paciente telefone.
	 * @param telefone
	 */
	void editTelefone(String telefone);
	
	/*
	 * Edit Paciente telefoneSec.
	 * @param telefoneSec
	 */
	void editTelefoneSec(String telefoneSec);
	
	/*
	 * Edit Paciente tipoSanguineo.
	 * @param tipoSanguineo
	 */
	void editTipoSanguineo(String tipoSanguineo);
	
	void delete(Long id);

}
