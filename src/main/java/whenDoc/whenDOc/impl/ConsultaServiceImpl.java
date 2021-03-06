package whenDoc.whenDOc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import whenDoc.whenDOc.entity.Consulta;
import whenDoc.whenDOc.repository.ConsultaRepository;
import whenDoc.whenDOc.service.ConsultaService;

@Service
public class ConsultaServiceImpl implements ConsultaService {
	
	@Autowired
	private ConsultaRepository consultaRepository;

	@Override
	public Consulta findById(Long id) {
		return consultaRepository.getOne(id);
	}

	@Override
	public Consulta findByIdConsulta(Long id_consulta) {
		for (Consulta consulta : consultaRepository.findAll()) {
			Long idConsulta = consulta.getId();
			
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
	public List<Consulta> findByPeriodOfTime(String periodOfTime) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Consulta> findAll() {
		return consultaRepository.findAll();
	}

	@Override
	public HttpStatus save(Consulta newConsulta) {
		try {
			Consulta consulta = new Consulta(newConsulta.getData(), newConsulta.getId(), newConsulta.getCod_paciente(), newConsulta.getCod_medico());
			consultaRepository.save(consulta);
			return HttpStatus.OK;
		} catch (Exception e) {
			return HttpStatus.BAD_REQUEST;
		}
	}

	

	@Override
	public HttpStatus delete(Long id) {
		if (consultaRepository.existsById(id)) {
			consultaRepository.deleteById(id);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

}
