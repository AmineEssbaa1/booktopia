package com.example.booktopia.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBook;
    // @NotNull
    // @Size(min = 3, max = 12)
    private String title;
    private String ISBN;
    private String publisher;

    private String designationBook;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datePublishing;
    @ManyToOne
    private Category category;
    // @PastOrPresent
    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", publisher='" + publisher + '\'' +
                ", designationBook='" + designationBook + '\'' +
                ", datePublishing=" + datePublishing +
                '}';
    }

    public Book() {
        super();
    }

    public Book(Long idBook, String title, String ISBN, String publisher, String designationBook, Date datePublishing) {
        this.idBook = idBook;
        this.title = title;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.designationBook = designationBook;
        this.datePublishing = datePublishing;
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDesignationBook() {
        return designationBook;
    }

    public void setDesignationBook(String designationBook) {
        this.designationBook = designationBook;
    }

    public Date getDatePublishing() {
        return datePublishing;
    }

    public void setDatePublishing(Date datePublishing) {
        this.datePublishing = datePublishing;
    }
}