package com.ecommerce.orders.sevice;

import com.ecommerce.orders.entity.Order;

import java.util.List;

public interface OrderService {
     Order placeOrder(Order order, Long userId);

     List<Order> getAllOrders(Long userId, String userName);

     Order getOrderById(String orderId);

     void CancelOrder(String orderId);

}
