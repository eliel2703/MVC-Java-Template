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
        // Simulando dados vindo do "banco de dados"
        Book livro1 = new Book("Pequeno Principe", "Antoine de Saint-Exupéry", 
                             96, BookCategory.LITERATURE, LocalDate.now().minusDays(10));
        Book livro2 = new Book("Clean Code", "Robert C. Martin", 
                             464, BookCategory.TECHNOLOGY, LocalDate.now().minusMonths(1));
        Book livro3 = new Book(null, null, null, null, null); // Livro com valores nulos para teste

        // Inicialização dos componentes
        BookView view = new BookView();
        BookController controller = new BookController(livro1, view);
        
        System.out.println("=== LIVRO INICIAL ===");
        controller.updateView();
        
        // Alterando dados do livro
        System.out.println("\n=== ALTERANDO DADOS DO LIVRO ===");
        controller.setBookTitle("O Pequeno Príncipe");
        controller.setBookAuthor("Antoine de Saint-Exupéry (Tradução)");
        controller.setBookCategory(BookCategory.CLASSIC);
        controller.setBookPages(100);
        controller.addExtraPages(5);
        controller.setRegistrationDate(LocalDate.now());
        
        // Exibindo dados atualizados
        System.out.println("\n=== LIVRO ATUALIZADO ===");
        controller.updateView();
        
        // Testando com o livro3 (valores nulos)
        System.out.println("\n=== TESTE COM LIVRO NULO ===");
        controller.setBook(livro3);
        controller.updateView();
        
        // Trabalhando com a lista de livros
        System.out.println("\n=== LISTA DE LIVROS ===");
        List<Book> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
        livros.add(new Book("Domain-Driven Design", "Eric Evans", 
                          560, BookCategory.TECHNOLOGY, LocalDate.now().minusYears(2)));
        
        Librarian bibliotecario = new Librarian("João Silva", livros);
        bibliotecario.listBooks();
    }
}
