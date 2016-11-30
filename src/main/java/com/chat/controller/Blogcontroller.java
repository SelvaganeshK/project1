package com.chat.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chat.model.Blog;
import com.chat.model.Cmd;
/*import com.chat.model.Comment;*/
import com.chat.service.BlogService;
import com.chat.service.CommentService;
/*import com.chat.service.CommentService;*/
import com.google.gson.Gson;


@Controller
public class Blogcontroller {

	public Blogcontroller() {
		System.out.println("blog controller");
	}

	@Autowired
	BlogService blogService;
	@Autowired
	CommentService commentService;
	
	/*@Autowired
    CommentService commentService;*/

	@RequestMapping(value="blog1",method=RequestMethod.POST)
	public ModelAndView blogg(@ModelAttribute("blo") Blog blo,Model m) {

		blo.setCreationDate(new Date());;
		blogService.insertRow(blo);
		List<Blog> blogLt=blogService.getList();
		
		Gson gson=new Gson();
		String st=gson.toJson(blogLt);
		m.addAttribute("selva",st);
		System.out.println("Json"+st);
		return new ModelAndView("blog");
	}
	
	
	/*@RequestMapping("/blogpage")
	public String blogpage(@ModelAttribute("blo") Blog blo,@RequestParam int id,Model m)
	{
		blo=blogService.getRowById(id);
		m.addAttribute("b" ,blo);
	
		return "blogpage";	
	}
	*/
	
	@RequestMapping("/blogpage")
	public String blogpage(@ModelAttribute("cmt") Cmd cmt,@RequestParam int id,Model m)
	{
		Blog blo=blogService.getRowById(id);
		m.addAttribute("b" ,blo);
		//m.addAttribute("b", blo);
		List<Cmd> cmtLt=commentService.getList();
		List<Cmd> cmtNeed=new ArrayList<Cmd>();
		for(Cmd ccmt:cmtLt)
		{
			if(ccmt.getBlogid()==id)
			{
				cmtNeed.add(ccmt);
			}
		}
		/*String str=gson.toJson(cmtNeed);*/
		m.addAttribute("cmts", cmtNeed);
		return "blogpage";	
	}
	
	
	@RequestMapping("/blogview")
	public String blogpag(@ModelAttribute("blo") Blog blo,Model m)
	{
		blo.setCreationDate(new Date());;
		blogService.insertRow(blo);
		List<Blog> blogLt=blogService.getList();
		
		Gson gson=new Gson();
		String st=gson.toJson(blogLt);
		m.addAttribute("selva",st);
		System.out.println("Json"+st);
		return "blogview";	
	}
	
/*	@RequestMapping(value="addcmd",method=RequestMethod.POST)
	public String addcmd(@ModelAttribute("cmd") Comment cmd,Model m)
	{
		commentService.insertRow(cmd);
		return "blogpage";
	}*/
	

@RequestMapping(value="addComment",method=RequestMethod.POST)
public String toAddItDb(@ModelAttribute("cmt")Cmd cmt,@RequestParam int id,Model m)
{
	cmt.setCreationDate(new Date());;
	commentService.insertRow(cmt);
	/*List<BlogComment> bloLt=blogCommentService.getList();
	m.addAttribute("blog", bloLt);*/
	
	Blog blo=blogService.getRowById(id);
	m.addAttribute("b", blo);
	List<Cmd> cmtLt=commentService.getList();
	List<Cmd> cmtNeed=new ArrayList<Cmd>();
	for(Cmd ccmt:cmtLt)
	{
		if(ccmt.getBlogid()==id)
		{
			cmtNeed.add(ccmt);
		}
	}
	/*String str=gson.toJson(cmtNeed);*/
	m.addAttribute("cmts", cmtNeed);
	return "blogpage";
}}