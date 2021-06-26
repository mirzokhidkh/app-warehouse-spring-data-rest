package uz.mk.appwarehousespringdatarest.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.mk.appwarehousespringdatarest.entity.Attachment;
import uz.mk.appwarehousespringdatarest.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    String getName();

    boolean getActive();

    CustomCategory getCategory();

    Attachment getPhoto();

    String getCode();

    CustomMeasurement getMeasurement();
}
