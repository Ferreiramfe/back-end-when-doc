package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import server.entities.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

}
