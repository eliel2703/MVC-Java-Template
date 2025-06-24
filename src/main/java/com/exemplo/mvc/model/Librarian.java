package com.exemplo.mvc.model;

import java.util.List;

public class Librarian {
    private String name;
    private List<Book> books;

     
    public Librarian(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public void listBooks(List<Book> books){
        for (int i = 0; i < books.size() ; i++) {
            System.out.println(books);
        }
    }

    // Getters e Setters
    public String getname() { return name; }
    public void setname(String name) { this.name = name; }
    public List<Book> getlocation() { return books; }
    public void setlocation(List<Book> books) { this.books = books; }
}
