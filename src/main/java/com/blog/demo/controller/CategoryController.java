package com.blog.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.blog.demo.model.Post;
import com.blog.demo.repository.PostRepo;


@Controller
public class CategoryController {
	
	
	@Autowired
	PostRepo postRepo;
	@RequestMapping("category")
	public String showPostByCategoryId(Model m, Long id) {
		List<Post> posts =postRepo.FindPostByCategoryId(id);
		m.addAttribute("posts", posts);
		return "category/showPostByCategoryName.jsp";
	}

}
