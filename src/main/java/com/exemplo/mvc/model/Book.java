package com.exemplo.mvc.model;

import java.time.LocalDate;

public class Book extends Publication{
    private String author;
    private Integer pages;
    private BookCategory category;
    private LocalDate registrationDate;
        
        public Book(String title, String author, Integer pages, BookCategory category, LocalDate registrationDate) {
            this.title = title;
            this.author = author;
            this.pages = pages;
            this.category = category;
            this.registrationDate = registrationDate;
        }
    
        // Getters e Setters
        public String getAuthor() { return author; }
        public void setAuthor(String author) { this.author = author; }
        public Integer getPages() { return pages; }
        public void setPages(Integer pages) { this.pages = pages; }
        public BookCategory getCategory() { return category; }
        public void incrementPages(int extra){}
        public void setCategory(BookCategory category) { this.category = category; }
        public LocalDate getRegistrationDate() { return registrationDate; }
        public void setRegistrationDate(LocalDate registrationDate) { this.registrationDate = registrationDate; }
}