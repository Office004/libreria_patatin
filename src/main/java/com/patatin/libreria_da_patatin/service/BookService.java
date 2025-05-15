package com.patatin.libreria_da_patatin.service;

import com.patatin.libreria_da_patatin.model.Book;
import com.patatin.libreria_da_patatin.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }


    public Book getId(Long id){
        return bookRepository.findById(id).orElse((null));
    }

    public boolean hasDuplicates() {
        return !bookRepository.findDuplicateGroups().isEmpty();
    }

    public List<Object[]> getDuplicatedGroups() {
        return bookRepository.findDuplicateGroups();
    }

}
