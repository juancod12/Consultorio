package com.zeus.controller;

import com.zeus.until.OdontogramaVista;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class OdontogramaCon {

    @FXML
    private  AnchorPane root;


    @FXML
    void initialize(){
        //Se cargan los elementos graficos de los dientes
        OdontogramaVista.odontograma(root);

    }


    
    //poner los numeros arriba de cada odontograma
    //hacer una accion pane de cada diente como tal para que se seleccione y se pueda modificar



}
