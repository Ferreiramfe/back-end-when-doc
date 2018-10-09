package server.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import server.entities.Paciente;
import server.entities.Telefone;
import server.entities.Email;
import server.repository.PacienteRepository;
import server.service.PacienteService;

public class PacienteServiceImpl implements PacienteService {
	
	@Autowired
	private PacienteRepository pacienteRepository;

	@Override
	public Paciente findById(Long id) {
		return pacienteRepository.getOne(id);
	}

	@Override
	public Paciente findByName(String nome) {
		
		for (Paciente paciente : pacienteRepository.findAll()) {
			String nomePaciente = paciente.getNome();
			
			if (nomePaciente.equals(nome)) {
				return paciente;
			}
		}
		return null;
	}

	@Override
	public Paciente findByCPF(String cpf) {
		
		for (Paciente paciente : pacienteRepository.findAll()) {
			String cpfPaciente = paciente.getCpf();
			
			if (cpfPaciente.equals(cpf)) {
				return paciente;
			}
		}
		return null;
	}

	@Override
	public Paciente findByCodPac(Long cod_pac) {

		for (Paciente paciente : pacienteRepository.findAll()) {
			Long codPaciente = paciente.getCod_Paciente();
			
			if (codPaciente.equals(cod_pac)) {
				return paciente;
			}
		}
		return null;
	}
	
	@Override
	public List<Paciente> findAll() {
		return pacienteRepository.findAll();
	}

	@Override
	public HttpStatus save(Paciente newPaciente) {
		try {
			Paciente paciente = new Paciente(newPaciente.getNome(), newPaciente.getCpf(), newPaciente.getSenha(), newPaciente.getTipoSanguineo(),
					newPaciente.isApp(), newPaciente.getCod_Paciente());

			pacienteRepository.save(paciente);
			return HttpStatus.OK;
		} catch (Exception e) {
			return HttpStatus.BAD_REQUEST;
		}
	}
	
	public void setTelefones(Telefone telefone, Long id) {
		Paciente paciente = pacienteRepository.findById(id).get();
		
		Set<Telefone> telefones = paciente.getTelefones();
		telefones.add(telefone);
		paciente.setTelefones(telefones);
		pacienteRepository.save(paciente);
	}
	
	public void setEmails(Email email, Long id) {
		Paciente paciente = pacienteRepository.findById(id).get();
		
		Set<Email> emails = paciente.getEmail();
		emails.add(email);
		paciente.setEmail(emails);
		pacienteRepository.save(paciente);		
	}

	@Override
	public HttpStatus editNome(String nome, Long id) {
		
		Paciente paciente = findById(id);
		
		if(paciente != null) {
			paciente.setNome(nome);
			pacienteRepository.save(paciente);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editCPF(String cpf, Long id) {
		
		Paciente paciente = findById(id);
		
		if(paciente != null) {
			paciente.setCpf(cpf);
			pacienteRepository.save(paciente);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editSenha(String senha, Long id) {
		
		Paciente paciente = findById(id);
		
		if(paciente != null) {
			
			paciente.setSenha(senha);
			pacienteRepository.save(paciente);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editTipoSanguineo(String tipoSanguineo, Long id) {
		
		Paciente paciente = findById(id);
		
		if(paciente != null) {
			paciente.setTipoSanguineo(tipoSanguineo);
			pacienteRepository.save(paciente);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus delete(Long id) {
		if(pacienteRepository.existsById(id)) {
			pacienteRepository.deleteById(id);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}



}
