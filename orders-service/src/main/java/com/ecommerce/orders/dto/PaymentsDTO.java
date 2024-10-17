package com.ecommerce.orders.dto;

import java.time.LocalDateTime;

public class PaymentsDTO {
    private Long id;
    private String orderId;
    private String paymentMethod;

    private String paymentNumber;
    private LocalDateTime paymentDate;
}
