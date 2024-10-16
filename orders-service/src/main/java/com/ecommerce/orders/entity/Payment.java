package com.ecommerce.orders.entity;

import java.time.LocalDateTime;

public class Payment {
    private Long id;
    private String orderId;
    private String paymentMethod;
    private LocalDateTime paymentDate;

}
