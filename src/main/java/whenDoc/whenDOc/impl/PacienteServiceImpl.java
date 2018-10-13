package whenDoc.whenDOc.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import whenDoc.whenDOc.entity.Paciente;
import whenDoc.whenDOc.repository.PacienteRepository;
import whenDoc.whenDOc.service.PacienteService;

@Service
public class PacienteServiceImpl implements PacienteService {
	
	@Autowired
	private PacienteRepository pacienteRepository;

	@Override
	public Paciente findById(Long id) {
		
		Optional<Paciente> paciente = pacienteRepository.findById(id);
		if(paciente.isPresent()) {
			return paciente.get();
		}
		return new Paciente();	
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
	public List<Paciente> findAll() {
		return pacienteRepository.findAll();
	}

	@Override
	public HttpStatus save(Paciente newPaciente) {
		try {
			Paciente paciente = new Paciente(newPaciente.getNome(), newPaciente.getCpf(), newPaciente.getEmail(), newPaciente.getEmailSec(),
					newPaciente.getSenha(), newPaciente.getTelefone(), newPaciente.getTelefoneSec(), newPaciente.getTipoSanguineo(), 
					newPaciente.isApp());

			pacienteRepository.save(paciente);
			return HttpStatus.OK;
		} catch (Exception e) {
			return HttpStatus.BAD_REQUEST;
		}
	}
	
	public void setTelefones(String telefone, String telefoneSec, Long id) {
		Paciente paciente = pacienteRepository.findById(id).get();
//		Telefone telefones = new Telefone(telefone);
//		Telefone telefonesSec = new Telefone(telefoneSec);
		
//		Set<Telefone> setTelefones = paciente.getTelefones();
//		setTelefones.add(telefones);
//		setTelefones.add(telefonesSec);
//		paciente.setTelefones(setTelefones);
//		pacienteRepository.save(paciente);
	}
	
	public void setEmails(String email, String emailSec, Long id) {
		Paciente paciente = pacienteRepository.findById(id).get();
//		Email emails = new Email(email);
//		Email emailsSec = new Email(emailSec);
		
//		Set<Email> setEmails = paciente.getEmails();
//		setEmails.add(emails);
//		setEmails.add(emailsSec);
//		paciente.setEmails(setEmails);
		pacienteRepository.save(paciente);		
	}
	
	@Override
	public void setAlergias(String nomeAlergia, Long idPaciente) {
		Paciente paciente = pacienteRepository.findById(idPaciente).get();
//		Alergias alergia = new Alergias(nomeAlergia, idPaciente);
		
//		Set<Alergias> alergias = paciente.getAlergias();
//		alergias.add(alergia);
//		paciente.setAlergias(alergias);
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
	public HttpStatus editEmail(String email, Long id) {
		Paciente paciente = findById(id);
		
		if(paciente != null) {
			
			paciente.setEmail(email);
			pacienteRepository.save(paciente);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}
	
	@Override
	public HttpStatus editEmailSec(String emailSec, Long id) {
		Paciente paciente = findById(id);
		
		if(paciente != null) {
			
			paciente.setEmail(emailSec);
			pacienteRepository.save(paciente);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}
	
	@Override
	public HttpStatus editTelefone(String telefone, Long id) {
		Paciente paciente = findById(id);
		
		if(paciente != null) {
			
			paciente.setEmail(telefone);
			pacienteRepository.save(paciente);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}
	
	@Override
	public HttpStatus editTelefoneSec(String telefoneSec, Long id) {
		Paciente paciente = findById(id);
		
		if(paciente != null) {
			
			paciente.setEmail(telefoneSec);
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
