package com.zeus.dao;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int cedula;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private int edad;
    @Column
    private String foto;
    @OneToOne
    @JoinColumn(name = "idDocumento")
    private Documento documento;
    @OneToOne
    @JoinColumn(name = "idAntecedente")
    private Antecedente antecedente;
    
    public Paciente() {
    }

    

    public Paciente(int cedula, String nombre, String apellido, int edad, String foto, Documento documento,
            Antecedente antecedente) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.foto = foto;
        this.documento = documento;
        this.antecedente = antecedente;
    }


    //setters
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }



    public void setFoto(String foto) {
        this.foto = foto;
    }



    public void setDocumento(Documento documento) {
        this.documento = documento;
    }



    public void setAntecedente(Antecedente antecedente) {
        this.antecedente = antecedente;
    }

    //getters

    public int getCedula() {
        return cedula;
    }



    public String getNombre() {
        return nombre;
    }



    public String getApellido() {
        return apellido;
    }



    public int getEdad() {
        return edad;
    }



    public String getFoto() {
        return foto;
    }



    public Documento getDocumento() {
        return documento;
    }



    public Antecedente getAntecedente() {
        return antecedente;
    }



    @Override
    public String toString() {
        return "Paciente [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
                + ", foto=" + foto + ", documento=" + documento + ", antecedente=" + antecedente + "]";
    }
    
    
    

}
