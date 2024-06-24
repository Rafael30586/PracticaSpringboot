package com.f_rafael.demo_intelliJ.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VideoJuego {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private int puntaje;

    public VideoJuego() {
    }

    public VideoJuego(Long id, String titulo, int puntaje) {
        this.id = id;
        this.titulo = titulo;
        this.puntaje = puntaje;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", puntaje=" + puntaje +
                '}';
    }
}
