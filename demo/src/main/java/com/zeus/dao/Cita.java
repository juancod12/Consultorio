package com.zeus.dao;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Cita {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idCita;
    @Column
    private String nombre;
    @Column
    private Date fecha;
    @Column
    private Time hora;
    @Column
    private String tratamiento;
    
    @OneToOne
    @JoinColumn(name = "cedula")
    private Paciente paciente;
    
    public Cita() {
    }

    public Cita(Long idCita, String nombre, Date fecha, Time hora, String tratamiento, Paciente paciente) {
        this.idCita = idCita;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.tratamiento = tratamiento;
        this.paciente = paciente;
    }
    //setters

    public void setIdCita(Long idCita) {
        this.idCita = idCita;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    //getters

    public Long getIdCita() {
        return idCita;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
        return hora;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    @Override
    public String toString() {
        return "Cita [idCita=" + idCita + ", nombre=" + nombre + ", fecha=" + fecha + ", hora=" + hora
                + ", tratamiento=" + tratamiento + ", paciente=" + paciente + "]";
    }

    

}
