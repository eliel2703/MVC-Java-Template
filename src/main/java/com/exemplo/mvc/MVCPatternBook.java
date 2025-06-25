package com.exemplo.mvc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.exemplo.mvc.controller.BookController;
import com.exemplo.mvc.model.Book;
import com.exemplo.mvc.model.BookCategory;
import com.exemplo.mvc.model.Librarian;
import com.exemplo.mvc.view.BookView;

public class MVCPatternBook {
    public static void main(String[] args) {
        Book book1 = new Book("Mein Kepf", "Adolf Hitler", 
                             96, BookCategory.LITERATURE, LocalDate.now().minusDays(10));
        Book book2 = new Book("O diário", "Fernandao", 
                             464, BookCategory.TECHNOLOGY, LocalDate.now().minusMonths(1));
        Book book3 = new Book(null, null, null, null, null);

        BookView view = new BookView();
        BookController controller = new BookController(book1, view);
        
        System.out.println("Livro Inicial");
        controller.updateView();
        
        System.out.println("Alterar dados");
        controller.setBookTitle("O Pequeno Príncipe");
        controller.setBookAuthor("Odair");
        controller.setBookCategory(BookCategory.HISTORY);
        controller.setBookPages(100);
        controller.addExtraPages(5);
        controller.setRegistrationDate(LocalDate.now());
        
        System.out.println("Livro atualizado");
        controller.updateView();

        System.out.println("books");
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        
        Librarian librarian = new Librarian("Eliel", books);
        librarian.listBooks();
    }
}
