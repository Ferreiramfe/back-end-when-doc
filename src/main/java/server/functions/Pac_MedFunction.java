package server.functions;

import server.entities.Pac_Med;
import org.springframework.http.HttpStatus;
import java.util.List;

public interface Pac_MedFunction {
	
	/*
	 * Find Pac_Med by id.
	 * @param id
	 * @return
	 */
	Pac_Med findById(Long id);
	
	/*
	 * Find Pac_Med by cod_pac.
	 * @param cod_pac
	 * @return
	 */
	Pac_Med findByCodPac(Long cod_pac);
	
	/*
	 * Find Pac_Med by cod_med.
	 * @param cod_med
	 * @return
	 */
	Pac_Med findByCodMed(Long cod_med);
	
	List<Pac_Med> findAll();
	
	/*
	 * Save Pac_Med into database.
	 * @param pac_med
	 */
	HttpStatus save(Pac_Med newPacMed);
	
	/*
	 * Delete a Pac_Med by id.
	 * @param id
	 */
	HttpStatus delete(Long id);
}
