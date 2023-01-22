package com.vysesocial.stscourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vysesocial.stscourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
