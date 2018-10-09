package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import server.entities.Medicamento;

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {

}
