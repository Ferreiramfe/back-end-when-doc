package whenDoc.whenDOc.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import whenDoc.whenDOc.entity.Endereco;


public interface EnderecoService {
	
	Endereco findById(Long id);
	
	Endereco findByCep(String cep);
	
	Endereco findByIdPacient(String id);
	
	List<Endereco> findAll();
	
	HttpStatus save(Endereco newEndereco);
	
	HttpStatus editRua(String rua, Long id);
	
	HttpStatus editBairro(String bairro, Long id);
	
	HttpStatus editNumero(String numero, Long id);
	
	HttpStatus editComplemento(String complemento, Long id);
	
	HttpStatus editCidade(String cidade, Long id);
	
	HttpStatus editEstado(String estado, Long id);
	
	HttpStatus editPais(String pais, Long id);
	
	HttpStatus editCep(String cep, Long id);
	
	HttpStatus delete(Long id);
}
