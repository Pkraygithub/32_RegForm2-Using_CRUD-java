package com.springbootRest.service;

import java.util.List;

import com.springbootRest.model.UserDetails;

public interface IUserDetails {
	
	Integer saveUserDetals(UserDetails id);
	void  updateUserDetals(UserDetails userDetails);
	void deleteUserDetals(Integer id);
	
	UserDetails getOneByUserDetalsId(Integer  id);
	
	List<UserDetails> getAllUserDetalsId();
	
	
		
}
