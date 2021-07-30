package com.blog.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.blog.demo.model.Hashtag;
import com.blog.demo.repository.HashtagRepository;
import com.blog.demo.model.Category;
import com.blog.demo.repository.CategoryRepository;
import com.blog.demo.model.Post;
import com.blog.demo.repository.PostRepo;
import com.blog.demo.service.PostService;


@Controller
public class PostController {
	@Autowired
	PostRepo repo;
	
	@Autowired
	HashtagRepository hrepo; 
	
	@Autowired
	private PostService postService;

	@Autowired
	private CategoryRepository categoryRepository;
	
	@RequestMapping("/addPost")
	public String addPost(Model model) {
		
		List<Category>categories=categoryRepository.findAll();
		System.out.print(categories);
		model.addAttribute("categories", categories);
		return "post/addPost.jsp";
	}
	
	
	@RequestMapping("/save")
	public String savePost(
			Post post,
			@RequestParam("file") MultipartFile file,
			@RequestParam("hashtag") String hash)
	{
			
		try {
			post.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		post.setDate(java.sql.Date.valueOf(java.time.LocalDate.now()));
		
		String[] s=null; 
		s=hash.split(",");
		for(int i=0;i<s.length;i++) {
		Hashtag h= new Hashtag(s[i]);
		hrepo.save(h);
		post.addHashtag(h);
		}
		repo.save(post);
		System.out.println("post success ");
		return "post/posts.jsp";
		
	}
	
	
	@RequestMapping("/editPost")
	public ModelAndView editPost( Long pid) {
		
		ModelAndView mv = new ModelAndView("post/editPost.jsp");
    	Post post=repo.findById(pid).orElse(new Post());
    	mv.addObject(post);
    	return mv;
	}
	
	
	@RequestMapping("/update")
	public String updatePost(@RequestParam("id") Long pid,
		@RequestParam("file") MultipartFile file,
		@RequestParam("pcontent") String content,
		@RequestParam("category") String category,
		@RequestParam("ptitle") String title,
		@RequestParam("tag") String tag) {
		
		postService.updatePost(pid,file, content, category, title, tag);
		System.out.println("post success ");
		return "Home.jsp";
		
	}
	
	
	 @RequestMapping("/post")
	 public ModelAndView post(Long pid) {
		 
		ModelAndView mv = new ModelAndView("post/post.jsp");
    	Post post=repo.findById(pid).orElse(new Post());
    	mv.addObject("post",post);
    	return mv;
		
	   }
	 

     @RequestMapping(path="/posts",produces= {"application/json"})
	public ModelAndView posts(){
	    	
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("post/posts.jsp");
    	ArrayList<Post>post =(ArrayList<Post>) repo.findAll();
    	mv.addObject("posts",post);
    	return mv;
	    	
	    }
	 
	 
	 @RequestMapping("/deletePost")
     public String deletePost(@RequestParam("pid") Long pid) {
		 
    	repo.deleteById(pid);
    	return "redirect:posts";
	    	
	 }
	
}
