package com.exemplo.mvc.view;

import com.exemplo.mvc.model.Usuario;

public class UsuarioView {
    public void mostrarDetalhesUsuario(Usuario usuario) {
        System.out.println("\n--- DETALHES DO USUÁRIO ---");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
    }
    
    public void mostrarMensagem(String mensagem) {
        System.out.println("\n> " + mensagem);
    }
}