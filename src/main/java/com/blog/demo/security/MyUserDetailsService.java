package com.blog.demo.security;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.IOException;
import java.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.blog.demo.model.Role;
@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository repo;

	@Autowired
	private BCryptPasswordEncoder passwordencoder;

		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repo.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("User 404");
		}
		return new UserPrincipal(user);
		}
	
	
	public void  saveToDB(String username,String first_name,String last_name,String email,String password) {
		User u= new User();
		u.setUsername(username);
		u.setFirst_name(first_name);
		u.setLast_name(last_name);
		u.setEmail(email);
		u.setPassword(passwordencoder.encode(password));
		//System.out.println(passwordencoder.encode("aaa"));
		Role role= new Role(3);
		u.addRole(role);
		repo.save(u);
		System.out.println(password);
	}


	public void updateUser(Long id, MultipartFile file, String username, String first_name, String last_name) {
		User u = new User();
		u = repo.findById(id).get();
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if(fileName.contains(".."))
		{
			System.out.println("not a a valid file");
		}
		try {
			u.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		u.setUsername(username);
        u.setFirst_name(first_name);
        u.setLast_name(last_name);
    
        
        repo.save(u);
		
	}
	
	
}
