package com.uv.KM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uv.KM.model.User;
import com.uv.KM.service.UserService;


@RestController
public class LoginController {
		
	
	@Autowired
	private UserService usr;
	@RequestMapping(value="/login",method=RequestMethod.POST,
			produces="application/json", consumes="application/json")
	public User  Login(@RequestBody User u){
		 	
		usr.authenticateUser(u.getEmail(), u.getPassword());
		return u;
		
	}
}

