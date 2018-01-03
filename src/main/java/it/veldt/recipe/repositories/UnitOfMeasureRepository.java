package it.veldt.recipe.repositories;

import it.veldt.recipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Dennis V. on 2-1-2018
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
