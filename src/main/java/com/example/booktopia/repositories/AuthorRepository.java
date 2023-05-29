package com.example.booktopia.repositories;

import com.example.booktopia.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author,Long> {
    @Query("Select author from Author author where author.name like %?1 ")
    List<Author> findAllAuthorsByName(String name);

    @Query("Select author from Author author where author.name like %?1 and author.nationality like %?2 ")
    List<Author> findAllAuthorsByNameNationality(String name, String nationality);

//    @Query("Select author from Author author where author.name like %:name and author.nationality like %:nationality ")
//    List<Author> findAllAuthorsByNameNationality(@Param("name") String name, @Param("nationality") String nationality);

    @Query("select author from Author author order by author.name")
    List<Author> findAllAuthorsByNameSort();


}
