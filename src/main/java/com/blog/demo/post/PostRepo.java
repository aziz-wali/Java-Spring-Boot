package com.blog.demo.post;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepo extends CrudRepository<Post,Long> {

	@Query(value="SELECT * FROM post p  inner Join post_hashtag ph on p.pid=ph.post_id inner join hashtag h on h.id=ph.hashtag_id where h.name=? ",nativeQuery = true)
	List<Post> findPostByHashtagName(String name);
	
	@Query(value="SELECT * FROM post p  inner Join category c on c.cid=p.category_cid where c.cid=? ",nativeQuery = true)
	List<Post> FindPostByCategoryId(Long id);
	
	@Query(value="SELECT * FROM post p inner join user u on u.id=p.user_id where p.user_id=? ",nativeQuery = true)
	List<Post> findPostByUserId(Long id);
}
