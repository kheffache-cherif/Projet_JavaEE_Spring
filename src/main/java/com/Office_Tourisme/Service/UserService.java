package com.Office_Tourisme.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.Office_Tourisme.model.User;
import com.Office_Tourisme.web.dto.UserRegistrationDto;



public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
