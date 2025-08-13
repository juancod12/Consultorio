package com.zeus.until;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import com.zeus.dao.Antecedente;
import com.zeus.dao.Odontograma;
import com.zeus.dao.Paciente;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;


public class OdontogramaVista extends ListCell<Odontograma>{

    //vista de la lista
    @Override
    protected void updateItem(Odontograma odontograma, boolean empty){
        super.updateItem(odontograma,empty);

        
        if (empty || odontograma == null) {
            setText(null);
            setGraphic(null);
            return;
        }

        HBox hbox = new HBox();
        Label label =new Label();
        Label fecha =new Label();
        Label espacio =new Label();

        //Estilos de los elementos

        hbox.setPrefHeight(30);
        label.setPrefWidth(200);
        fecha.setPrefWidth(200);
        espacio.setPrefWidth(20);

        label.setText(" Odontograma");

        Date fechaSQL = odontograma.getFechaRegistro();

        if (fechaSQL != null) {
        LocalDate hoy = fechaSQL.toLocalDate();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("es", "ES"));
        String fechaFormateada = hoy.format(formato);
        fecha.setText(fechaFormateada);
        } else {
            fecha.setText("Sin fecha");
        }
        
        //agregar informacion al Vbox
        hbox.getChildren().addAll(label,espacio,fecha);

        
        setGraphic(hbox);

        //acion al cliquear el vbox
        hbox.setOnMouseClicked( event -> {

            System.out.println("Cargando odontograma");
            Cargar obj = new Cargar();
            obj.cargarRecursos(event, "/fxml/odontograma.fxml",false);
            //pasar el id del odontograma
            



        });


    }

    //Crea el odontograma
    public static void odontograma(AnchorPane root){

        //creaccion de odontogramas
            double centerX= 50;
            double centerY= 50;
            
            for(int i=1;i <= 16; i++){
                DienteVista diente = new DienteVista(centerX, centerY);
                centerX = centerX + 48;
                if(i==8){centerX += 16;}
                root.getChildren().add(diente);

            }


            centerX= 50;
            centerY= 100;
            for(int i=1;i <= 16; i++){
                DienteVista diente4 = new DienteVista(centerX, centerY);
                centerX = centerX + 48;
                if(i==8){centerX += 16;}
                root.getChildren().add(diente4);

            }
            
            centerX= 194;
            centerY= 160;
            for(int i=1;i <= 10; i++){
                DienteVista diente2 = new DienteVista(centerX, centerY);
                centerX = centerX + 48;
                if(i==5){centerX += 16;}
                root.getChildren().add(diente2);

            }
            centerX= 194;
            centerY= 208;
            for(int i=1;i <= 10; i++){
                DienteVista diente3 = new DienteVista(centerX, centerY);
                centerX = centerX + 48;
                if(i==5){centerX += 16;}
                root.getChildren().add(diente3);

            }
    }


}
