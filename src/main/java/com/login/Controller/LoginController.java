package com.login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.login.Service.LoginService;


@Controller
@SessionAttributes("name")
public class LoginController {
	
	//Injected
	@Autowired
	LoginService service;
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginPage()
	{
		return "login";
	}
	@RequestMapping(value="/welcomePage",method=RequestMethod.POST)
	public String welcomePage(@RequestParam String name,@RequestParam String pwd,ModelMap model)
	{
		
		if(!service.checkUser(name, pwd))
		{
		model.put("message","Invalid User Try once again");
		return "login";
		}
		
		model.addAttribute("name",name);
		model.addAttribute("pwd",pwd);
		return "welcomePage";
	}

}
