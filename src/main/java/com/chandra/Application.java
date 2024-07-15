package com.chandra;

import com.chandra.entities.Book;
import com.chandra.repository.BookRepo;
import com.chandra.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application {


	public static void main(String[] args) {
		ConfigurableApplicationContext cntxt= SpringApplication.run(Application.class, args);
	BookService bookService=cntxt.getBean(BookService.class);
	bookService.saveBook();

	}
}
