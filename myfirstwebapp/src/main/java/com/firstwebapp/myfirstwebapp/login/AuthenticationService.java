package com.firstwebapp.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("chala");
		boolean isValidPassword = password.equalsIgnoreCase("chala");
		return isValidUserName && isValidPassword;
	}

}
