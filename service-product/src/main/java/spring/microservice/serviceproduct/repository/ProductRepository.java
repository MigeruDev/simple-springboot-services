package spring.microservice.serviceproduct.repository;

import spring.microservice.serviceproduct.entity.Category;
import spring.microservice.serviceproduct.entity.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
   
   public List<Product> findByCategory(Category category);
}
