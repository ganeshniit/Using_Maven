package basic.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class Controller {
	
	@RequestMapping("/index")
	public String index()
	{
		System.out.println("in index");
		return "index";
	}
	@RequestMapping("/signup")
	public String signup()
	{
		System.out.println("in signup");
		return "signup";
	}
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
}
