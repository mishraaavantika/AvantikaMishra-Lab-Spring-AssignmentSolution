package com.greatLearning.Lab6StudentManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.greatLearning.Lab6StudentManagement.entity.User;
import com.greatLearning.Lab6StudentManagement.repository.UserRepository;
import com.greatLearning.Lab6StudentManagement.security.StudentDetails;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	private PasswordEncoder passwordEncoder;

	public UserDetailsServiceImpl(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.getUserByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException("Could not find user");
		}
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return new StudentDetails(user);
	}

}
