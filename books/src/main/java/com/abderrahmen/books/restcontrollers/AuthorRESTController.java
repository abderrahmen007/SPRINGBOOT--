package com.abderrahmen.books.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.abderrahmen.books.entities.Author;
import com.abderrahmen.books.repos.AuthorRepository;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthorRESTController {
@Autowired
AuthorRepository authorRepository;
@RequestMapping(method=RequestMethod.GET)
public List<Author> getAllAuthors()
{
return authorRepository.findAll();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Author getAuthorById(@PathVariable("id") Long id) {
return authorRepository.findById(id).get();
}
}


