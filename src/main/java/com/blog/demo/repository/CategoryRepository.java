package com.blog.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.blog.demo.model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{

}
