package com.graphQL.graphQL_Springboot;

import com.graphQL.graphQL_Springboot.entities.Book;
import com.graphQL.graphQL_Springboot.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphQlSpringbootApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphQlSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	Book b1 = new Book();
	b1.setTitle("My book");
	b1.setDesc("new book");
	b1.setAuthor("Alisha");
	b1.setPages(100);
	b1.setPrice(100);

		Book b2 = new Book();
		b2.setTitle("My book1");
		b2.setDesc("new book1");
		b2.setAuthor("Alisha1");
		b2.setPages(200);
		b2.setPrice(200);

		Book b3 = new Book();
		b3.setTitle("My book2");
		b3.setDesc("new book2");
		b3.setAuthor("Alisha2");
		b3.setPages(300);
		b3.setPrice(300);

		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);
	}
}
