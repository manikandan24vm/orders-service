package com.ecommerce.orders.sevice;

import com.ecommerce.orders.entity.Payment;

public interface PaymentService {

    Payment makePayment(Payment payment);

    Payment checkPaymentStatus(String paymentNumber);
}
