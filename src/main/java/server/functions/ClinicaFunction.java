package server.functions;

import java.util.List;

import org.springframework.http.HttpStatus;

import server.entities.Clinica;

public interface ClinicaFunction {
	
	Clinica findById(Long id);
	
	Clinica findByName(String nome);
	
	Clinica findByCnpj(String cnpj);
	
	Clinica findByCep(String cep);
	
	List<Clinica> findAll();
	
	HttpStatus save(Clinica newClinica);
	
	HttpStatus editNome(String nome, Long id);
	
	HttpStatus editRua(String rua, Long id);
	
	HttpStatus editBairro(String bairro, Long id);
	
	HttpStatus editComplemento(String complemento, Long id);
	
	HttpStatus editCidade(String cidade, Long id);
	
	HttpStatus editEstado(String estado, Long id);
	
	HttpStatus editPais(String pais, Long id);
	
	HttpStatus editCnpj(String cnpj, Long id);
	
	HttpStatus editCep(String cep, Long id);
	
	HttpStatus delete(Long id);
}
