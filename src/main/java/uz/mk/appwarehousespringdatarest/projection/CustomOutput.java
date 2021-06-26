package uz.mk.appwarehousespringdatarest.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.mk.appwarehousespringdatarest.entity.*;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();

    Timestamp getDate();

    Warehouse getWarehouse();

    Client getClient();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();
}
