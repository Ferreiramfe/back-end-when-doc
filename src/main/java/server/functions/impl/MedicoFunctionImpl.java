package server.functions.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import server.entities.Medico;
import server.functions.MedicoFunction;
import server.repository.MedicoRepository;

public class MedicoFunctionImpl implements MedicoFunction {
	
	@Autowired
	private MedicoRepository medicoRepository;
	
	@Override
	public Medico findById(Long id) {
		return medicoRepository.getOne(id);
	}

	@Override
	public Medico findByName(String nome) {
		for (Medico medico : medicoRepository.findAll()) {
			String nomeMedico = medico.getNome();
			
			if (nomeMedico.equals(nome)) {
				return medico;
			}
		}
		return null;
	}

	@Override
	public Medico findByCPF(String cpf) {
		for (Medico medico : medicoRepository.findAll()) {
			String cpfMedico = medico.getCpf();
			
			if (cpfMedico.equals(cpf)) {
				return medico;
			}
		}
		return null;
	}

	@Override
	public Medico findByCRM(String crm) {
		for (Medico medico : medicoRepository.findAll()) {
			String crmMedico = medico.getCrm();
			
			if (crmMedico.equals(crm)) {
				return medico;
			}
		}
		return null;
	}

	@Override
	public Medico findByCodMed(Long cod_med) {
		for (Medico medico : medicoRepository.findAll()) {
				Long codMedico = medico.getCod_medico();
				
				if (codMedico.equals(cod_med)) {
					return medico;
				}
		}
		return null;
	}
	
	@Override
	public List<Medico> findAll() {
		return medicoRepository.findAll();
	}

	@Override
	public HttpStatus save(Medico newMedico) {
		try {
			Medico medico = new Medico(newMedico.getNome(), newMedico.getCrm(), newMedico.getEspecialidade(), newMedico.getCpf(), newMedico.getEmail(),
							newMedico.getSenha(), newMedico.getTelefone(), newMedico.getCod_medico());
			medicoRepository.save(medico);
			return HttpStatus.OK;
		} catch (Exception e) {
			return HttpStatus.BAD_REQUEST;
		}

	}

	@Override
	public HttpStatus editNome(String nome, Long id) {
		Medico medico = findById(id);
		
		if (medico != null) {
			medico.setNome(nome);
			medicoRepository.save(medico);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editCRM(String crm, Long id) {
		Medico medico = findById(id);
		
		if (medico != null) {
			medico.setCrm(crm);
			medicoRepository.save(medico);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editCPF(String cpf, Long id) {
		Medico medico = findById(id);
		
		if (medico != null) {
			medico.setCpf(cpf);
			medicoRepository.save(medico);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}

	}

	@Override
	public HttpStatus editEspecialidade(String especialidade, Long id) {
		Medico medico = findById(id);
		
		if (medico != null) {
			medico.setEspecialidade(especialidade);
			medicoRepository.save(medico);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
		
	}

	@Override
	public HttpStatus editEmail(String email, Long id) {
		Medico medico = findById(id);
		
		if (medico != null) {
			medico.setEmail(email);
			medicoRepository.save(medico);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}

	}

	@Override
	public HttpStatus editSenha(String senha, Long id) {
		Medico medico = findById(id);
		
		if (medico != null) {
			medico.setSenha(senha);
			medicoRepository.save(medico);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}

	}

	@Override
	public HttpStatus editTelefone(String telefone, Long id) {
		Medico medico = findById(id);
		
		if (medico != null) {
			medico.setTelefone(telefone);
			medicoRepository.save(medico);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}

	}

	@Override
	public HttpStatus delete(Long id) {
		if (medicoRepository.existsById(id)) {
			medicoRepository.deleteById(id);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

}
