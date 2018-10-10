package whenDoc.whenDOc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import whenDoc.whenDOc.entity.Diagnostico;



@Repository
public interface DiagnosticoRepository extends JpaRepository<Diagnostico, Long> {

}
