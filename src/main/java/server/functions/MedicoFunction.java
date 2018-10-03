package server.functions;

import server.entities.Medico;

public interface MedicoFunction {
	
	/*
	 * Find Medico by id which is the primary key.
	 * @param id
	 * @return
	 */
	Medico findById(Long id);
	
	/*
	 * Find Medico by name.
	 * @param nome
	 * @return
	 */
	Medico findByName(String nome);
	
	/*
	 * Find Medico by cpf.
	 * @param cpf
	 * @return
	 */
	Medico findByCPF(String cpf);
	
	/*
	 * Find Medico by crm.
	 * @param crm
	 * @return
	 */
	Medico findByCRM(String crm);
	
	/*
	 * Find Medico by cod_med.
	 * @param cod_med
	 * @return
	 */
	Medico findByCodMed(Long cod_med);
	
	/*
	 * Save Medico into database.
	 * @param medico
	 * @return medico
	 */
	Medico save(Medico newMedico);
	
	void editNome(String nome);
	
	void editCRM(String crm);
	
	void editCPF(String cpf);
	
	void editEspecialidade(String especialidade);
	
	void editEmail(String email);
	
	void editSenha(String senha);
	
	void editTelefone(String telefone);
	
	
	/*
	 * Delete Medico by id.
	 * @param id
	 */
	void delete(Long id);

}
