package com.graphQL.graphQL_Springboot.controllers;

import com.graphQL.graphQL_Springboot.entities.Book;
import com.graphQL.graphQL_Springboot.services.BookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

    @Autowired
 private BookService bookService;

    //create
    @MutationMapping(name = "createBook")
    public Book create(@Argument BookInput book) {
    Book b = new Book();
    b.setTitle(book.getTitle());
    b.setDesc(book.getDesc());
    b.setPrice(book.getPrice());
    b.setAuthor(book.getAuthor());
    b.setPages(book.getPages());
    return this.bookService.create(b);
    }

    //getAll
@QueryMapping("allBooks")
    public List<Book> getAll(){
        return this.bookService.getAll();
    }


    //get single
    @QueryMapping("getBook")
    public Book get(@Argument int bookId){
    return this.bookService.get(bookId);
    }
}

@Getter
@Setter
class BookInput {
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;
}
