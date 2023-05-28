package com.example.booktopia.services;

import com.example.booktopia.entities.Review;
import com.example.booktopia.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public Review updateReview(Review review) {
        // Implement the logic for updating a review
        return null;
    }

    @Override
    public Review getReview(Long id) {
        // Implement the logic for retrieving a review by ID
        return null;
    }

    @Override
    public List<Review> getAllReviews() { return reviewRepository.findAll();}
    @Override
    public void deleteReviewById(Long id) {reviewRepository.deleteById(id);}

    @Override
    public void deleteAllReviews() {
        // Implement the logic for deleting all reviews
    }

    @Override
    public Page<Review> getAllReviewsByPage(int page, int size) {
        return reviewRepository.findAll(PageRequest.of(page, size));
    }
}
