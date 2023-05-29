package com.example.booktopia;

import com.example.booktopia.entities.Author;
import com.example.booktopia.repositories.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class BooktopiaApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Autowired
	AuthorRepository authorRepository;

//	@Test //Succeed
//	public void TestCreateAuthor(){
//		Author author = new Author(56L,"Camus 1","Biography camus kjkjkjkjkjkj","Frane",new Date(), new Date());
//		authorRepository.save(author);
//	}

//	@Test //Succeed
//	public void TestUpdateAuthor(){
//		Author author = authorRepository.findById(4L).get();
//		author.setName("camus up2");
//		authorRepository.save(author);
//	}

//	@Test //Succeed
//	public void TestFindAuthorByID(){
//		Author author = authorRepository.findById(4L).get();
//		System.out.println(author);
//	}

//	@Test //Succeed
//	public void TestFindAllAuthors(){
//		List<Author> authors = authorRepository.findAll();
//	    authors.forEach(System.out::println);
//    }

//    @Test //Succeed
//    public void TestDeleteAuthorById(){
//        authorRepository.deleteById(13L);
//    }

//    @Test //Succeed
//    public void TestDeleteAllAuthors(){
//        authorRepository.deleteAll();
//    }

//    @Test //Succeed
//    public void TestFindAllAuthorByName(){
//        List<Author> authors = authorRepository.findAllAuthorsByName("%camus%");
//        authors.forEach(System.out::println);
//
//    }


//	@Test //Succeed
//	public void TestFindAllAuthorsByNameNationality(){
//		List<Author> authors = authorRepository.findAllAuthorsByNameNationality("%camus%","%france%");
//        authors.forEach(System.out::println);
//	}


	@Test //Succeed
	public void TestFindAllAuthorsByNameSort(){
		List<Author> authors = authorRepository.findAllAuthorsByNameSort();
		authors.forEach(System.out::println);
	}

}
