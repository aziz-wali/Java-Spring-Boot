package com.blog.demo.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.blog.demo.dao.AutorRepo;
import com.blog.demo.post.Post;
import com.blog.demo.post.PostRepo;
import com.blog.demo.security.MyUserDetailsService;
import com.blog.demo.security.User;
import com.blog.demo.security.UserRepository;

@Controller
public class HomeController {
	@Autowired
	AutorRepo repo;
	
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	MyUserDetailsService m;
	
	@Autowired
	PostRepo postRepo;
	
	
    @RequestMapping("/")
	public ModelAndView index(HttpSession session) {
    	Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("post/posts.jsp");
		User user=userRepo.findByUsername(authentication.getName());
		if(user!=null) {
		mv.addObject("user",user);
		session.setAttribute("id", user.getId());
		session.setAttribute("username", user.getUsername());
		session.setAttribute("lastname", user.getLast_name());
		session.setAttribute("image", user.getImage());
    }
		ArrayList<Post>post =(ArrayList<Post>) postRepo.findAll();
    	mv.addObject("posts",post);
		return mv;
	}
    
    
    
    
    @RequestMapping("/addAutor")
    public String addAutor(Autor autor) {
    	repo.save(autor);
    	return "add.jsp";
    }
    
    @RequestMapping("/getAutor")
    public ModelAndView getAutor(int id) {
    	
    	
    	ModelAndView mv = new ModelAndView("ShowAllAutors.jsp");
    	Autor autor=repo.findById(id).orElse(new Autor());
    	//System.out.print(repo.findByVorname("aaa"));
    	mv.addObject(autor);
    	
    	System.out.print(id);
    	return mv;
    	
    	
    }
    @RequestMapping(path="/getAll",produces= {"application/json"})
    public ModelAndView getAll() {
    	
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("home/Home.jsp");
    	List<Autor> autor=(List<Autor>) repo.findAll();
    	mv.addObject("hi",autor);
    	for(Autor x:autor)
    		System.out.println(x.getVorname());
    	return mv;
    }
    
	
    @RequestMapping("/getUser")
    public ModelAndView getUser(Long id) {
    	
    	ModelAndView mv = new ModelAndView("editUser.jsp");
    	User user=userRepo.findById(id).orElse(new User());
    	mv.addObject("user",user);
    	return mv;
    	
    }
    
    @RequestMapping("/updateUser")
	public String updatePost(@RequestParam("id") Long id,
			@RequestParam("file") MultipartFile file,
    		@RequestParam("username") String username,
    		@RequestParam("first_name") String first_name,
    		@RequestParam("last_name") String last_name
    	) {
		
		m.updateUser(id,file, username, first_name, last_name);
		System.out.println("user success ");
		return "redirect:posts";
		
	}
    
    @RequestMapping("/user")
    public ModelAndView user( @RequestParam("id")Long id) {
    	List<Post> posts= postRepo.findPostByUserId(id);
    	ModelAndView mv= new ModelAndView();
    	mv.setViewName("user/showPostByUserId.jsp");
    	System.out.println(posts);
    	mv.addObject("posts", posts);
    	return mv;
    }
}
