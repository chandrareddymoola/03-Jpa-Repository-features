package com.chandra.service;

import com.chandra.entities.Book;
import com.chandra.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BookService {
@Autowired
    private BookRepo bookRepo;

    public void saveBook(){
//        Book entity = new Book(201,"success",500);
//        Book entity1 = new Book(301,"win or lose",1000);
//        Book entity2 = new Book(401,"acret",1500);
     //   bookRepo.saveAll(Arrays.asList(entity,entity1,entity2));
        Book entity=new Book();
//	entity.setBookId(100);
	entity.setBookName("oppsss");
	entity.setBookPrice(100.00);


	Book entity1=new Book();
//		entity1.setBookId(101);
		entity1.setBookName("python");
		entity1.setBookPrice(200.00);

		Book entity2=new Book();
//		entity2.setBookId(105);
		entity2.setBookName("devops");
		entity2.setBookPrice(500.00);
        bookRepo.saveAll(Arrays.asList(entity,entity1,entity2));

    }

}


