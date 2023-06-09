package com.example.booktopia.services;

import com.example.booktopia.entities.Author;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {

        Author saveAuthor(Author author);
        Author updateAuthor(Author author);
        Author getAuthor(Long id);
        List<Author> getAllAuthors();
        void deleteAuthorById(Long id);
        void deleteAllAuthors();
        List<Author> findAllAuthorsByNameSort();

        Page<Author> getAllAuthorsByPage(int page,int size);
}

