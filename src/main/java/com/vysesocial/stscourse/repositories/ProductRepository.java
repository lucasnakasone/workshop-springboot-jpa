package com.vysesocial.stscourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vysesocial.stscourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
