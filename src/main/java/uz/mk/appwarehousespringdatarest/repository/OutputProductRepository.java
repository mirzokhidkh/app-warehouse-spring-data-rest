package uz.mk.appwarehousespringdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.mk.appwarehousespringdatarest.entity.OutputProduct;
import uz.mk.appwarehousespringdatarest.projection.CustomOutputProduct;

import java.util.List;

@RepositoryRestResource(path = "outputProduct",collectionResourceRel = "list",excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
    List<OutputProduct> findAllByOutputIdOrderByAmountDesc(Integer output_id);
}
