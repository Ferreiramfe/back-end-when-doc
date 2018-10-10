package whenDoc.whenDOc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import whenDoc.whenDOc.entity.Paciente;
import whenDoc.whenDOc.service.PacienteService;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/paciente")
public class PacientController {
	@Autowired
	PacienteService pacientService;
	
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public 	HttpStatus registerPacient(@RequestBody Paciente pacient) {
		return pacientService.save(pacient);
		
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public 	Paciente getPacient(@PathVariable("id") Long id ) {
		return pacientService.findById(id);
		
	}
	@RequestMapping(value = "", method = RequestMethod.DELETE)
	public 	HttpStatus deletePacient(@RequestBody Long id) {
		return pacientService.delete(id);
		
	}
}