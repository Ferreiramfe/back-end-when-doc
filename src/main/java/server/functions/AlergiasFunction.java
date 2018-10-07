package server.functions;

import java.util.List;

import org.springframework.http.HttpStatus;

import server.entities.Alergias;

public interface AlergiasFunction {
	
	Alergias findById(Long id);
	
	Alergias findByCodPaciente(Long cod_paciente);
	
	List<Alergias> findAll();
	
	HttpStatus save(Alergias newAlergia);
	
	HttpStatus editNomeAlergia(String nomeAlergia, Long id);
	
	HttpStatus delete(Long id);
}
