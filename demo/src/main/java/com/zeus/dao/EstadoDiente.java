package com.zeus.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estado_diente")
public class EstadoDiente {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idEstadoDiente;
    @Column
    private Boolean dienteSano;
    @Column
    private Boolean dienteAusente;
    @Column
    private Boolean ExtraccionIndicada;
    @Column
    private Boolean caries;
    @Column
    private Boolean Fractura;
    @Column
    private Boolean Resina;
    @Column
    private Boolean amalgama;
    @Column
    private Boolean endodoncia;
    @Column
    private Boolean implante;
    @Column
    private Boolean perno;
    @Column
    private Boolean corona;
    @Column
    private Boolean sellante;
    @Column
    private Boolean pontico;
    @Column
    private Boolean provicional;
    
    public EstadoDiente() {
    }

    public EstadoDiente(Long idEstadoDiente, Boolean dienteSano, Boolean dienteAusente, Boolean extraccionIndicada,
            Boolean caries, Boolean fractura, Boolean resina, Boolean amalgama, Boolean endodoncia, Boolean implante,
            Boolean perno, Boolean corona, Boolean sellante, Boolean pontico, Boolean provicional) {
        this.idEstadoDiente = idEstadoDiente;
        this.dienteSano = dienteSano;
        this.dienteAusente = dienteAusente;
        ExtraccionIndicada = extraccionIndicada;
        this.caries = caries;
        Fractura = fractura;
        Resina = resina;
        this.amalgama = amalgama;
        this.endodoncia = endodoncia;
        this.implante = implante;
        this.perno = perno;
        this.corona = corona;
        this.sellante = sellante;
        this.pontico = pontico;
        this.provicional = provicional;
        
    }

    //setters
    public void setIdEstadoDiente(Long idEstadoDiente) {
        this.idEstadoDiente = idEstadoDiente;
    }

    public void setDienteSano(Boolean dienteSano) {
        this.dienteSano = dienteSano;
    }

    public void setDienteAusente(Boolean dienteAusente) {
        this.dienteAusente = dienteAusente;
    }

    public void setExtraccionIndicada(Boolean extraccionIndicada) {
        ExtraccionIndicada = extraccionIndicada;
    }

    public void setCaries(Boolean caries) {
        this.caries = caries;
    }

    public void setFractura(Boolean fractura) {
        Fractura = fractura;
    }

    public void setResina(Boolean resina) {
        Resina = resina;
    }

    public void setAmalgama(Boolean amalgama) {
        this.amalgama = amalgama;
    }

    public void setEndodoncia(Boolean endodoncia) {
        this.endodoncia = endodoncia;
    }

    public void setImplante(Boolean implante) {
        this.implante = implante;
    }

    public void setPerno(Boolean perno) {
        this.perno = perno;
    }

    public void setCorona(Boolean corona) {
        this.corona = corona;
    }

    public void setSellante(Boolean sellante) {
        this.sellante = sellante;
    }

    public void setPontico(Boolean pontico) {
        this.pontico = pontico;
    }

    public void setProvicional(Boolean provicional) {
        this.provicional = provicional;
    }

    

    //getters
    public Long getIdEstadoDiente() {
        return idEstadoDiente;
    }

    public Boolean getDienteSano() {
        return dienteSano;
    }

    public Boolean getDienteAusente() {
        return dienteAusente;
    }

    public Boolean getExtraccionIndicada() {
        return ExtraccionIndicada;
    }

    public Boolean getCaries() {
        return caries;
    }

    public Boolean getFractura() {
        return Fractura;
    }

    public Boolean getResina() {
        return Resina;
    }

    public Boolean getAmalgama() {
        return amalgama;
    }

    public Boolean getEndodoncia() {
        return endodoncia;
    }

    public Boolean getImplante() {
        return implante;
    }

    public Boolean getPerno() {
        return perno;
    }

    public Boolean getCorona() {
        return corona;
    }

    public Boolean getSellante() {
        return sellante;
    }

    public Boolean getPontico() {
        return pontico;
    }

    public Boolean getProvicional() {
        return provicional;
    }

    @Override
    public String toString() {
        return "EstadoDiente [idEstadoDiente=" + idEstadoDiente + ", dienteSano=" + dienteSano + ", dienteAusente="
                + dienteAusente + ", ExtraccionIndicada=" + ExtraccionIndicada + ", caries=" + caries + ", Fractura="
                + Fractura + ", Resina=" + Resina + ", amalgama=" + amalgama + ", endodoncia=" + endodoncia
                + ", implante=" + implante + ", perno=" + perno + ", corona=" + corona + ", sellante=" + sellante
                + ", pontico=" + pontico + ", provicional=" + provicional + "]";
    }
    

    

    

}
