package server.functions.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import server.entities.Consulta;
import server.entities.DTO.ConsultaDTO;
import server.functions.ConsultaFunction;
import server.repository.ConsultaRepository;

public class ConsultaFunctionImpl implements ConsultaFunction {
	
	@Autowired
	private ConsultaRepository consultaRepository;

	@Override
	public Consulta findById(Long id) {
		return consultaRepository.getOne(id);
	}

	@Override
	public Consulta findByIdConsulta(Long id_consulta) {
		for (Consulta consulta : consultaRepository.findAll()) {
			Long idConsulta = consulta.getId_consulta();
			
			if (idConsulta.equals(id_consulta)) {
				return consulta;
			}
		}
		return null;
	}

	@Override
	public Consulta findByData(String data) {
		for (Consulta consulta : consultaRepository.findAll()) {
			String dataConsulta = consulta.getData();
			
			if (dataConsulta.equals(data)) {
				return consulta;
			}
		}
		return null;
	}
	
	@Override
	public ArrayList<Consulta> findByPeriodOfTime(String periodOfTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consulta save(ConsultaDTO consultaDTO) {
		Consulta consulta = new Consulta(consultaDTO.getData(), consultaDTO.getId_consulta(), consultaDTO.getCod_paciente(), consultaDTO.getCod_medico());
		
		return consultaRepository.save(consulta);
	}

	

	@Override
	public void delete(Long id) {
		consultaRepository.deleteById(id);

	}

}
