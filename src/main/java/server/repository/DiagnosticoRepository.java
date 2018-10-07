package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import server.entities.Diagnostico;

public interface DiagnosticoRepository extends JpaRepository<Diagnostico, Long> {

}
