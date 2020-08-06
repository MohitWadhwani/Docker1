package com.login.Service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	public boolean checkUser(String name,String pwd)
	{
		return name.equalsIgnoreCase("hye") && pwd.equals("123456");
	}
}
