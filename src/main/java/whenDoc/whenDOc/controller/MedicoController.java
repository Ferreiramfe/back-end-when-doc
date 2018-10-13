package whenDoc.whenDOc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import whenDoc.whenDOc.entity.Medico;
import whenDoc.whenDOc.service.MedicoService;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/medico")
public class MedicoController {
	@Autowired
	MedicoService medicoService;
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public 	HttpStatus registerPacient(@RequestBody Medico medico) {
		return medicoService.save(medico);
		
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public 	Medico getPacient(@PathVariable("id") Long id ) {
		return medicoService.findById(id);
		
	}
	@RequestMapping(value = "", method = RequestMethod.DELETE)
	public 	HttpStatus deleteMedico(@RequestBody Long id) {
		return medicoService.delete(id);
		
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public HttpStatus editInfosMedico(String tipoDado,String dado, Long id) {
		HttpStatus operacao;
		switch (tipoDado) {
			case "Nome":
				operacao = medicoService.editNome(dado, id);
				break;
			case "Crm":
				operacao = medicoService.editCRM(dado, id);
				break;
			case "Cpf":
				operacao = medicoService.editCPF(dado, id);
				break;
			case "Especialidade":
				operacao = medicoService.editEspecialidade(dado, id);
				break;
			case "Email":
				operacao = medicoService.editEmail(dado, id);
				break;
			case "Senha":
				operacao = medicoService.editSenha(dado, id);
				break;
			case "Telefone":
				operacao = medicoService.editTelefone(dado, id);
				break;
			default:
				operacao = HttpStatus.BAD_REQUEST;
				break;
		}
		return operacao;
	}
	
}