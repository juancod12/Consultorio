package com.zeus.dao;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Paciente {

    @Id
    @Column(length = 10)
    private int cedula;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private int edad;
    @Column
    private String foto;
    @Column
    private String telefono;
    @Column
    private String descripcion;
    
    
    public Paciente() {
    }

    

    public Paciente(int cedula, String nombre, String apellido, int edad,String telefono,String descripcion, String foto) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.foto = foto;
        this.telefono = telefono;
        this.descripcion = descripcion;
    }


    public String getDescripcion() {
        return descripcion;
    }



    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



    public String getTelefono() {
        return telefono;
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






    @Override
    public String toString() {
        return "Paciente [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
                + ", foto=" + foto + ", documento="  + "]";
    }
    
    
    

}
