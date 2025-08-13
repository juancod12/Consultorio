package com.zeus.controller;




import com.zeus.dao.Paciente;
import com.zeus.service.ListarPacientes;
import com.zeus.until.Cargar;
import com.zeus.until.PacientesVista;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;



public class pacientesCon {

    

    public  void actualizarLista() {
        lista.setAll(ListarPacientes.listarTodos());
    }


    
    @FXML
    private ListView<Paciente> pacientesView;
    public ObservableList<Paciente> lista = FXCollections.observableArrayList();


    @FXML
    void initialize(){
                lista.setAll(ListarPacientes.listarTodos());
                pacientesView.setItems(lista);
                pacientesView.setCellFactory(param -> new PacientesVista());
    }

    @FXML
    void nuevoPaciente(ActionEvent event){
        Cargar obj = new Cargar();
        obj.cargarVistaConControlador(this, event, "/fxml/nuevoPaciente.fxml", true);
    }

    


}
