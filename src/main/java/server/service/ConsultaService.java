package server.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import server.entities.Consulta;

public interface ConsultaService {
	
	/*
	 * Find Consulta by id which is the primary key of table Consulta.
	 * @param id
	 * @return Consulta
	 */
	Consulta findById(Long id);
	
	/*
	 * Find Consulta by id_consulta.
	 * @param id_consulta
	 * @return Consulta
	 */
	Consulta findByIdConsulta(Long id_consulta);
	
	/*
	 * Find Consulta by data.
	 * @param String data
	 * @return Consulta
	 */
	Consulta findByData(String data);
	
	/*
	 * Find a list of Consulta by period of time, more precisely, for months.
	 * @param String periodOfTime
	 * @return List of Consulta
	 */
	List<Consulta> findByPeriodOfTime(String periodOfTime);
	
	List<Consulta> findAll();
	
	/*
	 * Save Consulta into database.
	 * @param Consulta
	 * @return 
	 */
	HttpStatus save(Consulta newConsulta);

	/*
	 * Delete a Consulta by id.
	 * @param id
	 */
	HttpStatus delete(Long id);
	
	

}
