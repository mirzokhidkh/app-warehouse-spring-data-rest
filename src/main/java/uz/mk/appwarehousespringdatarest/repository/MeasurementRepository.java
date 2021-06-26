package uz.mk.appwarehousespringdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.mk.appwarehousespringdatarest.entity.Measurement;
import uz.mk.appwarehousespringdatarest.projection.CustomMeasurement;

@RepositoryRestResource(path = "measurement",collectionResourceRel = "list",excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {
    boolean existsByName(String name);


}
