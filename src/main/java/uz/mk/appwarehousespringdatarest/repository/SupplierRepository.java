package uz.mk.appwarehousespringdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.mk.appwarehousespringdatarest.entity.Supplier;
import uz.mk.appwarehousespringdatarest.projection.CustomSupplier;

@RepositoryRestResource(path = "supplier",collectionResourceRel = "list",excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
    boolean existsByPhoneNumber(String phoneNumber);
    boolean existsByPhoneNumberAndIdNot(String phoneNumber, Integer id);
}
