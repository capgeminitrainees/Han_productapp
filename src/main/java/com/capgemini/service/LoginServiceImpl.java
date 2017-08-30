package com.capgemini.service;

import com.capgemini.model.Login;

public class LoginServiceImpl implements LoginService{

	@Override
	public boolean isValidUser(Login login) {
			if(login.getUserName().equals("tom")&&
					login.getUserPwd().equals("tom123"))
			return true;
		
		return false;
	}

}
