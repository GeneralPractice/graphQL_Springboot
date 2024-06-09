package com.graphQL.graphQL_Springboot.services.impl;

import com.graphQL.graphQL_Springboot.entities.Book;
import com.graphQL.graphQL_Springboot.repositories.BookRep;
import com.graphQL.graphQL_Springboot.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRep bookRep;

    @Autowired
    public BookServiceImpl(BookRep bookRep) {
        this.bookRep = bookRep;
    }

    @Override
    public Book create(Book book) {;
        return this.bookRep.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRep.findAll();
    }

    @Override
    public Book get(int bookId) {
        return this.bookRep.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));
    }
}
