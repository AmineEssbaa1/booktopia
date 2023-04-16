package com.example.booktopia.services;

import com.example.booktopia.entities.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    Book saveBook(Book book);
    Book updateBook(Book book);
    Book getBook(Long id);

    List<Book> getAllBooks();
    void deleteBookById(Long id);
    void deleteAllBooks();

}
