package com.vasyateam.domain;

import com.vasyateam.domain.enums.OrderSource;
import com.vasyateam.domain.enums.OrderStatus;
import com.vasyateam.domain.enums.PaymentType;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Model for order.
 *
 * @author Vasiliy_Miroshin
 */
@Entity
@Table(name = "orders")
@Getter
@Setter
@Accessors(chain = true)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "id")
    private String address;

    @Column(name = "client")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(name = "source")
    @Enumerated(EnumType.STRING)
    private OrderSource source;

    @Column(name = "payment_type")
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @Column(name = "asap")
    private Boolean asap;

    @Column(name = "order_time")
    private LocalDateTime orderTime;

    @Column(name = "planned_delivery_time")
    private LocalDateTime plannedDeliveryTime;

    @Column(name = "fact_delivery_time")
    private LocalDateTime factDeliveryTime;

    @Column(name = "courier")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courier_id")
    private Deliveryman courier;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
