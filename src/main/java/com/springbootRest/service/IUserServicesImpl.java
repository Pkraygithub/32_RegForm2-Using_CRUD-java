package com.springbootRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootRest.model.UserDetails;
import com.springbootRest.repo.UserRepositery;

import jakarta.transaction.Transactional;

@Service("service")
public class IUserServicesImpl implements IUserDetails{

	@Autowired
	private  UserRepositery repo;
	
	@Transactional
	public Integer saveUserDetals(UserDetails id) {
		
		return repo.save(id).getUserId();
	}

	@Override
	public void updateUserDetals(UserDetails userDetails) {
			
		repo.save(userDetails);
	}

	@Override
	public void deleteUserDetals(Integer id) {

			repo.deleteById(id);
		
	}

	@Override
	public UserDetails getOneByUserDetalsId(Integer id) {
		Optional<UserDetails> list=repo.findById(id);
		
		if(list.isPresent()) {
			
			return list.get();
			
		}
		 
		return null;
	}

	@Override
	public List<UserDetails> getAllUserDetalsId() {

		List<UserDetails> list=repo.findAll();
		
		return list;
	}

}
