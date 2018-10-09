package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import server.entities.Clinica;

@Repository
public interface ClinicaRepository extends JpaRepository<Clinica, Long> {

}
