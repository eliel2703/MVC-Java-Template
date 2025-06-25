package com.exemplo.mvc.view;

import com.exemplo.mvc.model.Book;
import java.util.List;

public class BookView {
    public void printBookDetails(Book bookModel) {
        try {
            System.out.println("\n--- DETALHES DO LIVRO ---");
            System.out.println("Title: " + bookModel.getTitle());
            System.out.println("Author: " + bookModel.getAuthor());
            System.out.println("Pages: " + bookModel.getPages());
            System.out.println("Category: " + bookModel.getCategory());
            System.out.println("Data de Registro: " + bookModel.getRegistrationDate());
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
            
            System.out.println("\n--- LISTA DE LIVROS ---");
            for (Book book : books) {
                System.out.println("Título: " + book.getTitle());
                System.out.println("Autor: " + book.getAuthor());
                System.out.println("Páginas: " + book.getPages());
                System.out.println("Categoria: " + book.getCategory());
                System.out.println("Data de Registro: " + book.getRegistrationDate());
                System.out.println("----------------------");
            }
        } catch (Exception e) {
            System.err.println("Erro ao listar livros: " + e.getMessage());
        }
    }
}