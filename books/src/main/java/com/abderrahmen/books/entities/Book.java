package com.abderrahmen.books.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBook ;
	private String bookName; 
	private	String genre ;
	private double prix ;
	
	
	

	@JsonIgnore
	public Book() {
		super();
	}
	
	public Book(String bookName, String genre, double prix ) {
		super();
		this.bookName = bookName;
		this.genre = genre;
		this.prix = prix;
		
	}
	
	public Long getIdBook() {
		return idBook;
	}

	public void setIdBook(Long idBook) {
		this.idBook = idBook;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", BookName=" + bookName + ", genre=" + genre + ", prix="+ prix +"]";
	}
	
	@ManyToOne
	private Author author;
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author=author;
		
	}
	
}
