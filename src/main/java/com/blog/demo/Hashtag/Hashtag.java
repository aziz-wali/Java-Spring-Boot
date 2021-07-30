package com.blog.demo.Hashtag;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hashtag {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	
	

	public Hashtag(Long id) {
		super();
		this.id = id;
	}

	public Hashtag() {
		super();
	}

	public Long getHid() {
		return id;
	}

	public Hashtag(String name) {
		super();
		this.name = name;
	}

	public Hashtag(String[] split) {
		
	}

	public void setHid(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hashtag [id=" + id + ", name=" + name + "]";
	}



	



}
