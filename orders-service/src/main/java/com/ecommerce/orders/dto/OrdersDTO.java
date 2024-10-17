package com.ecommerce.orders.dto;

import com.ecommerce.orders.entity.OrderStatus;

public class OrdersDTO {
    private Long id;
    private String orderId;
    private Long userId;
    private Double totalAmount;
    private Long quantity;
    private Double discount;
    private OrderStatus orderStatus;
}
