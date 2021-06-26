package uz.mk.appwarehousespringdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.mk.appwarehousespringdatarest.entity.Client;
import uz.mk.appwarehousespringdatarest.entity.Supplier;

@Projection(types= Client.class)
public interface CustomClient {
    Integer getId();

    String getName();

    String getPhoneNumber();



}
