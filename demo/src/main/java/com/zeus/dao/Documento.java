package com.zeus.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Documento {
    @Id
    @Column(length = 10)
    private int idDocumento;
    @Column
    private String patologicos;
    @Column
    private String alergicos;
    @Column
    private String odontologicos;
    @Column
    private String heredofamiliares;
    
    public Documento() {
    }

    public Documento(int idDocumento, String patologicos, String alergicos, String odontologicos,
            String heredofamiliares) {
        this.idDocumento = idDocumento;
        this.patologicos = patologicos;
        this.alergicos = alergicos;
        this.odontologicos = odontologicos;
        this.heredofamiliares = heredofamiliares;
    }

    //setters
    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public void setPatologicos(String patologicos) {
        this.patologicos = patologicos;
    }

    public void setAlergicos(String alergicos) {
        this.alergicos = alergicos;
    }

    public void setOdontologicos(String odontologicos) {
        this.odontologicos = odontologicos;
    }

    public void setHeredofamiliares(String heredofamiliares) {
        this.heredofamiliares = heredofamiliares;
    }

    //getters
    public int getIdDocumento() {
        return idDocumento;
    }

    public String getPatologicos() {
        return patologicos;
    }

    public String getAlergicos() {
        return alergicos;
    }

    public String getOdontologicos() {
        return odontologicos;
    }

    public String getHeredofamiliares() {
        return heredofamiliares;
    }

    @Override
    public String toString() {
        return "Documento [idDocumento=" + idDocumento + ", patologicos=" + patologicos + ", alergicos=" + alergicos
                + ", odontologicos=" + odontologicos + ", heredofamiliares=" + heredofamiliares + "]";
    }
    
    
    
    

}
