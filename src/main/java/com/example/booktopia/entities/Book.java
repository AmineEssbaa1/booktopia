package com.example.booktopia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.ToString;

import java.util.Date;

@ToString
@Entity
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBook ;
    private String title;
    private String isbn;
    private String publisher;

    private String designationBook;

    private String author;
    private Date datePublishing;
    private String review;

    public Book() {
        super();
    }

    public Book(Long idBook, String title, String isbn, String publisher, String designationBook, String author, Date datePublishing, String review) {
        this.idBook = idBook;
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.designationBook = designationBook;
        this.author = author;
        this.datePublishing = datePublishing;
        this.review = review;
    }

    public Long getIdBook() {
        return idBook;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDesignationBook() {
        return designationBook;
    }

    public String getAuthor() {
        return author;
    }

    public Date getDatePublishing() {
        return datePublishing;
    }

    public String getReview() {
        return review;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setDesignationBook(String designationBook) {
        this.designationBook = designationBook;
    }

    public void setAuthor(String author) {this.author = author;}

    public void setDatePublishing(Date datePublishing) {
        this.datePublishing = datePublishing;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                ", designationBook='" + designationBook + '\'' +
                ", author='" + author + '\'' +
                ", datePublishing=" + datePublishing +
                ", review='" + review + '\'' +
                '}';
    }
}

