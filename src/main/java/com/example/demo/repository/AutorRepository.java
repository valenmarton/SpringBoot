package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Autor;

public interface AutorRepository extends CrudRepository<Autor, Long> {
	List<Autor> findAll();
}
