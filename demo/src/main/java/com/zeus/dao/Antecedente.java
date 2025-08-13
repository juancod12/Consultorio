package com.zeus.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Antecedente {
    @Id
    @Column(length = 10)
    private int idAntecedente;
    @Column
    private String patologicos;
    @Column
    private String alergicos;
    @Column
    private String farmacologicos;
    @Column
    private String odontologicos;
    @Column
    private String heredofamiliares;

    
    public Antecedente() {
    }

    public Antecedente(int idAntecedente, String patologicos, String alergicos, String farmacologicos,
            String odontologicos, String heredofamiliares) {
        this.idAntecedente = idAntecedente;
        this.patologicos = patologicos;
        this.alergicos = alergicos;
        this.farmacologicos = farmacologicos;
        this.odontologicos = odontologicos;
        this.heredofamiliares = heredofamiliares;
    }

    //setters
    public void setIdAntecedente(int idAntecedente) {
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
    

    public void setFarmacologicos(String farmacologicos) {
        this.farmacologicos = farmacologicos;
    }



    // getters

    public String getFarmacologicos() {
        return farmacologicos;
    }

    public int getIdAntecedente() {
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
