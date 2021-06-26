package uz.mk.appwarehousespringdatarest.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.mk.appwarehousespringdatarest.entity.*;

import java.sql.Date;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Output getOutput();
}
