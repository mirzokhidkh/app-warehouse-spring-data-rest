package uz.mk.appwarehousespringdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.mk.appwarehousespringdatarest.entity.Client;
import uz.mk.appwarehousespringdatarest.projection.CustomClient;

@RepositoryRestResource(path = "client",collectionResourceRel = "list",excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {
    boolean existsByPhoneNumber(String phoneNumber);
    boolean existsByPhoneNumberAndIdNot(String phoneNumber, Integer id);
}
