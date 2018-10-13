package whenDoc.whenDOc.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import whenDoc.whenDOc.entity.Endereco;
import whenDoc.whenDOc.repository.EnderecoRepository;
import whenDoc.whenDOc.service.EnderecoService;

@Service
public class EnderecoServiceImpl implements EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Override
	public Endereco findById(Long id) {
		Optional<Endereco> endereco = enderecoRepository.findById(id);
		if (endereco.isPresent()) {
			return endereco.get();
		}
		return new Endereco();
	}

	@Override
	public Endereco findByCep(String cep) {
		for (Endereco endereco : enderecoRepository.findAll()) {
			String cepEndereco = endereco.getCep();
			
			if (cepEndereco.equals(cep)) {
				return endereco;
			}
		}
		return null;
	}

	@Override
	public Endereco findByIdPacient(Long id_paciente) {
		for (Endereco endereco : enderecoRepository.findAll()) {
			//Long idPaciente = endereco.getId_paciente();
			
			if ("".equals("")) {
				return endereco;
			}
		}
		return null;
 	}

	@Override
	public List<Endereco> findAll() {
		return enderecoRepository.findAll();
	}

	@Override
	public HttpStatus save(Endereco newEndereco) {
		try {
//			Endereco endereco = new Endereco(newEndereco.getRua(), newEndereco.getBairro(), newEndereco.getNumero(), newEndereco.getComplemento(),
//					newEndereco.getCidade(), newEndereco.getEstado(), newEndereco.getPais(), newEndereco.getCep(), newEndereco.getId_paciente());
			
			enderecoRepository.save(newEndereco);
			return HttpStatus.OK;
		} catch (Exception e) {
			return HttpStatus.BAD_REQUEST;
		}
	}

	@Override
	public HttpStatus editRua(String rua, Long id) {
		Endereco endereco = findById(id);
		
		if (endereco != null) {
			endereco.setRua(rua);
			enderecoRepository.save(endereco);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editBairro(String bairro, Long id) {
		Endereco endereco = findById(id);
		
		if (endereco != null) {
			endereco.setBairro(bairro);
			enderecoRepository.save(endereco);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editNumero(String numero, Long id) {
		Endereco endereco = findById(id);
		
		if (endereco != null) {
			endereco.setNumero(numero);
			enderecoRepository.save(endereco);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editComplemento(String complemento, Long id) {
		Endereco endereco = findById(id);
		
		if (endereco != null) {
			endereco.setComplemento(complemento);
			enderecoRepository.save(endereco);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editCidade(String cidade, Long id) {
		Endereco endereco = findById(id);
		
		if (endereco != null) {
			endereco.setCidade(cidade);
			enderecoRepository.save(endereco);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editEstado(String estado, Long id) {
		Endereco endereco = findById(id);
		
		if (endereco != null) {
			endereco.setEstado(estado);
			enderecoRepository.save(endereco);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editPais(String pais, Long id) {
		Endereco endereco = findById(id);
		
		if (endereco != null) {
			endereco.setPais(pais);
			enderecoRepository.save(endereco);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus editCep(String cep, Long id) {
		Endereco endereco = findById(id);
		
		if (endereco != null) {
			endereco.setCep(cep);
			enderecoRepository.save(endereco);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public HttpStatus delete(Long id) {
		if (enderecoRepository.existsById(id)) {
			enderecoRepository.deleteById(id);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

}
