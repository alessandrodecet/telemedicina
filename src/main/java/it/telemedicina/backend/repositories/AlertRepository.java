package it.telemedicina.backend.repositories;

import it.telemedicina.backend.domain.Alert;
import org.springframework.data.repository.CrudRepository;

public interface AlertRepository extends CrudRepository<Alert, Long> {
}
