package com.te.applicationwork.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.applicationwork.dto.Users;

public interface UserDao extends JpaRepository<Users, Integer> {
	public Users findById(int id);
}
