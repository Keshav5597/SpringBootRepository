package com.keshav.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.keshav.model.User;

@Controller
public class MyController {
	@RequestMapping("/")
	public String home()
	{
		System.out.println("Test App....");
		return "index.jsp";
	}
	@RequestMapping("add")
	/*public String add(@RequestParam("userName")String userName , @RequestParam("userPassword")String userPassword , Model m)
	{
		User user=new User();
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		m.addAttribute("user",user);
		System.out.println("working.......");
		return "welcome.jsp";
	}*/
	public String add(@ModelAttribute User user)
	{
		return "welcome.jsp";
	}
}
