package com.exemplo.mvc.repository;

import com.exemplo.mvc.model.Usuario;
import java.util.HashMap;
import java.util.Map;

public class UsuarioRepository {
    private final Map<String, Usuario> usuarios = new HashMap<>();
    
    public void salvar(Usuario usuario) {
        usuarios.put(usuario.getEmail(), usuario);
    }
    
    public Usuario buscarPorEmail(String email) {
        return usuarios.get(email);
    }
}