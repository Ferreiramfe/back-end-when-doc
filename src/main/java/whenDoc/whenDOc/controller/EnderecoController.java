package whenDoc.whenDOc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import whenDoc.whenDOc.entity.Endereco;
import whenDoc.whenDOc.entity.Paciente;
import whenDoc.whenDOc.service.EnderecoService;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/endereco")
public class EnderecoController {
	@Autowired
	EnderecoService enderecoService;
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public HttpStatus registerAddress(@RequestBody Paciente paciente) {
		//return enderecoService.save(paciente.getEndereco());
		return null ;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public 	Endereco getEndereco(@PathVariable("id") Long id ) {
		return enderecoService.findById(id);
	}
	
	@RequestMapping(value = "", method = RequestMethod.DELETE)
	public 	HttpStatus deleteEndereco(@RequestBody Long id) {
		return enderecoService.delete(id);
	}
	
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public HttpStatus editEndereco(String tipoDado, String dado, Long id) {
		HttpStatus operacao;
		switch(tipoDado) {
			case "Rua":
				operacao = enderecoService.editRua(dado, id);
				break;
			case "Bairro":
				operacao = enderecoService.editBairro(dado, id);
				break;
			case "Numero":
				operacao = enderecoService.editNumero(dado, id);
				break;
			case "Complemento":
				operacao = enderecoService.editComplemento(dado, id);
				break;
			case "Cidade":
				operacao = enderecoService.editCidade(dado, id);
				break;
			case "Estado":
				operacao = enderecoService.editEstado(dado, id);
				break;
			case "Pais":
				operacao = enderecoService.editPais(dado, id);
				break;
			case "Cep":
				operacao = enderecoService.editCep(dado, id);
				break;
			default :
				operacao = HttpStatus.BAD_REQUEST;
				break;
		}
		return operacao;
	}
	
	
}
