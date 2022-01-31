package com.te.applicationwork.controller;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.applicationwork.dto.Users;
import com.te.applicationwork.service.UserService;

@RestController
//@RequestMapping("/users")
public class UsersController {
	@Autowired
	UserService service;
	
	@PostMapping("/add")
	public ResponseEntity<?> addUser(@RequestBody Users users) {
		 service.add(users);
		 return new ResponseEntity<>("Data added Clearly",HttpStatus.OK);
	}
	@GetMapping("/get")
	public ResponseEntity<?> findUser(Users users,int id) {
		service.findById(id);
		return new ResponseEntity<>("Data fetched",HttpStatus.FOUND);
	}
}
