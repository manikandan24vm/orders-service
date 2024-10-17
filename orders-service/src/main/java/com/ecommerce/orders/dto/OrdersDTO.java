package com.ecommerce.orders.dto;

import com.ecommerce.orders.entity.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter @AllArgsConstructor @NoArgsConstructor
public class OrdersDTO {
    private Long id;
    private String orderId;
    private Long userId;
    private Long productId;
    private Double totalAmount;
    private Long quantity;
    private Double price;
    private OrderStatus orderStatus;
}
