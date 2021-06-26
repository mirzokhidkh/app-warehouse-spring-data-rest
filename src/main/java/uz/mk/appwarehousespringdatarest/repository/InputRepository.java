package uz.mk.appwarehousespringdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.mk.appwarehousespringdatarest.entity.Input;
import uz.mk.appwarehousespringdatarest.projection.CustomInput;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "input",collectionResourceRel = "list",excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input,Integer> {
    boolean existsByFactureNumber(String factureNumber);
    boolean existsByFactureNumberAndIdNot(String factureNumber, Integer id);


    Optional<Input> findAllByDateGreaterThanEqualAndDateLessThanEqual(Timestamp date1, Timestamp date2);

    @Query(value = "select * from input where date BETWEEN :startDate AND :endDate",nativeQuery = true)
     List<Input> getAllInputIdBetweenDates(@Param("startDate") Date startDate, @Param("endDate")Date endDate);
}
