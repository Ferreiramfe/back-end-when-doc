package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import server.entities.Diagnostico;

@Repository
public interface DiagnosticoRepository extends JpaRepository<Diagnostico, Long> {

}
