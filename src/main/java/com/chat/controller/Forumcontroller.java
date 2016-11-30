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
import com.chat.model.Forum;
import com.chat.model.Reply;
/*import com.chat.model.Comment;*/
import com.chat.service.ForumService;
import com.chat.service.ReplyService;
/*import com.chat.service.CommentService;*/
import com.google.gson.Gson;


@Controller
public class Forumcontroller {

	public Forumcontroller() {
		System.out.println("forum controller");
	}

	@Autowired
	ForumService forumService;
	
	@Autowired
    ReplyService replyService;

	@RequestMapping(value="forum1",method=RequestMethod.POST)
	public ModelAndView blogg(@ModelAttribute("frum") Forum frum,Model m) {

		frum.setCreationDate(new Date());;
		forumService.insertRow(frum);
		List<Forum> forumLt=forumService.getList();
		
		Gson gson=new Gson();
		String st=gson.toJson(forumLt);
		m.addAttribute("selva",st);
		System.out.println("Json"+st);
		return new ModelAndView("forum");
	}
	
	
	/*@RequestMapping("/forumpage")
	public String forumpage(@ModelAttribute("frum") Forum frum,@RequestParam int id,Model m)
	{
		frum=forumService.getRowById(id);
		m.addAttribute("b" ,frum);
	
		return "forumpage";	
	}*/
	
	@RequestMapping("/forumpage")
	public String forumpage(@ModelAttribute("ans") Reply ans,@RequestParam int id,Model m)
	{
		Forum blo=forumService.getRowById(id);
		m.addAttribute("b" ,blo);
		//m.addAttribute("b", blo);
		List<Reply> cmtLt=replyService.getList();
		List<Reply> cmtNeed=new ArrayList<Reply>();
		for(Reply ccmt:cmtLt)
		{
			if(ccmt.getForumid()==id)
			{
				cmtNeed.add(ccmt);
			}
		}
		/*String str=gson.toJson(cmtNeed);*/
		m.addAttribute("cmts", cmtNeed);
		return "forumpage";	
	}
	
	@RequestMapping("/forumview")
	public String forumpag(@ModelAttribute("frum") Forum frum,Model m)
	{
		frum.setCreationDate(new Date());;
		forumService.insertRow(frum);
		List<Forum> forumLt=forumService.getList();
		
		Gson gson=new Gson();
		String st=gson.toJson(forumLt);
		m.addAttribute("selva",st);
		System.out.println("Json"+st);
		return "forumview";	
	}
	
	
/*	@RequestMapping(value="addcmd",method=RequestMethod.POST)
	public String addcmd(@ModelAttribute("cmd") Comment cmd,Model m)
	{
		commentService.insertRow(cmd);
		return "blogpage";
	}*/

	@RequestMapping(value="addReply",method=RequestMethod.POST)
	public String toAddItDb(@ModelAttribute("rep")Reply rep,@RequestParam int id,Model m)
	{
		rep.setCreationDate(new Date());;
		replyService.insertRow(rep);
		/*List<BlogComment> bloLt=blogCommentService.getList();
		m.addAttribute("blog", bloLt);*/
		
		Forum frum=forumService.getRowById(id);
		m.addAttribute("b", frum);
		List<Reply> cmtLt=replyService.getList();
		List<Reply> cmtNeed=new ArrayList<Reply>();
		for(Reply ccmt:cmtLt)
		{
			if(ccmt.getForumid()==id)
			{
				cmtNeed.add(ccmt);
			}
		}
		/*String str=gson.toJson(cmtNeed);*/
		m.addAttribute("cmts", cmtNeed);
		return "forumpage";
}
}

