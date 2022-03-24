package com.foot.fcb.fan.score.dto;

import java.util.Set;

public class SignupRequest {

	private String username;

	private String email;

	private Set<String> role;

	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public Set<String> getRole() {
		return role;
	}

	public void setRole(final Set<String> role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}
}
