package com.authentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.model.User;
import com.authentication.service.UserService;

@Controller
public class DummyController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/dummy")
	public String getDummy() {
		return "Controller Working";
	}
	@RequestMapping(value="/createUser",method=RequestMethod.POST)
	public ResponseEntity<User> createuser(@RequestBody User usr) throws Exception{
		userService.save(usr);
		return new ResponseEntity<User>(usr,HttpStatus.CREATED);
	}
	@RequestMapping(value="/getAlluser")
	public ResponseEntity<List<User>> getAllUser(){
		List<User> userList=userService.getAll();
		
		return new ResponseEntity<List<User>>(userList,HttpStatus.OK);
	}
}
