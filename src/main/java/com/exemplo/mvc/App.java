package com.exemplo.mvc;

import com.exemplo.mvc.controller.UsuarioController;
import com.exemplo.mvc.repository.UsuarioRepository;
import com.exemplo.mvc.service.UsuarioService;
import com.exemplo.mvc.view.UsuarioView;
import com.exemplo.mvc.model.Usuario;

public class App {
    public static void main(String[] args) {
        // Inicialização dos componentes
        UsuarioRepository repository = new UsuarioRepository();
        UsuarioService service = new UsuarioService(repository);
        UsuarioView view = new UsuarioView();
        UsuarioController controller = new UsuarioController(service, view);
        
        // Exemplo de fluxo
        controller.cadastrarUsuario("Ana Silva", "ana@email.com");
        controller.buscarUsuario("ana@email.com");
        controller.buscarUsuario("email@inexistente.com");
    }
}