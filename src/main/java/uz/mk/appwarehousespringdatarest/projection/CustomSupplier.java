package uz.mk.appwarehousespringdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.mk.appwarehousespringdatarest.entity.Supplier;

@Projection(types= Supplier.class)
public interface CustomSupplier {
    Integer getId();

    String getName();

    boolean getActive();

    String getPhoneNumber();



}
