package uz.mk.appwarehousespringdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.mk.appwarehousespringdatarest.entity.User;
import uz.mk.appwarehousespringdatarest.projection.CustomUser;

@RepositoryRestResource(path = "user",collectionResourceRel = "list",excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User,Integer> {
    boolean existsByPhoneNumber(String phoneNumber);
    boolean existsByPhoneNumberAndIdNot(String phoneNumber, Integer id);
}
