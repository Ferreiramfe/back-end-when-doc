package server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import server.entities.Medico;
import server.functions.impl.MedicoFunctionImpl;

@RestController
@RequestMapping(value = "/Medico")
@CrossOrigin(origins = "*")
public class MedicoController {
	@Autowired
	MedicoFunctionImpl medicoService;
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public HttpStatus registerMedico(@RequestBody Medico medico) {
		return medicoService.save(medico);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Medico getMedico(@RequestBody Long id) {
		return medicoService.findById(id);
	}
	
	@RequestMapping(value = "", method = RequestMethod.DELETE)
	public HttpStatus deleteMedico(@RequestBody Long id) {
		return medicoService.delete(id);
	}
}
