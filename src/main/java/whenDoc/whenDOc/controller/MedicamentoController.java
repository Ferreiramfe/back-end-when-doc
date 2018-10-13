package whenDoc.whenDOc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import whenDoc.whenDOc.entity.Medicamento;
import whenDoc.whenDOc.service.MedicamentoService;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/medicamento")
public class MedicamentoController {
	MedicamentoService medicamentoService;
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public 	HttpStatus registerPacient(@RequestBody Medicamento medico) {
		return medicamentoService.save(medico);
		
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public 	Medicamento getPacient(@PathVariable("id") Long id ) {
		return medicamentoService.findById(id);
		
	}
	@RequestMapping(value = "", method = RequestMethod.DELETE)
	public 	HttpStatus deletePacient(@RequestBody Long id) {
		return medicamentoService.delete(id);
		
	}
}
