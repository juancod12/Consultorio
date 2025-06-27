package com.zeus.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Antecedente {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idAntecedente;
    @Column
    private String patologicos;
    @Column
    private String alergicos;
    @Column
    private String odontologicos;
    @Column
    private String heredofamiliares;

    public Antecedente() {
    }

    public Antecedente(Long idAntecedente, String patologicos, String alergicos, String odontologicos,
            String heredofamiliares) {
        this.idAntecedente = idAntecedente;
        this.patologicos = patologicos;
        this.alergicos = alergicos;
        this.odontologicos = odontologicos;
        this.heredofamiliares = heredofamiliares;
    }
    //setters
    public void setIdAntecedente(Long idAntecedente) {
        this.idAntecedente = idAntecedente;
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
    // getters
    public Long getIdAntecedente() {
        return idAntecedente;
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
        return "Antecedente [idAntecedente=" + idAntecedente + ", patologicos=" + patologicos + ", alergicos="
                + alergicos + ", odontologicos=" + odontologicos + ", heredofamiliares=" + heredofamiliares + "]";
    }
    
    
}
