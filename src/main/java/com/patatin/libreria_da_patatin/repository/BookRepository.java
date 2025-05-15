package com.patatin.libreria_da_patatin.repository;

import com.patatin.libreria_da_patatin.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    List<Book> findAll();
}
