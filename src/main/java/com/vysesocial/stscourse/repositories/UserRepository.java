package com.vysesocial.stscourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vysesocial.stscourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
