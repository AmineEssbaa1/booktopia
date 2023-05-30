package com.example.booktopia.services;

import com.example.booktopia.entities.Review;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewService {
    Review saveReview(Review review);
    Review updateReview(Review review);
    Review getReview(Long id);

    List<Review> getAllReviews();
    void deleteReviewById(Long id);
    void deleteAllReviews();
    Page<Review> getAllReviewsByPage(int page, int size);

}