package uz.mk.appwarehousespringdatarest.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.mk.appwarehousespringdatarest.entity.Input;
import uz.mk.appwarehousespringdatarest.entity.InputProduct;
import uz.mk.appwarehousespringdatarest.entity.Product;

import java.sql.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Input getInput();
}
