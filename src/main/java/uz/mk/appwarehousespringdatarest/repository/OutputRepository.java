package uz.mk.appwarehousespringdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.mk.appwarehousespringdatarest.entity.Output;
import uz.mk.appwarehousespringdatarest.projection.CustomOutput;

import java.util.Date;
import java.util.List;

@RepositoryRestResource(path = "output",collectionResourceRel = "list",excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output,Integer> {
    boolean existsByFactureNumber(String factureNumber);
    boolean existsByFactureNumberAndIdNot(String factureNumber, Integer id);

    @Query(value = "select * from output where date BETWEEN :startDate AND :endDate",nativeQuery = true)
    List<Output> getOutputIdBetweenDates(@Param("startDate") Date startDate, @Param("endDate")Date endDate);
}
