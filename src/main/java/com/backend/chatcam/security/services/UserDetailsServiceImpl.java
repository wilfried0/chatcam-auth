package com.backend.chatcam.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.chatcam.models.User;
import com.backend.chatcam.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	UserRepository UserRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = UserRepository.findByUsernameOrEmail(username, username)
				.orElseThrow(() -> new UsernameNotFoundException("User not found with username or email: "+username));
		
		return UserDetailsImpl.build(user);
	}

}
