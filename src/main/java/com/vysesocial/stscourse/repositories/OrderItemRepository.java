package com.vysesocial.stscourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vysesocial.stscourse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
