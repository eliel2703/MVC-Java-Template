package com.exemplo.mvc.view;

import com.exemplo.mvc.model.Book;
import java.util.List;

public class BookView {
    public void printBookDetails(Book bookModel) {
        try {
            System.out.println("\n--- DETALHES DO LIVRO ---");
            System.out.println("Title: " + (bookModel.getTitle() != null ? bookModel.getTitle() : "[não informado]"));
            System.out.println("Author: " + (bookModel.getAuthor() != null ? bookModel.getAuthor() : "[não informado]"));
            System.out.println("Pages: " + (bookModel.getPages() != null ? bookModel.getPages() : "[não informado]"));
            System.out.println("Category: " + (bookModel.getCategory() != null ? bookModel.getCategory() : "[não informado]"));
            System.out.println("Data de Registro: " + (bookModel.getRegistrationDate() != null ? bookModel.getRegistrationDate() : "[não informado]"));
        } catch (Exception e) {
            System.err.println("Erro ao exibir detalhes do livro: " + e.getMessage());
        }
    }

    public void listBooks(List<Book> books) {
        try {
            if (books == null) {
                System.out.println("A lista de livros está nula.");
                return;
            }
            
            if (books.isEmpty()) {
                System.out.println("Nenhum livro encontrado.");
                return;
            }
            
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                if (book == null) {
                    System.out.println((i + 1) + ". [Livro nulo]");
                    continue;
                }
                
                String title = book.getTitle() != null ? book.getTitle() : "[sem título]";
                String author = book.getAuthor() != null ? book.getAuthor() : "[autor desconhecido]";
                System.out.println((i + 1) + ". " + title + " (" + author + ")");
            }
        } catch (Exception e) {
            System.err.println("Erro ao listar livros: " + e.getMessage());
        }
    }
}
