package com.abderrahmen.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abderrahmen.books.entities.Author;
import com.abderrahmen.books.entities.Book;
import com.abderrahmen.books.repos.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	
	BookRepository bookRepository ;
	@Override
	public Book saveBook(Book b) {
		return bookRepository.save(b);
	}

	@Override
	public Book updateBook(Book b) {
		return bookRepository.save(b);
	}

	@Override
	public void deleteBook(Book b) {
		 bookRepository.delete(b);
		
	}

	@Override
	public void deleteBookById(Long id) {
		 bookRepository.deleteById(id);
	}

	@Override
	public Book getBook(Long id) {
		
		return  bookRepository.findById(id).get();
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
		
	@Override
	public List<Book> findByBookName(String nom) {
	return bookRepository.findByBookName(nom);
	}
	
	@Override
	public List<Book> findByBookNameBookContains(String nom) {
	return bookRepository.findByBookNameContains(nom);
	}
	
	@Override
	public List<Book> findByBookNamePrix(String nom, Double prix)
	{return bookRepository.findByNomPrix(nom, prix);	}
	
	@Override
	public List<Book> findByAuthor(Author author) {
	return bookRepository.findByAuthor(author);
	}
	
	@Override
	public List<Book> findByAuthorIdAuthor(Long id) {
	return bookRepository.findByAuthorIdAuthor(id);
	}
	
	@Override
	public List<Book> findByOrderByBookNameBookAsc() {
	return bookRepository.findByOrderByBookNameAsc();
	}
	@Override
	public List<Book> trierBookNamePrix() {
	return bookRepository.trierBookNamePrix();
	}

}
