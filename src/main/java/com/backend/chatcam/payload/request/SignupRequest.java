package com.backend.chatcam.payload.request;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignupRequest {
	
	@NotBlank
    @Size(min = 3, max = 20)
	private String username;
	
	@NotBlank
    @Size(min = 6, max = 40)
	private String password;
	
	@NotBlank
    @Size(min = 3, max = 20)
	private String firstname;
	
	@NotBlank
    @Size(min = 3, max = 20)
	private String lastname;
	
	@NotBlank
    @Size(min = 3, max = 20)
	private String sexe;
	
	@NotBlank
    @Size(max = 50)
	@Email
	private String email;
	
	private Set<String> role;
	
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return this.lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getSexe() {
		return this.sexe;
	}
	
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}


	public Set<String> getRole() {
		return this.role;
	}


	public void setRole(Set<String> role) {
		this.role = role;
	}
}
