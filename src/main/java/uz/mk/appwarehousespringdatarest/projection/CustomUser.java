package uz.mk.appwarehousespringdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.mk.appwarehousespringdatarest.entity.Supplier;
import uz.mk.appwarehousespringdatarest.entity.User;
import uz.mk.appwarehousespringdatarest.entity.Warehouse;

import java.util.Set;

@Projection(types= User.class)
public interface CustomUser {
    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    boolean getActive();

    Set<Warehouse> getWarehouses();
}
