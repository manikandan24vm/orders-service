package com.ecommerce.orders.sevice;

import com.ecommerce.orders.entity.Order;

import java.util.List;

public interface OrderService {
     Order placeOrder(Order order, Long userId, Long productId);

     List<Order> getAllOrders(Long userId, Long productId);

     Order getOrderById(String orderId);

     void CancelOrder(String orderId);

     String generateOrderId();

     Double calculateTotalAmount(Double price, Long quantity);

}
