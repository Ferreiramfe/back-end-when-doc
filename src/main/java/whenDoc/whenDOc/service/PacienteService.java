package whenDoc.whenDOc.service;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import whenDoc.whenDOc.entity.Alergias;
import whenDoc.whenDOc.entity.Endereco;
import whenDoc.whenDOc.entity.Paciente;

public interface PacienteService {
	
	
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
	HttpStatus editNome(String nome, String id);
	
	/*
	 * Edit Pacient cpf.
	 * @param cpf, id
	 */
	HttpStatus editCPF(String cpf, String id);
	
	/*
	 * Edit Paciente senha.
	 * @param senha, id
	 */
	HttpStatus editSenha(String senha, String id);
	
	HttpStatus editEmail(String email, String id);
	
	HttpStatus editEmailSec(String emailSec, String id);
	
	HttpStatus editTelefone(String telefone, String id);
	
	HttpStatus editTelefoneSec(String telefoneSec, String id);
	
	/*
	 * Edit Paciente tipoSanguineo.
	 * @param tipoSanguineo, id
	 */
	HttpStatus editTipoSanguineo(String tipoSanguineo, String id);
	
	HttpStatus addEndereco(String id); 
	HttpStatus addAlergia(String nomeAlergia,String id);
	/*
	 * Delete Paciente by id.
	 * @param id
	 */
	HttpStatus delete(String id);

}
