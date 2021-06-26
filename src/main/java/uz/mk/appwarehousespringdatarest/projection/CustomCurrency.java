package uz.mk.appwarehousespringdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.mk.appwarehousespringdatarest.entity.Currency;

@Projection(types= Currency.class)
public interface CustomCurrency {
    Integer getId();

    String getName();

    boolean getActive();



}
