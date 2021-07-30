package com.blog.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.blog.demo.model.User;

public interface UserRepository extends CrudRepository<User,Long> {

	User findByUsername(String username);
}
