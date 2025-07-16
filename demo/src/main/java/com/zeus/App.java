package com.zeus;

import java.io.IOException;

import com.zeus.until.DienteVista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.zeus.until.HibernateUtil;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        boolean usuarioRegistrado = existeUsuario();

        // Si hay usuario registrado, abre inicio de sesión; si no, abre registro
        String fxmlFile = usuarioRegistrado ? "/fxml/Inicio.fxml" : "/fxml/registrarse.fxml";

        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        Scene scene = new Scene(loader.load());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Consultorio Dental");
        primaryStage.show();
    }

    private boolean existeUsuario() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Long> query = session.createQuery("SELECT COUNT(u) FROM Usuario u", Long.class);
            Long count = query.uniqueResult();
            return count != null && count > 0;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

