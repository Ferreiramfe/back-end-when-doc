package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import server.entities.Alergias;

@Repository
public interface AlergiasRepository extends JpaRepository<Alergias, Long> {

}
