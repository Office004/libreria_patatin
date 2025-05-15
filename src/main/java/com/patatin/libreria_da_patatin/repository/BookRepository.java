package com.patatin.libreria_da_patatin.repository;

import com.patatin.libreria_da_patatin.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {
    @Query("SELECT b.author, b.genre, b.language, b.recommendedAge, COUNT(b) " +
            "FROM Book b " +
            "GROUP BY b.author, b.genre, b.language, b.recommendedAge " +
            "HAVING COUNT(b) > 1")
    List<Object[]> findDuplicateGroups();
}
