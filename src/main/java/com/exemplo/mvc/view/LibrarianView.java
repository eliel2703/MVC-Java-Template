package com.exemplo.mvc.view;

import com.exemplo.mvc.model.Book;

public class LibrarianView {
    public void printBookDetails(Book bookModel) {
        System.out.println("\n--- DETALHES DOS LIVROS---");
        System.out.println("Title: " + bookModel.getTitle());
        System.out.println("Author: " + bookModel.getauthor());
        System.out.println("Pages: " + bookModel.getpages());
        System.out.println("Category " + bookModel.getCategory());
        System.out.println("Data de Registro " + bookModel.getRegistrationDate());

        try {
            
        } catch (Exception e) {
            
        }
}

}