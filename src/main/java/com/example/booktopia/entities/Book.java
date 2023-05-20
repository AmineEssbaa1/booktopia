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
    private String ISBN;
    private String publisher;

    private String designationBook;

    private String Author;
    private Date datePulishing;
    private String  Review;

    public Book() {
        super();
    }

    public Book(Long idBook, String title, String ISBN, String publisher, String designationBook, String author, Date datePulishing, String review) {
        this.idBook = idBook;
        this.title = title;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.designationBook = designationBook;
        Author = author;
        this.datePulishing = datePulishing;
        Review = review;
    }

    public Long getIdBook() {
        return idBook;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDesignationBook() {
        return designationBook;
    }

    public String getAuthor() {
        return Author;
    }

    public Date getDatePulishing() {
        return datePulishing;
    }

    public String getReview() {
        return Review;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setDesignationBook(String designationBook) {
        this.designationBook = designationBook;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setDatePulishing(Date datePulishing) {
        this.datePulishing = datePulishing;
    }

    public void setReview(String review) {
        Review = review;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", publisher='" + publisher + '\'' +
                ", designationBook='" + designationBook + '\'' +
                ", Author='" + Author + '\'' +
                ", datePulishing=" + datePulishing +
                ", Review='" + Review + '\'' +
                '}';
    }
}

