package it.telemedicina.backend.repositories;

import it.telemedicina.backend.domain.Paziente;
import org.springframework.data.repository.CrudRepository;

public interface PazienteRepository extends CrudRepository<Paziente, Long> {
}
