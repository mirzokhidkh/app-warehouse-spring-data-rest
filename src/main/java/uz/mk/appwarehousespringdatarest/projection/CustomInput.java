package uz.mk.appwarehousespringdatarest.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.mk.appwarehousespringdatarest.entity.Currency;
import uz.mk.appwarehousespringdatarest.entity.Input;
import uz.mk.appwarehousespringdatarest.entity.Supplier;
import uz.mk.appwarehousespringdatarest.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();

    Timestamp getDate();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();
}
