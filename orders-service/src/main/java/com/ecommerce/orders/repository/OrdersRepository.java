package com.ecommerce.orders.repository;

import com.ecommerce.orders.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface OrdersRepository extends JpaRepository<Order,Long> {
    @Query("SELECT o FROM Order o WHERE o.orderId =:orderId")
    Optional<Order> findOrderById(@Param("orderId") String orderId);
}
