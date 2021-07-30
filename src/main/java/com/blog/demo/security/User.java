package com.blog.demo.security;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import com.blog.demo.model.Role;
import com.blog.demo.post.Post;
import javax.persistence.JoinColumn;

@Entity
@Table(name =  "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User 
{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String username;
    private String first_name;
    private String last_name;
    @Column(unique = true)
    private String email;
	private String password;
	private String image;
	
	@OneToMany(targetEntity=Post.class,cascade=CascadeType.ALL)
	@JoinColumn(name="user_id",referencedColumnName="id")
	private List<Post> posts;
	
	
	@ManyToMany
	@JoinTable(name = "user_role", 
	joinColumns = @JoinColumn(name = "user_id"), 
	inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();
	
	public Set<Role> getRoles() {
		return roles;
	}


	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public void addRole(Role role) {
		roles.add(role);
	}
	
	public List<Post> getPosts() {
		return posts;
	}
	
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}


	public User(Long id) {
		super();
		this.id = id;
	}

	public User(String username) {
		super();
		this.username = username;
	}


	public User() {
		super();
		}

	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", password=" + password + ", image=" + image + ", posts=" + posts +  "]";
	}



	
	 
}