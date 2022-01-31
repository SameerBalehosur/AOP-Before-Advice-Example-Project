package com.te.applicationwork.service;

import java.util.List;

import com.te.applicationwork.dto.Users;

public interface UserService {
	public Users add(Users users);

	public Users update(int id);

	public void delete(int id);

	public Users findById(int id);
	
	public List<Users> findAllUsers(List<Users> list);
}
