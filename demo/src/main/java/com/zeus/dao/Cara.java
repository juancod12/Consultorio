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
public class Cara {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int idCara;
    @Column
    private String nombre;
    @OneToOne
    @JoinColumn(name = "estado_Diente")
    private EstadoDiente estadoDiente;
    

    

    
    
}
