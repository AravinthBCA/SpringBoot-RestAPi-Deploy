package springboot.Repositories;

import org.springframework.data.repository.CrudRepository;

import springboot.entities.Product;

public interface ProductRepo extends CrudRepository<Product,Integer> {

}
