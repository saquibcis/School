package com.project.School.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.School.Model.User;
import com.project.School.Service.Service;

@RestController
public class LoginController {
	@Autowired
	private User user;
	@Autowired
	private Service service;
	
	@RequestMapping("/add/{name}/{password}/{admin}/{designation}")
	public boolean addUser(@PathVariable("name") String name,
			@PathVariable("password") String pass,
			@PathVariable("admin") boolean admin,
			@PathVariable("designation") String desig) {
		
			user.setName(name);
			user.setPassword(pass);
			user.setAdmin(admin);
			user.setDesignation(desig);
			System.out.println(user.getName()+" "+user.getDesignation());
			boolean success = service.addUser(user);
			if(success) return true;
			
		return false;
	}

	@RequestMapping("/validate")
	public boolean isLoginSuccessful(@RequestParam String name, @RequestParam String pass) {
		
		if(name.equals("saquib") && pass.equals("password"))
			return true;
		
		return false;
		
	}
	
}

