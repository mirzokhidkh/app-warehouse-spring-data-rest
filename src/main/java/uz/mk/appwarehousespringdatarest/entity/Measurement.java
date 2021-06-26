package uz.mk.appwarehousespringdatarest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.mk.appwarehousespringdatarest.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Measurement extends AbsEntity {

}
