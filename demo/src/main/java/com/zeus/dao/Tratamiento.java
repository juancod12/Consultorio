package com.zeus.dao;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Tratamiento {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id_tratamiento;
    @Column(name= "tipo_tratamiento")
    private String tipoTratamiento;
    @Column
    private Date fecha;
    @Column
    private String observaciones;
    @Column
    private Boolean estado ;
    @ManyToOne
    @JoinColumn(name = "idDiente")
    private Diente diente;
    
    public Tratamiento() {
    }

    public Tratamiento(Long id_tratamiento, String tipoTratamiento, Date fecha, String observaciones, Boolean estado,
            Diente diente) {
        this.id_tratamiento = id_tratamiento;
        this.tipoTratamiento = tipoTratamiento;
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.estado = estado;
        this.diente = diente;
    }

    //setters
    public void setid_tratamiento(Long id_tratamiento) {
        this.id_tratamiento = id_tratamiento;
    }

    public void setTipoTratamiento(String tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void setDiente(Diente diente) {
        this.diente = diente;
    }

    //getters

    public Long getid_tratamiento() {
        return id_tratamiento;
    }

    public String getTipoTratamiento() {
        return tipoTratamiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public Boolean getEstado() {
        return estado;
    }

    public Diente getDiente() {
        return diente;
    }

    @Override
    public String toString() {
        return "Tratamiento [id_tratamiento=" + id_tratamiento + ", tipoTratamiento=" + tipoTratamiento + ", fecha="
                + fecha + ", observaciones=" + observaciones + ", estado=" + estado + ", diente=" + diente + "]";
    }
    

}
