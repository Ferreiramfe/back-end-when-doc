package server.functions.impl;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;

import server.entities.Pac_Med;
import server.functions.Pac_MedFunction;
import server.repository.Pac_MedRepository;

public class Pac_MedFunctionImpl implements Pac_MedFunction {
	
	@Autowired
	private Pac_MedRepository pacMedRepository;	

	@Override
	public Pac_Med findById(Long id) {
		return pacMedRepository.getOne(id);
	}

	@Override
	public Pac_Med findByCodPac(Long cod_pac) {
		for (Pac_Med pacMed : pacMedRepository.findAll()) {
			Long codPacMed = pacMed.getCod_Paciente();
			
			if (codPacMed.equals(cod_pac)) {
				return pacMed;
			}
		}
		return null;
	}

	@Override
	public Pac_Med findByCodMed(Long cod_med) {
		for (Pac_Med pacMed : pacMedRepository.findAll()) {
			Long codPacMed = pacMed.getCod_Medico();
			
			if (codPacMed.equals(cod_med)) {
				return pacMed;
			}
		}
		return null;
	}

	@Override
	public List<Pac_Med> findAll() {
		return pacMedRepository.findAll();
	}

	@Override
	public HttpStatus save(Pac_Med newPacMed) {
		try {
			Pac_Med pacMed = new Pac_Med(newPacMed.getCod_Paciente(), newPacMed.getCod_Medico());
			pacMedRepository.save(pacMed);
			return HttpStatus.OK;
		} catch (Exception e) {
			return HttpStatus.BAD_REQUEST;
		}
	}

	@Override
	public HttpStatus delete(Long id) {
		if (pacMedRepository.existsById(id)) {
			pacMedRepository.deleteById(id);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

}
