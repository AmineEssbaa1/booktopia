package com.example.booktopia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBook ;
    private String designationBook;
    private String Author;

    private String  Review;

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", designationBook='" + designationBook + '\'' +
                ", Author='" + Author + '\'' +
                ", Review='" + Review + '\'' +
                '}';
    }

    public Book() {
        super();
    }

    public Book(String designationBook, String author, String review) {
        this.designationBook = designationBook;
        Author = author;
        Review = review;
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public String getDesignationBook() {
        return designationBook;
    }

    public void setDesignationBook(String designationBook) {
        this.designationBook = designationBook;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getReview() {
        return Review;
    }

    public void setReview(String review) {
        Review = review;
    }
}
