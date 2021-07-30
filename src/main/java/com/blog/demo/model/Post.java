package com.blog.demo.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="post")

public class Post {
   
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long pid;
 	
	
	private String ptitle,pcontent,image;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="category_cid")
	private Category category;
	
	@ManyToMany
	@JoinTable(name="post_hashtag",joinColumns=@JoinColumn(name="post_id"), 
	inverseJoinColumns = @JoinColumn(name = "hashtag_id"))
	private Set<Hashtag> hashtags =new HashSet<>();
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	
	public String getPtitle() {
		return ptitle;
	}
	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}
	public String getPcontent() {
		return pcontent;
	}
	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public void addHashtag(Hashtag hashtag) {
		hashtags.add(hashtag);
	}
	
	public Set<Hashtag> getHashtags() {
		return hashtags;
	}
	public void setHashtags(Set<Hashtag> hashtags) {
		this.hashtags = hashtags;
	}
	@Override
	public String toString() {
		return "Post [pid=" + pid +  ", ptitle=" + ptitle + ", pcontent=" + pcontent + ", image="
				+ image + ", date=" + date +  "]";
	}
}
