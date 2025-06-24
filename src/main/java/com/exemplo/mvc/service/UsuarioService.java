package com.exemplo.mvc.service;

import com.exemplo.mvc.model.Usuario;
import com.exemplo.mvc.repository.UsuarioRepository;

public class UsuarioService {
    private final UsuarioRepository repository;
    
    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }
    
    public void cadastrarUsuario(String nome, String email) {
        Usuario usuario = new Usuario(nome, email);
        repository.salvar(usuario);
    }
    
    public Usuario buscarUsuario(String email) {
        return repository.buscarPorEmail(email);
    }
}