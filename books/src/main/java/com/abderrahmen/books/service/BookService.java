package com.abderrahmen.books.service;

import java.util.List;

import com.abderrahmen.books.entities.Author;
import com.abderrahmen.books.entities.Book;

public interface BookService {
	Book saveBook(Book b);
	Book updateBook(Book b);
	void deleteBook(Book b);
	void deleteBookById(Long id);
	Book getBook(Long id);
	List<Book> getAllBooks();
	List<Book> findByBookName(String BookName);
	List<Book> findByBookNameBookContains(String BookName);
	List<Book> findByBookNamePrix (String BookName, Double prix);
	List<Book> findByAuthor (Author author);
	List<Book> findByAuthorIdAuthor(Long id);
	List<Book> findByOrderByBookNameBookAsc();
	List<Book> trierBookNamePrix();
	}

