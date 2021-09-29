package com.registration.spring.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.registration.spring.model.Registration;
import com.registration.spring.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo repo;
	@Autowired 
	Optional<Registration> of1;

	
	public void saveForm(Registration register)
	{
		repo.save(register);
	}
	public boolean registeredMail(String mail)
	{
		of1=repo.findById(mail);
		if(of1.isPresent())
			return true;
		else
			return false;
		
	}
	public boolean invalidEmail(String mail)
	{
		if(mail.indexOf('@')!=-1)
			return true;
		else
		return false;
		
	}
}
