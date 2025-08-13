package com.zeus.until;

import com.zeus.controller.RecibeControlador;
import com.zeus.controller.pacientesCon;
import com.zeus.dao.Paciente;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class PacientesVista extends ListCell<Paciente> {

    
    

    @Override
    protected void updateItem(Paciente paciente, boolean empty){
        super.updateItem(paciente,empty);

        HBox hbox = new HBox();
        Label apellido = new Label();
        Label nombre = new Label();
        Label cedula = new Label();
        Label telefono = new Label();
        Label descripcion = new Label();
        Button ver= new Button();
        //configuracion del botton
        Image imagen = new Image(getClass().getResourceAsStream("/imagenes/flechaIcono.png"));
        ImageView icono = new ImageView(imagen);
        icono.setFitWidth(30);
        icono.setFitHeight(30);

        //configuracion de largo de cada label
        cedula.setPrefWidth(166);
        nombre.setPrefWidth(165);
        apellido.setPrefWidth(158);
        telefono.setPrefWidth(214);
        descripcion.setPrefWidth(277);
        ver.setPrefWidth(48);
        ver.setStyle("-fx-background-color: trasparent;  -fx-background-size: contain;");
        ver.setGraphic(icono);
        //centrar elementos
        cedula.setPrefHeight(48);
        nombre.setPrefHeight(48);
        apellido.setPrefHeight(48);
        telefono.setPrefHeight(48);
        descripcion.setPrefHeight(48);
        ver.setPrefHeight(48);

        
        hbox.setPrefHeight(50);
        //stilo del hbox
        hbox.setStyle("-fx-border-color:gray; -fx-border-width:0 0 1 0; ");


        //accion del button
        ver.setOnAction(Event ->{
            System.out.println("Abriendo perfil del paciente"+ paciente.getCedula());
            Cargar obj = new Cargar();
            obj.cargarVistaConPaciente(paciente ,Event, "/fxml/paciente.fxml", true);



        });

        



        //agregar los elementos a la celda
        hbox.getChildren().addAll(cedula,nombre,apellido,telefono,descripcion,ver);
        if (empty || paciente == null) {
                setGraphic(null);
            } else {
                //agregar texto
                apellido.setText(paciente.getApellido()+"");
                nombre.setText(paciente.getNombre());
                cedula.setText(paciente.getCedula()+"");
                telefono.setText(paciente.getTelefono());
                descripcion.setText(paciente.getDescripcion());
                setGraphic(hbox);
    }



    }



    
}
