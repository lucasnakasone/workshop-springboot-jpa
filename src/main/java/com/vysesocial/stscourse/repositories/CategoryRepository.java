package com.vysesocial.stscourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vysesocial.stscourse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
