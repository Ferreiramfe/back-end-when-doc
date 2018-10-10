package whenDoc.whenDOc.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import whenDoc.whenDOc.entity.Alergias;


public interface AlergiasService {
	
	Alergias findById(Long id);
	
	Alergias findByCodPaciente(Long cod_paciente);
	
	List<Alergias> findAll();
	
	HttpStatus save(Alergias newAlergia);
	
	HttpStatus editNomeAlergia(String nomeAlergia, Long id);
	
	HttpStatus delete(Long id);


}
