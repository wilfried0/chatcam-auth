package com.backend.chatcam.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.chatcam.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);
	
	Optional<User> findByEmail(String email);
	
	Optional<User> findBySexe(String sexe);
	
	Optional<User> findByFirstname(String firstname);
	
	Optional<User> findByLastname(String lastname);
	
	Boolean existsByUsername(String username);
	
	Boolean existsByEmail(String email);
	
	Optional<User> findByUsernameOrEmail(String username, String email);
}
