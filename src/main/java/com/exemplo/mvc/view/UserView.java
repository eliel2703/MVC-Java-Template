// UserView.java
package com.exemplo.mvc.view;

import com.exemplo.mvc.model.User;

public class UserView implements View {
    @Override
    public void showUserDetails(User user) {
        System.out.println("Detalhes do Usuário:");
        System.out.println("Nome: " + user.getName());
        System.out.println("Email: " + user.getEmail());
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}

// View.java (Interface)
package com.exemplo.mvc.view;

public interface View {
    void showUserDetails(User user);
    void showMessage(String message);
}