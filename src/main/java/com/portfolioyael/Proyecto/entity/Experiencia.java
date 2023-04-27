package com.portfolioyael.Proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String puesto;    
    @Temporal(TemporalType.DATE)
    private String inicioyFin;
    private String imagen;
    private String descripcion;

    public Experiencia() {
    }

    public Experiencia(String nombre, String puesto, String inicioyFin, String imagen, String descripcion) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.inicioyFin = inicioyFin;
        this.imagen = imagen;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getInicioyFin() {
        return inicioyFin;
    }

    public void setInicioyFin(String inicioyFin) {
        this.inicioyFin = inicioyFin;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    } 
}
