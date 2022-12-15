package com.abderrahmen.books.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.abderrahmen.books.entities.Author;
import com.abderrahmen.books.entities.Book;

	public interface BookRepository extends JpaRepository<Book, Long> {
		List<Book> findByBookName(String nom);
		List<Book> findByBookNameContains(String nom);
		@Query("select b from Book b where b.bookName like %?1 and b.prix > ?2")
		List<Book> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
		@Query("select b from Book b where b.author = ?1")
		List<Book> findByAuthor (Author author);
		List<Book> findByAuthorIdAuthor(Long id);
		List<Book> findByOrderByBookNameAsc();
		@Query("select b from Book b order by b.bookName ASC, b.prix DESC")
		List<Book> trierBookNamePrix ();
}
