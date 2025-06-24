// UserController.java
package com.exemplo.mvc.controller;

import com.exemplo.mvc.model.Model;
import com.exemplo.mvc.model.User;
import com.exemplo.mvc.view.View;

public class UserController implements Controller {
    private Model model;
    private View view;

    public UserController(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void addUser(String name, String email) {
        User user = new User(name, email);
        model.addUser(user);
        view.showMessage("Usuário adicionado com sucesso!");
    }

    @Override
    public void getUser(String email) {
        User user = model.getUser(email);
        if(user != null) {
            view.showUserDetails(user);
        } else {
            view.showMessage("Usuário não encontrado");
        }
    }
}

// Controller.java (Interface)
package com.exemplo.mvc.controller;

public interface Controller {
    void addUser(String name, String email);
    void getUser(String email);
}