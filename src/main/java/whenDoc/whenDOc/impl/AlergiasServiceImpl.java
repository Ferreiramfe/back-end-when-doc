package whenDoc.whenDOc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import whenDoc.whenDOc.entity.Alergias;
import whenDoc.whenDOc.repository.AlergiasRepository;
import whenDoc.whenDOc.service.AlergiasService;
@Service
public class AlergiasServiceImpl implements AlergiasService {
	
	@Autowired
	private AlergiasRepository alergiasRepository;

	@Override
	public Alergias findById(Long id) {
		return alergiasRepository.getOne(id);
	}

	@Override
	public Alergias findByCodPaciente(Long cod_paciente) {
		for (Alergias alergia : alergiasRepository.findAll()) {
//			Long codPaciente = alergia.getCodPaciente();
//			
//			if (codPaciente.equals(cod_paciente)) {
//				return alergia;
//			}
		}
		return null;
	}

	@Override
	public List<Alergias> findAll() {
		return alergiasRepository.findAll();
	}

	@Override
	public HttpStatus save(Alergias newAlergia) {
		try {
//			Alergias alergias = new Alergias(newAlergia.getNome_Alergia(), newAlergia.getCodPaciente());
//			
//			alergiasRepository.save(alergias);
			return HttpStatus.OK;
		} catch (Exception e) {
			return HttpStatus.BAD_REQUEST;
		}
	}

	@Override
	public HttpStatus editNomeAlergia(String nomeAlergia, Long id) {
		Alergias alergias = findById(id);
		
		if (alergias != null) {
			alergias.setNome_Alergia(nomeAlergia);
			alergiasRepository.save(alergias);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus delete(Long id) {
		if (alergiasRepository.existsById(id)) {
			alergiasRepository.deleteById(id);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

}
