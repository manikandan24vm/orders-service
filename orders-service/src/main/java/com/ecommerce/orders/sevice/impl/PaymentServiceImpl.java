package com.ecommerce.orders.sevice.impl;

import com.ecommerce.orders.entity.Payment;
import com.ecommerce.orders.exception.PaymentException;
import com.ecommerce.orders.exception.PaymentNotFoundException;
import com.ecommerce.orders.repository.PaymentRepository;
import com.ecommerce.orders.sevice.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private PaymentRepository paymentRepository;
    @Override
    public Payment makePayment(Payment payment) {
        try{
           return paymentRepository.save(payment);
        }catch (Exception e){
            throw new PaymentException("Can't make a payment");
        }
    }

    @Override
    public Payment checkPaymentStatus(String paymentNumber) {
       Payment payment= paymentRepository.checkPaymentStatus(paymentNumber)
               .orElseThrow(()-> new PaymentNotFoundException("Payment not found with Id :"+paymentNumber));
       return payment;
    }
}
