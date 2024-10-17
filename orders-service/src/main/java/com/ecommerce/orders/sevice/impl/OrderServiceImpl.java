package com.ecommerce.orders.sevice.impl;

import com.ecommerce.orders.entity.Order;
import com.ecommerce.orders.exception.OrderNotFoundException;
import com.ecommerce.orders.exception.OrdersException;
import com.ecommerce.orders.repository.OrdersRepository;
import com.ecommerce.orders.sevice.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private OrdersRepository ordersRepository;

    @Override
    public Order placeOrder(Order order, Long userId) {
        try {
            return ordersRepository.save(order);
        } catch (Exception e) {
            throw new RuntimeException("Can't place a order :" + e);
        }
    }

    @Override
    public List<Order> getAllOrders(Long userId, String userName) {
        List<Order> orders = ordersRepository.findAll();
        if (!CollectionUtils.isEmpty(orders)) {
            return orders;
        } else {
            throw new OrderNotFoundException("Orders not found.");
        }
    }

    @Override
    public Order getOrderById(String orderId) {
        Order order = ordersRepository.findOrderById(orderId)
                .orElseThrow(() -> new OrderNotFoundException("Order not found with ID :" + orderId));
        return order;
    }

    @Override
    public void CancelOrder(String orderId) {
        Order order = ordersRepository.findOrderById(orderId)
                .orElseThrow(() -> new OrderNotFoundException("Order not found with ID :" + orderId));
        try {
            ordersRepository.delete(order);
        } catch (Exception e) {
            throw new OrdersException("Can't cancel the order with ID :" + orderId);
        }
    }
}
