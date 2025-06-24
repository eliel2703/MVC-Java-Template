package com.exemplo.mvc;

import java.time.LocalDate;

import com.exemplo.mvc.controller.BookController;
import com.exemplo.mvc.model.Book;
import com.exemplo.mvc.model.BookCategory;
import com.exemplo.mvc.view.BookView;

public class MCVPatternBook {
    public static void main(String[] args) {
        // Inicialização dos componentes
        Book model = new Book(null, null, null, null, null);
        BookView view = new BookView();
        BookController controller = new BookController(model, view);
        
        // Exemplo de fluxo
        controller.setBookTitle("Pequeno Principe");
        controller.setBookAuthor("Ana Silva");
        controller.setBookCategory(BookCategory.HISTORY);
        controller.setBookPages(10);
        controller.addExtraPages(2);
        controller.registrationDate(LocalDate.now());
        controller.updateView();
    }
}