package com.patatin.libreria_da_patatin.repository;

import com.patatin.libreria_da_patatin.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

    @Query("SELECT b.autore, b.genere, b.lingua, b.etaConsigliata, COUNT(l) " +
            "FROM Book b " +
            "GROUP BY b.autore, b.genere, b.lingua, b.etaConsigliata " +
            "HAVING COUNT(l) > 1")
    List<Object[]> findGruppiDuplicati();

}
