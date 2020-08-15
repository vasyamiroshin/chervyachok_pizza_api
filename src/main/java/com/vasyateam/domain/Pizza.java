package com.vasyateam.domain;

import com.vasyateam.domain.enums.DoughType;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 * Model for pizza item.
 *
 * @author Vasiliy_Miroshin
 */
@Entity
@Table(name = "pizza")
@Getter
@Setter
@Accessors(chain = true)
public class Pizza extends FoodItem {

    @Column(name = "radius")
    private Integer radius;

    @Column(name = "dough_type")
    @Enumerated(EnumType.STRING)
    private DoughType doughType;

}
