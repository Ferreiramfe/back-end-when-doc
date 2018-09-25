package server.functions.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import server.entities.Paciente;
import server.entities.DTO.PacienteDTO;
import server.functions.PacienteFunction;
import server.repository.PacienteRepository;

public class PacienteFunctionImpl implements PacienteFunction {
	
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
	public Paciente save(PacienteDTO pacienteDTO) {
		Paciente paciente = new Paciente(pacienteDTO.getNome(), pacienteDTO.getCpf(), pacienteDTO.getEmail(), pacienteDTO.getEmailSec(),
							pacienteDTO.getSenha(), pacienteDTO.getTelefone(), pacienteDTO.getTelefoneSec(), pacienteDTO.getTipoSanguineo(),
							pacienteDTO.isApp(), pacienteDTO.getCod_paciente());
		return paciente;
	}

	@Override
	public void editNome(String nome) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editCPF(String cpf) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editEmail(String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editEmailSec(String emailSec) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editSenha(String senha) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editTelefone(String telefone) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editTelefoneSec(String telefoneSec) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editTipoSanguineo(String tipoSanguineo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long id) {
		pacienteRepository.deleteById(id);
	}



}
