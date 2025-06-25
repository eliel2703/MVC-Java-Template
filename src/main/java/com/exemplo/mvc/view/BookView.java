package com.exemplo.mvc.view;

import com.exemplo.mvc.model.Book;
import java.util.List;

public class BookView {

    public void printBookDetails(Book bookModel) {
        try {
            System.out.println("\n--- DETALHES DO LIVRO ---");
            if (bookModel.getTitle() != null) {
                System.out.println("Title: " + bookModel.getTitle());
            }
            if (bookModel.getAuthor() != null) {
                System.out.println("Author: " + bookModel.getAuthor());
            }
            if (bookModel.getPages() != null) { 
                System.out.println("Pages: " + bookModel.getPages());
            }
            if (bookModel.getCategory() != null) {
                System.out.println("Category: " + bookModel.getCategory());
            }
            if (bookModel.getRegistrationDate() != null) {
                System.out.println("Data de Registro: " + bookModel.getRegistrationDate());
            }
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
                if (book == null) {
                    System.out.println("Livro nulo encontrado, pulando...");
                    continue;
                }

                if (book.getTitle() != null) {
                    System.out.println("Título: " + book.getTitle());
                }
                if (book.getAuthor() != null) {
                    System.out.println("Autor: " + book.getAuthor());
                }
                if (book.getPages() != null) {
                    System.out.println("Páginas: " + book.getPages());
                }
                if (book.getCategory() != null) {
                    System.out.println("Categoria: " + book.getCategory());
                }
                if (book.getRegistrationDate() != null) {
                    System.out.println("Data de Registro: " + book.getRegistrationDate());
                    System.out.println("----------------------");
                }

            }
        } catch (Exception e) {
            System.err.println("Erro ao listar livros: " + e.getMessage());
        }
    }
}
