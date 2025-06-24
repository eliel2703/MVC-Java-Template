package com.exemplo.mvc.controller;

import com.exemplo.mvc.service.UsuarioService;
import com.exemplo.mvc.view.UsuarioView;
import com.exemplo.mvc.model.*;

public class UsuarioController {
    private final UsuarioService service;
    private final UsuarioView view;
    
    public UsuarioController(UsuarioService service, UsuarioView view) {
        this.service = service;
        this.view = view;
    }
    
    public void cadastrarUsuario(String nome, String email) {
        service.cadastrarUsuario(nome, email);
        view.mostrarMensagem("Usuário cadastrado com sucesso!");
    }
    
    public void buscarUsuario(String email) {
        Usuario usuario = service.buscarUsuario(email);
        if(usuario != null) {
            view.mostrarDetalhesUsuario(usuario);
        } else {
            view.mostrarMensagem("Usuário não encontrado");
        }
    }
}