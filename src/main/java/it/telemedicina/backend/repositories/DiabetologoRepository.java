package it.telemedicina.backend.repositories;

import it.telemedicina.backend.domain.Diabetologo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiabetologoRepository extends CrudRepository<Diabetologo, Long> {

}
