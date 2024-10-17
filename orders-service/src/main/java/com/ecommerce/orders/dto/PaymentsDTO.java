package com.ecommerce.orders.dto;

import com.ecommerce.orders.entity.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentsDTO {
    private Long id;
    private String orderId;
    private PaymentType paymentMethod;
    private String paymentNumber;
    private LocalDateTime paymentDate;
}
