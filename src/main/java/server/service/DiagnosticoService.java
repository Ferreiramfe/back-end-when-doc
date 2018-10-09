package server.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import server.entities.Diagnostico;

public interface DiagnosticoService {
	
	Diagnostico findById(Long id);
	
	Diagnostico findByName(String nome);
	
	Diagnostico findByIdConsulta(Long id_consulta);
	
	List<Diagnostico> findAll();
	
	HttpStatus save(Diagnostico newDiagnostico);
	
	HttpStatus editNomeDiagnostico(String nomeDiagnostico, Long id);
	
	HttpStatus editDescricao(String descricao, Long id);
	
	HttpStatus delete(Long id);

}
