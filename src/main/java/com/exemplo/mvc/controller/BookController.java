package com.exemplo.mvc.controller;

import com.exemplo.mvc.view.BookView;

import java.time.LocalDate;

import com.exemplo.mvc.model.*;

public class BookController {
    private Book model;
    private BookView view;
    
    public BookController(Book model, BookView view) {
        this.model = model;
        this.view = view;
    }

    public void setBookTitle (String title){
        model.setTitle(title);
    }

    public void setBookAuthor (String author){
        model.setAuthor(author);
    }

    public void setBookPages(Integer pages){
        model.setPages(pages);
    }

    public void addExtraPages(int extra){
        model.incrementPages(extra);
    }

    public void setBookCategory(BookCategory cat){
        model.setCategory(cat);
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        model.setRegistrationDate(registrationDate);
      }

    public void addExtraPages(int extraPages) {
        if (model.getPages() != null) {
            model.setPages(model.getPages() + extraPages);
        } else {
            model.setPages(extraPages);
        }
    }

    public void updateView(){
        view.printBookDetails(model);
    }
    
}
