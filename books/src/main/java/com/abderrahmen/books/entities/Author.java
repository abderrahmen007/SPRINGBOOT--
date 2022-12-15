package com.abderrahmen.books.entities;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Author {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idAuthor;
private String AuthorName;
private String BirthDay;
private String Nationality; 

@OneToMany(mappedBy = "author")
@JsonIgnore
private List<Book>books;

public Long getIdAuthor() {
	return idAuthor;
}
public void setIdAuthor(Long idAuthor) {
	this.idAuthor=idAuthor;
	
}
public String getAuhtorName() {
	return AuthorName;
}

public void setAuthorName(String AuthorName) {
	this.AuthorName=AuthorName;
	
}
public String getBirthday() {
	return BirthDay;
}

public void setBirthday(String Birthday) {
	this.BirthDay=Birthday;
	
}

public String getNationality() {
	return Nationality;
}

public void setNationality(String Nationality) {
	this.Nationality=Nationality;
	
}

}