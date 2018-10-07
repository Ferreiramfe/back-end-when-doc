package server.functions;

import server.entities.Medicamento;

public interface MedicamentoFunctions {
	
	Medicamento findById(Long id);
	
	Medicamento findByName(String nome);
	
	Medicamento findByCodPac(Long cod_pac);
	
	Medicamento save(Medicamento medicamento);
	
	void editNome(String nome);
	
	// apenas o medico pode alterar a quantidade.
	void editQuantidade(Integer quantidade);
	
	void editHorario(String horario);
	
	void editIntervalo(String intervalo);
	
	void editDataInicial(String dataInicial);
	
	void editDataFinal(String dataFinal);
	
	// apenas o medico pode alterar a dosagem.
	void editDosagem(float dosagem);
	
	void delete(Long id);
	
	void deleteByName(String nome);
	
	boolean medicamentoInDataBase(String nome);
	

}
