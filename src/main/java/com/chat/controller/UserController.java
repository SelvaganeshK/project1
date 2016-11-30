package com.chat.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chat.model.UserName;
import com.chat.service.UserNameService;



@Controller
public class UserController {
	@Autowired
	UserNameService usernameservice;

@RequestMapping("/welcome")
public ModelAndView jess(HttpServletRequest req,Model m) {
	boolean flag=false;
String name=req.getParameter("name");
String emailid=req.getParameter("email");
String password=req.getParameter("password");
String password1=req.getParameter("password1");
	
if ((name.isEmpty() )|| (emailid.isEmpty())||(password1.isEmpty())||	(password.isEmpty())) 
	{
		return new ModelAndView("Register","error","You must fill all the fields");
	
	} 
 if(!(password.equals(password1)))
	{
		return new ModelAndView("Register","error","Password doesn't match..");
	}
	else
	{
		for (char c : name.toCharArray()) 
		{
            if (flag = Character.isDigit(c)) 
            {
            	return new ModelAndView("Register","error","UserId cannot contain any digits..");
            }
           
        }
		
	}
 UserName us=new UserName();
 us.setName(name);
 us.setEmail(emailid);
 us.setPassword(password1);
 Date date=new Date();
 us.setCreationDate(date);
usernameservice.insertRow(us);
	 return new ModelAndView("home");

}
}