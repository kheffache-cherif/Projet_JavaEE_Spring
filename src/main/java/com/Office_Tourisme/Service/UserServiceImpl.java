package com.Office_Tourisme.Service;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.Office_Tourisme.Repository.UserRepository;
import com.Office_Tourisme.model.Role;
import com.Office_Tourisme.model.User;
import com.Office_Tourisme.web.dto.UserRegistrationDto;




@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	// -------------------faire attention à ccccccccccccccaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
//	@Bean
	//public BCryptPasswordEncoder passwordEncoder() {
	 //   return new BCryptPasswordEncoder();
//	}
	
	
	
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserRegistrationDto registrationDto) {
		
		Role role = new Role();
		role.setName("ROLE_USER");
		User user = new User();
				//User(registrationDto.getFirstName(), 
	
				//registrationDto.getLastName(), registrationDto.getEmail(),
				//passwordEncoder.encode(registrationDto.getPassword()), Arrays.asList(new Role("ROLE_USER")));
		user.setFirstName(registrationDto.getLastName());
		user.setEmail( registrationDto.getEmail());
		user.setPassword(passwordEncoder.encode(registrationDto.getPassword()));
		user.setRoles( Arrays.asList(role));
		return userRepository.saveAndFlush(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {// trés important de redefenir la methode de UserDetailsService
	
		User user = userRepository.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));		
	}
	
	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}
	
}
