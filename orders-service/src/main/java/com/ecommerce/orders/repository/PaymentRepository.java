package com.ecommerce.orders.repository;

import com.ecommerce.orders.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
    @Query("SELECT p FROM Payment p WHERE p.paymentNumber =:paymentNumber")
    Optional<Payment> checkPaymentStatus(String paymentNumber);
}
