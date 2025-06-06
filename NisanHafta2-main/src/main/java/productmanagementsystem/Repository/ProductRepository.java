package productmanagementsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import productmanagementsystem.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
