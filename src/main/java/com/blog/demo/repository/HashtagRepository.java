package com.blog.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blog.demo.model.Hashtag;
@Repository
public interface HashtagRepository extends CrudRepository<Hashtag,Long>{



}
