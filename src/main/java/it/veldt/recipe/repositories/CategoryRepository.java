package it.veldt.recipe.repositories;

import it.veldt.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dennis V. on 2-1-2018
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
