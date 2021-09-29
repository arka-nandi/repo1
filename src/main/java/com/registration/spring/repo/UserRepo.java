package com.registration.spring.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.registration.spring.model.Registration;

@Repository

public interface UserRepo extends CrudRepository<Registration,String> {
	
	

}
