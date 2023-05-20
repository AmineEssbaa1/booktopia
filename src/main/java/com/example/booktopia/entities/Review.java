package com.example.booktopia.entities;

import jakarta.persistence.*;
import org.hibernate.sql.Template;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReview;

    private int rating;

    private String reviewComments;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateCreate;

    @Override
    public String toString() {
        return "Review{" +
                "idReview=" + idReview +
                ", rating=" + rating +
                ", reviewComments='" + reviewComments + '\'' +
                ", dateCreate=" + dateCreate +
                '}';
    }

    public Review() {
        super();
    }

    public Review(Long idReview, int rating, String reviewComments, Date dateCreate) {
        this.idReview = idReview;
        this.rating = rating;
        this.reviewComments = reviewComments;
        this.dateCreate = dateCreate;
    }

    public Long getIdReview() {
        return idReview;
    }

    public void setIdReview(Long idReview) {
        this.idReview = idReview;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReviewComments() {
        return reviewComments;
    }

    public void setReviewComments(String reviewComments) {
        this.reviewComments = reviewComments;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }
}
