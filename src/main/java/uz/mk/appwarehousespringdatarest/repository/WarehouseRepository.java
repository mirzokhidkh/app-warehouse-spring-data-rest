package uz.mk.appwarehousespringdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.mk.appwarehousespringdatarest.entity.Warehouse;
import uz.mk.appwarehousespringdatarest.projection.CustomWarehouse;

@RepositoryRestResource(path = "warehouse",collectionResourceRel = "list",excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {
    boolean existsByName(String name);
}
