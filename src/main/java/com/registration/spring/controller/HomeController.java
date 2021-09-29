package com.registration.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.registration.spring.model.Registration;
import com.registration.spring.repo.UserRepo;
import com.registration.spring.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService sv;
	
	@RequestMapping("/Registration")
	public String reg()
	{
		return "registration.jsp";
	}
	@RequestMapping(value ="/Registration", method= RequestMethod.POST)
		public String setReg(@ModelAttribute("Registration") Registration register)
	{
		if(sv.registeredMail(register.getEmail()))
			return "unccess.jsp";
		else if(!sv.invalidEmail(null))
		{
			return "invalid.jsp";
		}
		else {
		sv.saveForm(register);
		return "success.jsp";
		}
		
		
	}
	

}
