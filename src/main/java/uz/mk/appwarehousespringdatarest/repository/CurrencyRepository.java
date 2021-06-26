package uz.mk.appwarehousespringdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.mk.appwarehousespringdatarest.entity.Currency;
import uz.mk.appwarehousespringdatarest.projection.CustomCurrency;

@RepositoryRestResource(path = "currency",collectionResourceRel = "list",excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
    boolean existsByName(String name);
}
