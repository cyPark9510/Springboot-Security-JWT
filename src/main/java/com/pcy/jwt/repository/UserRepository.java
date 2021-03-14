package com.pcy.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcy.jwt.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	public User findByUsername(String username);
}
