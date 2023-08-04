package com.springbootRest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Users_Details")
public class UserDetails {

	@Id
	@Column(name="User_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  userId;
	
	@Column(name="Name")
	private String fullName;
	@Column(name="Email")
	private String emailId;
	
	private String password;
	
	private Long mobileNumber;
	private String gender;

	private String dob;
	@Column(name="Address")
	private String address;

	
	
	
	
	
	

	
}
