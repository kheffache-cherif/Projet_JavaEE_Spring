package com.Office_Tourisme.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.Office_Tourisme.model.User;
import com.Office_Tourisme.web.dto.UserRegistrationDto;



public interface UserService extends UserDetailsService{
	// l'implementation de UserDetailsService  déclarer dan la configuration  pour permettre de recuperer les details de l'utilisateur
	User save(UserRegistrationDto registrationDto);
}
