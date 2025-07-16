package com.zeus.controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import com.zeus.service.GuardarUsuario;

public class Registrarse {

    @FXML
    private TextField nombreUsuario;

    @FXML
    private TextField correoElectronico;

    @FXML
    private PasswordField contrasena;

    @FXML
    private Button guardarUsuario;

    private GuardarUsuario servicio = new GuardarUsuario();

    @FXML
    public void initialize() {
        guardarUsuario.setOnAction(event -> guardar());
    }

    private void guardar() {
        String nombre = nombreUsuario.getText();
        String correo = correoElectronico.getText();
        String clave = contrasena.getText();

        boolean exito = servicio.registrarUsuario(nombre, correo, clave);

        if (exito) {
            Alert alerta = new Alert(AlertType.INFORMATION);
            alerta.setTitle("Registro Exitoso");
            alerta.setHeaderText(null);
            alerta.setContentText("Usuario registrado correctamente.");
            alerta.showAndWait();
            abrirLogin();
            // Cerrar ventana actual:
            guardarUsuario.getScene().getWindow().hide();
        } else {
            Alert alerta = new Alert(AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText(null);
            alerta.setContentText("Verifica los datos. Campos vacíos o correo inválido.");
            alerta.showAndWait();
        }
    }

    private void abrirLogin() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ruta/Inicio.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load()));
            stage.setTitle("Iniciar Sesión");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}