package com.vasyateam.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * Model represents order dto.
 *
 * @author Vasiliy_Miroshin
 */
@Data
@Accessors(chain = true)
public class OrderDto {

    private int id;

    private String address;

    private String clientName;

    private String clientPhone;

    private String orderSource;

    private String paymentType;

    private Boolean asap;

    private LocalDateTime orderTime;

    private LocalDateTime plannedDeliveryTime;

    private LocalDateTime factDeliveryTime;

    private String courierName;

    private String courierPhone;

    private String status;
}

