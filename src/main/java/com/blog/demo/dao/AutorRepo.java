package com.blog.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.blog.demo.controller.Autor;
import java.util.List;
import java.util.Optional;

public interface AutorRepo extends CrudRepository<Autor,Integer> {

	
	List<Autor> findByVorname(String vorname);

	public Optional<Autor> findById(int id);
}
