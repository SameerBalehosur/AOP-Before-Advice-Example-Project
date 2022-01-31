package com.te.applicationwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.applicationwork.dao.UserDao;
import com.te.applicationwork.dto.Users;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao dao;

	@Override
	public Users add(Users users) {
		return dao.save(users);
	}

	@Override
	public Users update(int id) {
		Users findById = dao.findById(id);
		return dao.findById(id);
	}

	@Override
	public void delete(int id) {
		 dao.deleteById(id);
	}

	@Override
	public Users findById(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Users> findAllUsers(List<Users> list) {
		return dao.findAll();
	}

}
