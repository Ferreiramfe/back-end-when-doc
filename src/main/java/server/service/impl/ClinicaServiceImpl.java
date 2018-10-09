package server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import server.entities.Clinica;
import server.repository.ClinicaRepository;
import server.service.ClinicaService;
public class ClinicaServiceImpl implements ClinicaService {
	
	@Autowired
	private ClinicaRepository clinicaRepository;

	@Override
	public Clinica findById(Long id) {
		return clinicaRepository.getOne(id);
	}

	@Override
	public Clinica findByName(String nome) {
		for (Clinica clinica : clinicaRepository.findAll()) {
			String nomeClinica = clinica.getNome();
			
			if (nomeClinica.equals(nome)) {
				return clinica;
			}
		}
		return null;
	}

	@Override
	public Clinica findByCnpj(String cnpj) {
		for (Clinica clinica : clinicaRepository.findAll()) {
			String cnpjClinica = clinica.getCnpj();
			
			if (cnpjClinica.equals(cnpj)) {
				return clinica;
			}
		}
		return null;
	}

	@Override
	public List<Clinica> findAll() {
		return clinicaRepository.findAll();
	}

	@Override
	public HttpStatus save(Clinica newClinica) {
		try {
			Clinica clinica = new Clinica(newClinica.getNome(), newClinica.getCnpj(), newClinica.getTelefone(), newClinica.getCod_medico());
		
			clinicaRepository.save(clinica);
			return HttpStatus.OK;
		} catch (Exception e) {
			return HttpStatus.BAD_REQUEST;
		}
	}

	@Override
	public HttpStatus editNome(String nome, Long id) {
		Clinica clinica = findById(id);
		
		if (clinica != null) {
			clinica.setNome(nome);
			clinicaRepository.save(clinica);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editCnpj(String cnpj, Long id) {
		Clinica clinica = findById(id);
		
		if (clinica != null) {
			clinica.setCnpj(cnpj);
			clinicaRepository.save(clinica);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editTelefone(String telefone, Long id) {
		Clinica clinica = findById(id);
		
		if (clinica != null) {
			clinica.setTelefone(telefone);
			clinicaRepository.save(clinica);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}
	
	
	@Override
	public HttpStatus delete(Long id) {
		if (clinicaRepository.existsById(id)) {
			clinicaRepository.deleteById(id);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

}
