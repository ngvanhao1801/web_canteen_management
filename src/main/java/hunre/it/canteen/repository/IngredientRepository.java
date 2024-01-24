package hunre.it.canteen.repository;

import hunre.it.canteen.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {

}