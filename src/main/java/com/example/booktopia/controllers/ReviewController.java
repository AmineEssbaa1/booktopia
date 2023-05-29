package com.example.booktopia.controllers;

import com.example.booktopia.entities.Book;
import com.example.booktopia.entities.Review;
import com.example.booktopia.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @RequestMapping("/createReview")
    public String createReview() {
        return "CreateReview";
    }
@RequestMapping("/deleteReview")
public String deleteReview(@RequestParam("id") Long id, ModelMap modelMap,
                           @RequestParam(name = "page",defaultValue = "0")  int page,
                           @RequestParam(name = "size",defaultValue = "2")int size
){
        reviewService.deleteReviewById(id);
    Page<Review> booksController = reviewService.getAllReviewsByPage(page,size);
    modelMap.addAttribute("reviewsJsp", booksController);
    modelMap.addAttribute("pages",new int[booksController.getTotalPages()]);
    modelMap.addAttribute("currentPage",page);
        return "ReviewsList";
}
@RequestMapping("/showReview")
public String showReview(@RequestParam("id") Long id , ModelMap modelMap){
        Review reviewController  = reviewService.getReview(id);
        modelMap.addAttribute("reviewsJsp",reviewController);
        return "EditReview";
}
    @RequestMapping("/saveReview")
    public String saveReview(@ModelAttribute("review") Review review){
        Review memo = reviewService.saveReview(review);
        return "CreateReview";
    }
    @RequestMapping("/updateReview")
    public String updateReview(
            @ModelAttribute("review") Review review) {
            reviewService.saveReview(review);
                return "CreateReview";
    }



    @RequestMapping("/reviewsList")
    public String reviewsList(ModelMap modelMap,
                              @RequestParam(name = "page",defaultValue = "0")  int page,
                              @RequestParam(name = "size",defaultValue = "2")int size
    ) {
        Page<Review> booksController = reviewService.getAllReviewsByPage(page,size);
        modelMap.addAttribute("reviewsJsp", booksController);
        modelMap.addAttribute("pages",new int[booksController.getTotalPages()]);
        modelMap.addAttribute("currentPage",page);

        return "ReviewsList";
    }
}
