package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import server.entities.Clinica;

public interface ClinicaRepository extends JpaRepository<Clinica, Long> {

}
