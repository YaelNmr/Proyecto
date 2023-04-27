package com.portfolioyael.Proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String titulo;
    private String profileImage;
    private String subtitulo;
    @Lob
    private String acercadeMi;

    public Persona() {
    }

    public Persona(String nombre, String titulo, String profileImage, String subtitulo, String acercadeMi) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.profileImage = profileImage;
        this.subtitulo = subtitulo;
        this.acercadeMi = acercadeMi;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getAcercadeMi() {
        return acercadeMi;
    }

    public void setAcercadeMi(String acercadeMi) {
        this.acercadeMi = acercadeMi;
    }
   
}
