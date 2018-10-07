package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import server.entities.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {

}
