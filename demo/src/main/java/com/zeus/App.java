package com.zeus;

import java.io.IOException;

import com.zeus.until.DienteVista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class App extends Application{
AnchorPane root;
    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            
            root = FXMLLoader.load(getClass().getResource("/fxml/pacientes.fxml"));    //se cargan los recursos y se pone la ruta del fxml
            Scene scene =new Scene(root);         //se crea la scena y como parametro le pasamos los recursos
            
            primaryStage.setTitle("ZEUS");
            primaryStage.setScene(scene);

            primaryStage.show();
            

        } catch (IOException e) {
           e.printStackTrace(); // : handle exception
        }

    }

    public static void main(String[] args) {
        launch(args);
    }

}
