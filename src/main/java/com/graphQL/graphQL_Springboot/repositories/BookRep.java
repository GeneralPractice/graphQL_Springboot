package com.graphQL.graphQL_Springboot.repositories;

import com.graphQL.graphQL_Springboot.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRep extends JpaRepository<Book, Integer>{
}
