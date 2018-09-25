package server.functions;

import server.entities.Pac_Med;
import server.entities.DTO.Pac_MedDTO;

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
	
	/*
	 * Save Pac_Med into database.
	 * @param pac_med
	 */
	Pac_Med save(Pac_MedDTO pac_med);
	
	/*
	 * Delete a Pac_Med by id.
	 * @param id
	 */
	void delete(Long id);
}
