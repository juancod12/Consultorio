package com.zeus.until;

import java.io.IOException;

import com.zeus.controller.RecibeControlador;
import com.zeus.controller.nuevoPacienteCon;
import com.zeus.controller.perfilPaciente;
import com.zeus.dao.Paciente;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Cargar {
    public  void cargarRecursos( Event  event, String url, Boolean emergente ){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(url));
            Parent root = loader.load();

            Stage nuevaVentana = new Stage(); // ← ESTA es la nueva ventana
            nuevaVentana.setScene(new Scene(root));

            // Para bloquear solo la ventana que la abre:
            if(emergente){  nuevaVentana.initModality(Modality.WINDOW_MODAL);}
            nuevaVentana.initOwner(((Node) event.getSource()).getScene().getWindow());

            nuevaVentana.showAndWait(); // ← muestra como modal

            } catch (IOException ex) {
                    ex.printStackTrace();
            }
    }

    public <T, C extends RecibeControlador<T>> void cargarVistaConControlador(
        T controladorPrincipal,
        ActionEvent event,
        String urlFXML,
        boolean emergente) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(urlFXML));
            Parent root = loader.load();

            C controladorSecundario = loader.getController();
            controladorSecundario.setControladorPrincipal(controladorPrincipal);
            
            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            if (emergente) {
                stage.initModality(Modality.WINDOW_MODAL);
                stage.initOwner(((Node) event.getSource()).getScene().getWindow());
            }

            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public  void cargarVistaConPaciente(
        Paciente paciente,
        ActionEvent event,
        String urlFXML,
        boolean emergente) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(urlFXML));
            Parent root = loader.load();
            perfilPaciente controller = loader.getController();
            controller.setPaciente(paciente);
            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            if (emergente) {
                stage.initModality(Modality.WINDOW_MODAL);
                stage.initOwner(((Node) event.getSource()).getScene().getWindow());
            }

            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
