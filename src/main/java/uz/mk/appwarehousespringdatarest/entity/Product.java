package uz.mk.appwarehousespringdatarest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.mk.appwarehousespringdatarest.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Product extends AbsEntity {

    @ManyToOne(optional = false)
    private Category category;

    @OneToOne
    private Attachment photo;

    @Column(unique = true)
    private String code;

    @ManyToOne(optional = false)
    private Measurement measurement;
}
