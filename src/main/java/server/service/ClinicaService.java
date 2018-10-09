package server.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import server.entities.Clinica;

public interface ClinicaService {
	
	Clinica findById(Long id);
	
	Clinica findByName(String nome);
	
	Clinica findByCnpj(String cnpj);
	
	List<Clinica> findAll();
	
	HttpStatus save(Clinica newClinica);
	
	HttpStatus editNome(String nome, Long id);
	
	HttpStatus editTelefone(String telefone, Long id);
	
	HttpStatus editCnpj(String cnpj, Long id);
	
	HttpStatus delete(Long id);
}
