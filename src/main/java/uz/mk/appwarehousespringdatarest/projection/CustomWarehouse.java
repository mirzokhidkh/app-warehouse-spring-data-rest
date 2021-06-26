package uz.mk.appwarehousespringdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.mk.appwarehousespringdatarest.entity.Warehouse;

@Projection(types= Warehouse.class)
public interface CustomWarehouse {
    Integer getId();

    String getName();

    boolean getActive();



}
