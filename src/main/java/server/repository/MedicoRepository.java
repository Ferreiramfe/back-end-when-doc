package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import server.entities.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
