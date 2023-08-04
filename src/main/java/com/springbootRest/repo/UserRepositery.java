package com.springbootRest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootRest.model.UserDetails;

public interface UserRepositery extends JpaRepository<UserDetails, Integer>{

}
