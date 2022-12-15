package com.abderrahmen.books.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.abderrahmen.books.entities.Author;

@RepositoryRestResource(path = "auth")

@CrossOrigin(origins="http://localhost:4200/") //pour angular
	
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
