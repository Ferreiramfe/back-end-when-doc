package server.functions;

import java.util.ArrayList;

import server.entities.Consulta;
import server.entities.DTO.ConsultaDTO;

public interface ConsultaFunction {
	
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
	 * Save Consulta into database.
	 * @param Consulta
	 * @return 
	 */
	Consulta save(ConsultaDTO consulta);
	
	/*
	 * Find a list of Consulta by period of time.
	 * @param String periodOfTime
	 * @return List of Consulta
	 */
	ArrayList<Consulta> findByPeriodOfTime(String periodOfTime);


	/*
	 * Delete a Consulta by id.
	 * @param id
	 */
	void delete(Long id);
	
	

}
