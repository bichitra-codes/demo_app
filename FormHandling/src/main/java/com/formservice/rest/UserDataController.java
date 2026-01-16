package com.formservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formservice.entity.UserData;
import com.formservice.service.UserDataService;

@RestController
@RequestMapping("/api")
public class UserDataController {
	
	@Autowired
	private UserDataService userDataService;
	
	@PostMapping("/saveData")
	 @CrossOrigin(origins = "http://127.0.0.1:5500/")
	public UserData saveData(@RequestBody UserData uaserData) {
		
		return userDataService.saveUserData(uaserData);
	}
	

}
