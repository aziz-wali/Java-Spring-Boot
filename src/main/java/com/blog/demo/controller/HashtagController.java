package com.blog.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.blog.demo.model.Post;
import com.blog.demo.repository.HashtagRepository;
import com.blog.demo.repository.PostRepo;



@Controller
public class HashtagController {
	@Autowired 
	HashtagRepository hrepo;
	
	@Autowired 
	PostRepo postRepo;
	
	@RequestMapping("hashtag")
	public String showPostByHashtag(Model model,String name) {
		
		
		List <Post>  posts= postRepo.findPostByHashtagName(name);
		model.addAttribute("name", name);
		model.addAttribute("posts",posts);
		
		return "hashtag/showPostByHashtag.jsp";
	}

}
