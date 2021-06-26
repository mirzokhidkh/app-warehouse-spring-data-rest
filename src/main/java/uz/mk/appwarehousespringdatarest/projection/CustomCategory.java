package uz.mk.appwarehousespringdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.mk.appwarehousespringdatarest.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();

    String getName();

    boolean getActive();
    
    CustomCategory getParentCategory();
}
