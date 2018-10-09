package server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import server.entities.Paciente;
import server.service.impl.PacienteServiceImpl;

@RestController
@RequestMapping(value = "/Pacient")
@CrossOrigin(origins = "*")
public class PacientController {
	@Autowired
	PacienteServiceImpl pacientService;
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public 	HttpStatus registerPacient(@RequestBody Paciente pacient) {
		return pacientService.save(pacient);
		
	}
	@RequestMapping(value = "", method = RequestMethod.GET)
	public 	Paciente getPacient(@RequestBody Long id) {
		return pacientService.findById(id);
		
	}
	@RequestMapping(value = "", method = RequestMethod.DELETE)
	public 	HttpStatus deletePacient(@RequestBody Long id) {
		return pacientService.delete(id);
		
	}
}
