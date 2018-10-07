package server.functions.impl;

import org.springframework.beans.factory.annotation.Autowired;

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
	public Medico save(Medico newMedico) {
		Medico medico = new Medico(newMedico.getNome(), newMedico.getCrm(), newMedico.getEspecialidade(), newMedico.getCpf(), newMedico.getEmail(),
						newMedico.getSenha(), newMedico.getTelefone(), newMedico.getCod_medico());
		
		return medicoRepository.save(medico);
	}

	@Override
	public void editNome(String nome) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editCRM(String crm) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editCPF(String cpf) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editEspecialidade(String especialidade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editEmail(String email) {
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
	public void delete(Long id) {
		medicoRepository.deleteById(id);
	}

}
