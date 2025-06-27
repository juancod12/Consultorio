package com.zeus.dao;



import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="odontograma")
public class Odontograma {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int idOdontograma;

    @Column(name = "fecha_registro")
    private Date fechaRegistro;
    
    @Column
    private String Denticion;

    @ManyToOne
    @JoinColumn(name = "cedula")
    private Paciente paciente;
    
    public Odontograma() {
    }

    public Odontograma(int idOdontograma, Date fechaRegistro, String denticion, Paciente paciente) {
        this.idOdontograma = idOdontograma;
        this.fechaRegistro = fechaRegistro;
        Denticion = denticion;
        this.paciente = paciente;
    }

    //setters

    public void setIdOdontograma(int idOdontograma) {
        this.idOdontograma = idOdontograma;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setDenticion(String denticion) {
        Denticion = denticion;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    //getters
    public int getIdOdontograma() {
        return idOdontograma;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public String getDenticion() {
        return Denticion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    @Override
    public String toString() {
        return "Odontograma [idOdontograma=" + idOdontograma + ", fechaRegistro=" + fechaRegistro + ", Denticion="
                + Denticion + ", paciente=" + paciente + "]";
    }

    

    
}
