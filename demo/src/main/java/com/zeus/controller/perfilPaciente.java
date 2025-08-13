package com.zeus.controller;

import java.io.File;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.EnumSet;
import java.util.Locale;

import com.zeus.dao.Antecedente;
import com.zeus.dao.Diente;
import com.zeus.dao.EstadoDiente;
import com.zeus.dao.Odontograma;
import com.zeus.dao.Paciente;
import com.zeus.service.ConsultarAntecedente;
import com.zeus.service.CrearAntecedente;
import com.zeus.service.CrearDiente;
import com.zeus.service.CrearEstadoDiente;
import com.zeus.service.CrearOdontograma;
import com.zeus.service.ListarOdontogramas;
import com.zeus.service.ListarPacientes;
import com.zeus.until.Editar;
import com.zeus.until.OdontogramaVista;
import com.zeus.until.PacientesVista;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;





public class perfilPaciente {

    private Paciente paciente ;
    //set
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
        cargarDatos(paciente);
    }
    //sett
    public Paciente getPaciente() {
        return paciente;
    }
    
    

    @FXML
    private Label cedula;

    @FXML
    private Label descripcion;

    @FXML
    private Label nombre;

    @FXML
    private Label telefono;
    @FXML
    private Label apellido;
    @FXML
    private Label edad;
    //elementos antecedentes

    //StackPane
    @FXML
    private StackPane patologicosSKP;
    @FXML
    private StackPane alergicosSKP;
    @FXML
    private StackPane farmacologicosSKP;
    @FXML
    private StackPane odontologicosSKP;
    @FXML
    private StackPane heredofamiliaresSKP;
    //label
    @FXML
    private Label patologicos;
    @FXML
    private Label alergicos;
    @FXML
    private Label farmacologicos;
    @FXML
    private Label odontologicos;
    @FXML
    private Label heredofamiliares;
    //botones
    @FXML
    private Button patologicosBT;
    @FXML
    private Button alergicosBT;
    @FXML
    private Button farmacologicosBT;
    @FXML
    private Button odontologicosBT;
    @FXML
    private Button heredofamiliaresBT;
    @FXML
    private Button nuevoOdontograma;
    @FXML
    private Button guardarBt;
    @FXML
    private Button cancelarBt;


    //otros elementos
    @FXML
    private ImageView imagenPerfil;
    @FXML
    private Pane panePerfil;
    
    
    //modificacion del botton
    private boolean enModoEdicionP = false;
    private boolean enModoEdicionA = false;
    private boolean enModoEdicionF = false;
    private boolean enModoEdicionO = false;
    private boolean enModoEdicionH = false;

    //elementos para listar odontogramas
    @FXML
    private ListView<Odontograma> odontogramaViw;

    public ObservableList<Odontograma> lista = FXCollections.observableArrayList();

    //metodo para cambiar de icono
    private void CambiarImagen(Button button, StackPane stackPane,Label label,Boolean enModoEdicion){
        if (!enModoEdicionP) {
            Editar.hacerLabelEditable(stackPane, label);
            button.setStyle("-fx-background-color: trasparent; -fx-background-image: url('/imagenes/guardar.png'); -fx-background-repeat: no-repeat; -fx-background-size: 20; -fx-background-position: center;" );
            enModoEdicionP =true;
        }else{
            button.setStyle("-fx-background-color: trasparent; -fx-background-image: url('/imagenes/lapiz.png'); -fx-background-repeat: no-repeat; -fx-background-size: 15; -fx-background-position: center;" );
            enModoEdicionP = false;
        }

    }
    

    // Método para llenar los campos en pantalla
    private void cargarDatos(Paciente paciente) {
        if (paciente != null) {

            //se cargan los datos personales del paciente
            nombre.setText("  "+paciente.getNombre());
            apellido.setText("  "+paciente.getApellido());
            edad.setText(String.valueOf("  "+paciente.getEdad()));
            cedula.setText(String.valueOf("  "+paciente.getCedula()));
            telefono.setText("  "+paciente.getTelefono());
            descripcion.setText(paciente.getDescripcion());
            
            //se carga la imagen del paciente
            File archivo = new File("imagenesPerfil/" + paciente.getFoto());

            if (archivo.exists()) {
                Image imagen = new Image(archivo.toURI().toString());
                imagenPerfil.setImage(imagen);
                panePerfil.setStyle("-fx-background-position: center; ");
            } else {
                System.out.println("No se encontró la imagen: " + archivo.getAbsolutePath());
            }

            //se cargan los antecedentes del paciente
            Antecedente antecedentes = ConsultarAntecedente.Consultar(paciente.getCedula());
            patologicos.setText(antecedentes.getPatologicos());;
            alergicos.setText(antecedentes.getAlergicos());
            farmacologicos.setText(antecedentes.getFarmacologicos());
            odontologicos.setText(antecedentes.getOdontologicos());
            heredofamiliares.setText(antecedentes.getHeredofamiliares());

            //Listar odontogramas
            cargarOdontogramas(paciente.getCedula());

            


        }
    }
    //cargar los odontogramas
    private void cargarOdontogramas(int ID){
        lista.setAll(ListarOdontogramas.listarTodos(ID));
        odontogramaViw.setItems(lista);
        odontogramaViw.setCellFactory(param -> new OdontogramaVista());
    }

    //metodo principal
    @FXML
    private void initialize(){
        

    }

    //acciones de boton de antecedentes
    @FXML
    private void patologicos(ActionEvent event){
        CambiarImagen(patologicosBT, patologicosSKP, patologicos, enModoEdicionP);
        cancelarBt.setVisible(true);
        guardarBt.setVisible(true);
    }
    @FXML
    private void alergicos(ActionEvent event){
        CambiarImagen(alergicosBT, alergicosSKP, alergicos, enModoEdicionA);
        cancelarBt.setVisible(true);
        guardarBt.setVisible(true);
    }
    @FXML
    private void farmacologicos(ActionEvent event){
        CambiarImagen(farmacologicosBT, farmacologicosSKP, farmacologicos, enModoEdicionF);
        cancelarBt.setVisible(true);
        guardarBt.setVisible(true);
    }
    @FXML
    private void odontologicos(ActionEvent event){
        CambiarImagen(odontologicosBT, odontologicosSKP, odontologicos, enModoEdicionO);
        cancelarBt.setVisible(true);
        guardarBt.setVisible(true);
        
    }
    @FXML
    private void heredofamiliares(ActionEvent event){
        CambiarImagen(heredofamiliaresBT, heredofamiliaresSKP, heredofamiliares, enModoEdicionH);
        cancelarBt.setVisible(true);
        guardarBt.setVisible(true);
        
    }

    
    //guardado de antecedentes
    @FXML
    void guardarAct(){
        //extraer el texto de los label
        String AntecedenteP = patologicos.getText();
        String AntecedenteA = alergicos.getText();
        String AntecedenteF = farmacologicos.getText();
        String AntecedenteO = odontologicos.getText();
        String AntecedenteH = heredofamiliares.getText();


        Antecedente antecedente = new Antecedente(paciente.getCedula(), AntecedenteP, AntecedenteA, AntecedenteF, AntecedenteO,AntecedenteH);
        //guardar antecedentes
        CrearAntecedente.crear(antecedente);
        //ocultar botones
        cancelarBt.setVisible(false);
        guardarBt.setVisible(false);

    }

    //cancelar antecedentes
    @FXML
    void cancelarAct(){
        cancelarBt.setVisible(false);
        guardarBt.setVisible(false);
    }

    //accion de boton de nuevo odontograma
    @FXML
    void NuevoOdontograma(){

        LocalDate hoy = LocalDate.now(); // Fecha actual del sistema
        Date fechaSQL = Date.valueOf(hoy);
        int FDI = 11;
        Odontograma odontograma = new Odontograma(0, fechaSQL, null, paciente);
        for(int i=0 ; i < 51; i++){
           //crear elementos del diente
            if (FDI== 19) {FDI=21;}
            if (FDI== 29) {FDI=31;}
            if (FDI== 39) {FDI=41;}
            if (FDI== 49) {FDI=51;}
            if (FDI== 56) {FDI=61;}
            if (FDI== 66) {FDI=71;}
            if (FDI==76 ) {FDI=81;}

            //guardar elementos del diente

        }

        CrearOdontograma.crear(odontograma);
        //Listar odontogramas
        cargarOdontogramas(paciente.getCedula());
        
    }


}
