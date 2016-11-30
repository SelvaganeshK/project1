package com.chat.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chat.model.Blog;
import com.chat.model.Forum;


@Controller
public class HandlingController {

	public HandlingController() {
		System.out.println("welcome..");
		// TODO Auto-generated constructor stub
	}
	

	@RequestMapping("/")
	public String gotohome()
	{
		return "home";
	}
	
	@RequestMapping("home")
	public String gotohom()
	{
		return "home";
	}
	
	
	@RequestMapping("login")
	public String gotologin()
	{
		return "login";
	}
		
	@RequestMapping("Register")
	public String gotoreg()
	{
		return "Register";
	}
	
	@RequestMapping("blog")
	public String gotoblog(@ModelAttribute ("blo")Blog blo)
	{
		return "blog";
	}
	
	@RequestMapping("forum")
	public String gotoforum(@ModelAttribute ("frum")Forum frum)
	{
		return "forum";
	}
	
	
	@RequestMapping("chat")
	public String gotochat()
	{
		return "chat";
	}
	
	@RequestMapping(value="/checklogin",method=RequestMethod.POST)
	public String validdateLogin(HttpServletRequest req) {
		String u=req.getParameter("username");
		String pass=req.getParameter("password");
		if ((u.equals("selva")) && (pass.equals("ganesh"))) {
			return "home";
		}else{return"sorry";
		}
		}
	
	}

