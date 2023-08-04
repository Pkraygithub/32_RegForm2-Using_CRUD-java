package com.springbootRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springbootRest.model.UserDetails;
import com.springbootRest.service.IUserDetails;

@Controller
@RequestMapping("/regForm")
public class userController {

	@Autowired
	private IUserDetails  service;
	
	@GetMapping("/home")
	public String homeUser(Model model) {
		
		model.addAttribute("uerDetails", new UserDetails());
		
		return "index";
	}
	@PostMapping("/registersave")
	public String homeuserRegister(@ModelAttribute UserDetails userDetails,Model model) {
		
		Integer id	=service.saveUserDetals(userDetails);
		
		String msg="User Registration Id '"+id+"' is Successfully Done.";
		
			model.addAttribute("message",msg);
		
		return "index";
	}
	
	
	@GetMapping("/showall")
	public String showuserRegister(Model model) {
		
		List<UserDetails> listall= service.getAllUserDetalsId();
				
		model.addAttribute("showall",listall);
	
		return "showAlluserDetails";
	}
	
	
	@GetMapping("/delete")
	public String removeUserDetails(@RequestParam Integer userId) {
		
		service.deleteUserDetals(userId);
	
		//return "showAlluserDetails";
		
		return "redirect:showall";
	}
	
	@GetMapping("/edit")
	public String showEditUserDetails(@RequestParam Integer userId,Model model) {
		
		UserDetails uds = service.getOneByUserDetalsId(userId);
	
		model.addAttribute("userDetails",uds);
		
		return "EditUserDetails";
	}
	
	@PostMapping("/update")
	public String updateUserDetails(@ModelAttribute UserDetails userDetails) {
		
		service.updateUserDetals(userDetails);
		
		//return "EditUserDetails";
		
		return "redirect:showall";
	}
}
