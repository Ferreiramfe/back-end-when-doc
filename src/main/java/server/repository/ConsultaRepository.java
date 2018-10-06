package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import server.entities.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

}
