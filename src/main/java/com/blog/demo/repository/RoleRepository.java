package com.blog.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blog.demo.model.Role;
@Repository
public interface  RoleRepository extends CrudRepository<Role,Long> {

}
