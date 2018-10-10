package whenDoc.whenDOc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import whenDoc.whenDOc.entity.Consulta;


@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

}
