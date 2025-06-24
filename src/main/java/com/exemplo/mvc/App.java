// App.java
package com.exemplo.mvc;

import com.exemplo.mvc.controller.UserController;
import com.exemplo.mvc.model.InMemoryModel;
import com.exemplo.mvc.model.Model;
import com.exemplo.mvc.view.UserView;

public class App {
    public static void main(String[] args) {
        // Inicialização do MVC
        Model model = new InMemoryModel();
        UserView view = new UserView();
        UserController controller = new UserController(model, view);

        // Exemplo de uso
        controller.addUser("João Silva", "joao@email.com");
        controller.getUser("joao@email.com");
        
        controller.getUser("email@inexistente.com");
    }
}