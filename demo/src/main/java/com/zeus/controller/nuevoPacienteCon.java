package com.zeus.controller;

import com.zeus.dao.Antecedente;
import com.zeus.dao.Paciente;
import com.zeus.service.CargarImagen;
import com.zeus.service.CrearAntecedente;
import com.zeus.service.CrearPaciente;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class nuevoPacienteCon implements RecibeControlador<pacientesCon> {
    
    private pacientesCon controladorPacientes;
    private Paciente paciente;
    //elementos
    @FXML
    private TextField nombre;
    @FXML
    private TextField apellido;
    @FXML
    private TextField edad;
    @FXML
    private TextField cedula;
    @FXML
    private TextField telefono;
    @FXML
    private  TextArea descripcion;
    @FXML
    private  Button agregarBT;
    @FXML
    private Button cargarImagen;
    @FXML
    private ImageView imgPerfil;
    @FXML
    private VBox ImagenVbox;
    

    @FXML
    void initialize(){
        

    }
    @FXML
    void cargarImagen(ActionEvent event){
        Stage stage = (Stage) cargarImagen.getScene().getWindow();
        CargarImagen.seleccionarFotoPerfil(stage, imgPerfil);
        cargarImagen.setVisible(false);
        cargarImagen.setManaged(false);
        ImagenVbox.setStyle("-fx-border-color: trasparent; -fx-alignment: center;");
    }
    @FXML
    void cancelar(ActionEvent event){
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void agregar(ActionEvent event){
        if(imgPerfil != null){
                //crear los antecedentes
                Antecedente antecedente = new Antecedente(Integer.parseInt(cedula.getText()), null, null, null, null,null);
                CrearAntecedente.crear(antecedente);

                ///guardar paciente
                String imageURL =   CargarImagen.guargar(imgPerfil);
                
                Paciente paciente = new Paciente(Integer.parseInt(cedula.getText()), nombre.getText(), apellido.getText(), Integer.parseInt(edad.getText()), telefono.getText(),descripcion.getText(), imageURL);
                CrearPaciente.crear(paciente);
                controladorPacientes.actualizarLista();
                ((Stage) agregarBT.getScene().getWindow()).close();
                
        }else{
                //crear los antecedentes
                Antecedente antecedente = new Antecedente(Integer.parseInt(cedula.getText()), null, null, null, null,null);
                CrearAntecedente.crear(antecedente);
                
                //guardar pacientes
                System.out.println("no se cargo imagen");
                Paciente paciente = new Paciente(Integer.parseInt(cedula.getText()), nombre.getText(), apellido.getText(), Integer.parseInt(edad.getText()), telefono.getText(),descripcion.getText(), null);
                CrearPaciente.crear(paciente);
                controladorPacientes.actualizarLista();
                ((Stage) agregarBT.getScene().getWindow()).close();
        }

        
    }
    
// metodos heredados
    @Override
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public void setControladorPrincipal(pacientesCon controlador) {
        this.controladorPacientes = controlador;
    }


    





}
