package whenDoc.whenDOc.service;

import java.util.List;
import org.springframework.http.HttpStatus;

import whenDoc.whenDOc.entity.Medico;
import whenDoc.whenDOc.entity.Paciente;

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
	
	HttpStatus editEmail(String email, Long id);
	
	HttpStatus editEmailSec(String emailSec, Long id);
	
	HttpStatus editTelefone(String telefone, Long id);
	
	HttpStatus editTelefoneSec(String telefoneSec, Long id);
	
	/*
	 * Edit Paciente tipoSanguineo.
	 * @param tipoSanguineo, id
	 */
	HttpStatus editTipoSanguineo(String tipoSanguineo, Long id);
	
	HttpStatus addEndereco(Long id); 
	
	/*
	 * Delete Paciente by id.
	 * @param id
	 */
	HttpStatus delete(Long id);

	HttpStatus addPacientMed(Medico medico, String idpac);

}
