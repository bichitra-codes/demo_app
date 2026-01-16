package com.formservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formservice.entity.UserData;
import com.formservice.respository.UserDataRespository;

@Service
public class UserDataService {

	@Autowired
	private UserDataRespository userDataRepository;
	
	public UserData saveUserData(UserData userData) {
		return userDataRepository.save(userData);
	}
}
