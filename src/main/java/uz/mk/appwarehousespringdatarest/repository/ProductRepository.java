package uz.mk.appwarehousespringdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.mk.appwarehousespringdatarest.entity.Product;
import uz.mk.appwarehousespringdatarest.projection.CustomProduct;

@RepositoryRestResource(path = "product",collectionResourceRel = "list",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {
    boolean existsByNameAndCategoryId(String name, Integer category);
}
