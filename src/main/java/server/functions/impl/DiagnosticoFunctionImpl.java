package server.functions.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import server.entities.Diagnostico;
import server.functions.DiagnosticoFunction;
import server.repository.DiagnosticoRepository;

public class DiagnosticoFunctionImpl implements DiagnosticoFunction {
	
	@Autowired
	private DiagnosticoRepository diagnosticoRepository;

	@Override
	public Diagnostico findById(Long id) {
		return diagnosticoRepository.getOne(id);
	}

	@Override
	public Diagnostico findByName(String nome) {
		for (Diagnostico diagnostico : diagnosticoRepository.findAll()) {
			String nomeDiagnostico = diagnostico.getNomeDiagnostico();
			
			if (nomeDiagnostico.equals(nome)) {
				return diagnostico;
			}
		}
		return null;
	}

	@Override
	public Diagnostico findByIdConsulta(Long id_consulta) {
		for (Diagnostico diagnostico : diagnosticoRepository.findAll()) {
			Long idConsulta = diagnostico.getId_consulta();
			
			if (idConsulta.equals(id_consulta)) {
				return diagnostico;
			}
		}
		return null;
	}

	@Override
	public List<Diagnostico> findAll() {
		return diagnosticoRepository.findAll();
	}

	@Override
	public HttpStatus save(Diagnostico newDiagnostico) {
		try {
			Diagnostico diagnostico = new Diagnostico(newDiagnostico.getNomeDiagnostico(), newDiagnostico.getDescricao(), newDiagnostico.getId_consulta());
			
			diagnosticoRepository.save(diagnostico);
			return HttpStatus.OK;
		} catch (Exception e) {
			return HttpStatus.BAD_REQUEST;
		}
	}

	@Override
	public HttpStatus editNomeDiagnostico(String nomeDiagnostico, Long id) {
		Diagnostico diagnostico = findById(id);
		
		if (diagnostico != null) {
			diagnostico.setNomeDiagnostico(nomeDiagnostico);
			diagnosticoRepository.save(diagnostico);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editDescricao(String descricao, Long id) {
		Diagnostico diagnostico = findById(id);
		
		if (diagnostico != null) {
			diagnostico.setDescricao(descricao);
			diagnosticoRepository.save(diagnostico);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus delete(Long id) {
		if (diagnosticoRepository.existsById(id)) {
			diagnosticoRepository.deleteById(id);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

}
