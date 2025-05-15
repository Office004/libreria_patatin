package com.patatin.libreria_da_patatin.model;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String Author;
    @Column(name = "genre")
    private String Genre;
    @Column(name = "language")
    private String language;
    @Column(name = "number_paige")
    private int numberPaige;
    @Column(name = "age")
    private int age;

    public Book(Long id, int age, int numberPaige, String language, String genre, String author, String title) {
        this.id = id;
        this.age = age;
        this.numberPaige = numberPaige;
        this.language = language;
        Genre = genre;
        Author = author;
        this.title = title;
    }
    public Book(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumberPaige() {
        return numberPaige;
    }

    public void setNumberPaige(int numberPaige) {
        this.numberPaige = numberPaige;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
