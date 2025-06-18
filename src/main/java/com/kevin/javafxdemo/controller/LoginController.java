package com.kevin.javafxdemo.controller;

import com.kevin.javafxdemo.service.AuthService;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label messageLabel;

    private final AuthService authService = new AuthService();

    @FXML
    public void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        boolean authenticated = authService.authenticate(username, password);

        if (authenticated) {
            messageLabel.setText("Bienvenido ".concat(username));
        } else {
            messageLabel.setText("Credenciales inválidas");
        }

    }

}
