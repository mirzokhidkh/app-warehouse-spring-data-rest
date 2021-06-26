package uz.mk.appwarehousespringdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.mk.appwarehousespringdatarest.entity.Measurement;

@Projection(types= Measurement.class)
public interface CustomMeasurement {
    Integer getId();

    String getName();

    boolean getActive();



}
