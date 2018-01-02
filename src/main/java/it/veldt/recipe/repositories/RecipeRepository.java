package it.veldt.recipe.repositories;

import it.veldt.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dennis V. on 2-1-2018
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
