package com.blog.demo.service;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import com.blog.demo.model.Post;
import com.blog.demo.model.User;
import com.blog.demo.repository.CategoryRepository;
import com.blog.demo.repository.PostRepo;

@Service
public class PostService {
	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public String  savePostToDB(MultipartFile file)
	{
		//,String content,Category category
//		,String ptitle,String tag
		User user=new User();
		Post p = new Post();
		
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if(fileName.contains(".."))
		{
			System.out.println("not a a valid file");
		}
		try {
			p.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
        p.setDate(java.sql.Date.valueOf(java.time.LocalDate.now()));
        return p.getImage();
	}

	
	public void  updatePost(Long id,MultipartFile file,String content,String category
			,String ptitle,String tag)
	{
		Post p = new Post();
		p = postRepo.findById(id).get();
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if(fileName.contains(".."))
		{
			System.out.println("not a a valid file");
		}
		try {
			p.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
    	
		p.setPcontent(content);
        //p.setCategory(category);
        p.setPtitle(ptitle);
        
        
        postRepo.save(p);
	}

	
	
}
