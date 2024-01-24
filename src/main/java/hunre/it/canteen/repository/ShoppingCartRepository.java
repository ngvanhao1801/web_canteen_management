package hunre.it.canteen.repository;

import hunre.it.canteen.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {

}