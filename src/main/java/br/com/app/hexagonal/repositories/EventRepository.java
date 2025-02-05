package br.com.app.hexagonal.repositories;

import br.com.app.hexagonal.models.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {

}
