package com.vasyateam.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity for deliverymen description.
 *
 * @author Vasiliy_Miroshin
 */
@Entity
@Table(name = "couriers")
@Getter
@Setter
@Accessors(chain = true)
public class Deliveryman {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;
}
