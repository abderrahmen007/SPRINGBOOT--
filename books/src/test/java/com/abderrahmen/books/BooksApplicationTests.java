package com.abderrahmen.books;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.abderrahmen.books.entities.Author;
import com.abderrahmen.books.entities.Book;
import com.abderrahmen.books.repos.BookRepository;

@SpringBootTest
	class BooksApplicationTests {
	@Autowired
	private BookRepository BookRepository;
	@Test
	public void testCreateBook() {
		Book book = new Book("The Metamorphosis" ,"Absurd Fiction",85.5);
		BookRepository.save(book);
	}
	@Test
	public void testFindBook()
	{
	Book p = BookRepository.findById(3L).get();

	System.out.println(p);
	}
	@Test
	public void testUpdateBook()
	{
	Book p = BookRepository.findById(3L).get();
	p.setPrix(30.0);
	BookRepository.save(p);
	}
	@Test
	public void testDeleteBook()
	{
	BookRepository.deleteById(3L);;
	}
	@Test
	public void testListerTousBooks()
	{
	List<Book> books = BookRepository.findAll();
	for (Book b : books)
	{
	System.out.println(b);
	}
	}
	
	@Test
	public void testFindByBookName()
	{
	List<Book> book = BookRepository.findByBookName("Al Yater");

	for (Book b : book)
	{
	System.out.println(b);
	}

	}
	@Test
	public void testFindByBookNameContains ()
	{
	List<Book> book=BookRepository.findByBookNameContains("The ");

	for (Book b : book)
	{
	System.out.println(b);
	} 
	}
	@Test
	public void testfindByNomPrix()
	{
	List<Book> books = BookRepository.findByNomPrix("The Alchemist", 50.0);
	for (Book p : books)
	{
	System.out.println(p);
	}

	}
	@Test
	public void testfindByAuthor()
	{
	Author auth = new Author();
	auth.setIdAuthor(1L);
	List<Book> books = BookRepository.findByAuthor(auth);
	for (Book b : books)
	{
	System.out.println(b);
	}
	}
	
	@Test
	public void findByAuthorIdAuthor()
	{
	List<Book> books = BookRepository.findByAuthorIdAuthor(1L);
	for (Book b : books)
	{
	System.out.println(b);
	}
	}
	
	@Test
	public void testfindByOrderByBookNameAsc()
	{
	List<Book> books =BookRepository.findByOrderByBookNameAsc();
	for (Book b : books)
	{
	System.out.println(b);
	}

	}
	
	@Test
	public void testTrierBookNamePrix()
	{
	List<Book> book = BookRepository.trierBookNamePrix();
	for (Book b : book)
	{
	System.out.println(b);
	}

	}

}
