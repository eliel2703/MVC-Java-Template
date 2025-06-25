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
        Book livro1 = new Book("Pequeno Principe", "Antoine de Saint-Exupéry", 
                             96, BookCategory.LITERATURE, LocalDate.now().minusDays(10));
        Book livro2 = new Book("Clean Code", "Robert C. Martin", 
                             464, BookCategory.TECHNOLOGY, LocalDate.now().minusMonths(1));
        Book livro3 = new Book(null, null, null, null, null); // Livro com valores nulos para teste

        BookView view = new BookView();
        BookController controller = new BookController(livro1, view);
        
        System.out.println("Livro Inicial");
        controller.updateView();
        
        System.out.println("Alterar dados");
        controller.setBookTitle("O Pequeno Príncipe");
        controller.setBookAuthor("Antoine de Saint-Exupéry");
        controller.setBookCategory(BookCategory.HISTORY);
        controller.setBookPages(100);
        controller.addExtraPages(5);
        controller.setRegistrationDate(LocalDate.now());
        
        System.out.println("Livro atualizado");
        controller.updateView();

        System.out.println("Livros");
        List<Book> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
        
        Librarian bibliotecario = new Librarian("Eliel Rodrigo", livros);
        bibliotecario.listBooks();
    }
}
