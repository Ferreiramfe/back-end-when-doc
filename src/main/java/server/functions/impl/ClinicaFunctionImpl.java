package server.functions.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import server.entities.Clinica;
import server.functions.ClinicaFunction;
import server.repository.ClinicaRepository;
public class ClinicaFunctionImpl implements ClinicaFunction {
	
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
	public Clinica findByCep(String cep) {
		for (Clinica clinica : clinicaRepository.findAll()) {
			String cepClinica = clinica.getCep();
			
			if (cepClinica.equals(cep)) {
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
			Clinica clinica = new Clinica(newClinica.getNome(), newClinica.getRua(), newClinica.getBairro(), newClinica.getComplemento(),
					newClinica.getCidade(), newClinica.getEstado(), newClinica.getPais(), newClinica.getCnpj(), newClinica.getCep(),
					newClinica.getCod_medico());
			
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
	public HttpStatus editRua(String rua, Long id) {
		Clinica clinica = findById(id);
		
		if (clinica != null) {
			clinica.setRua(rua);
			clinicaRepository.save(clinica);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}
	
	@Override
	public HttpStatus editBairro(String bairro, Long id) {
		Clinica clinica = findById(id);
		
		if (clinica != null) {
			clinica.setBairro(bairro);
			clinicaRepository.save(clinica);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editComplemento(String complemento, Long id) {
		Clinica clinica = findById(id);
		
		if (clinica != null) {
			clinica.setComplemento(complemento);
			clinicaRepository.save(clinica);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editCidade(String cidade, Long id) {
		Clinica clinica = findById(id);
		
		if (clinica != null) {
			clinica.setCidade(cidade);
			clinicaRepository.save(clinica);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editEstado(String estado, Long id) {
		Clinica clinica = findById(id);
		
		if (clinica != null) {
			clinica.setEstado(estado);
			clinicaRepository.save(clinica);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editPais(String pais, Long id) {
		Clinica clinica = findById(id);
		
		if (clinica != null) {
			clinica.setPais(pais);
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
	public HttpStatus editCep(String cep, Long id) {
		Clinica clinica = findById(id);
		
		if (clinica != null) {
			clinica.setCep(cep);
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
