package com.ecommerce.orders.entity;

public class Order extends Audit {
    private Long id;
    private String orderId;

    private Long userId;
    private Double totalAmount;
    private OrderStatus orderStatus;

}
