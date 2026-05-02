package com.sameer.Ecom.repo;

import com.sameer.Ecom.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
    Optional<Order> findByOrOrderId(String orderId);
}
