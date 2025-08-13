package com.zeus.dao;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
@Entity
public class Diente {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idDiente;
    @Column
    private String tipo;
    @Column(name="nomenclatura_fdi")
    private String nomenclaturaFDI;
    
    @ManyToOne
    @JoinColumn(name = "idOdontograma")
    private Odontograma odontograma;
    @OneToOne
    @JoinColumn(name = "estado_Diente")
    private EstadoDiente estadoDiente;

    public Diente() {
    }

    public Diente(Long idDiente, String tipo, String nomenclaturaFDI, Odontograma odontograma,
            EstadoDiente estadoDiente) {
        this.idDiente = idDiente;
        this.tipo = tipo;
        this.nomenclaturaFDI = nomenclaturaFDI;
        this.odontograma = odontograma;
        this.estadoDiente = estadoDiente;
    }

    //seteters
    public void setIdDiente(Long idDiente) {
        this.idDiente = idDiente;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNomenclaturaFDI(String nomenclaturaFDI) {
        this.nomenclaturaFDI = nomenclaturaFDI;
    }

    public void setOdontograma(Odontograma odontograma) {
        this.odontograma = odontograma;
    }

    public void setEstadoDiente(EstadoDiente estadoDiente) {
        this.estadoDiente = estadoDiente;
    }

    //getters
    public Long getIdDiente() {
        return idDiente;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNomenclaturaFDI() {
        return nomenclaturaFDI;
    }

    public Odontograma getOdontograma() {
        return odontograma;
    }

    public EstadoDiente getEstadoDiente() {
        return estadoDiente;
    }

    @Override
    public String toString() {
        return "Diente [idDiente=" + idDiente + ", tipo=" + tipo + ", nomenclaturaFDI=" + nomenclaturaFDI
                + ", odontograma=" + odontograma + ", estadoDiente=" + estadoDiente + "]";
    }

    
    
}