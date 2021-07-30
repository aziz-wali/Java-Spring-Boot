package com.blog.demo.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Category {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Long cid;
	private String name;
	
	@OneToMany(targetEntity = Post.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="category_cid",referencedColumnName = "cid")
	private List<Post> posts;
	

	public Category(Long cid) {
		super();
		this.cid = cid;
	}

	public Category() {
		super();
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "Category [cid=" + cid + ", name=" + name + ", posts=" + posts + "]";
	}



}
