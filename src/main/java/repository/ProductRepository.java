package repository;

/**
 * Created by Zane on 11/19/2015.
 */
import model.Product;
import org.springframework.data.repository.CrudRepository;

//@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Integer>{
}
