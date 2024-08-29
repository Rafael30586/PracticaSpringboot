package com.f_rafael.muchos_a_muchos.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "super_poderes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SuperPoder { // Ejemplos: super fuerza, super velocidad, vuelo, etc

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true)
    private String nombre;
    private String descripcion;

    @Override
    public String toString() {
        return "SuperPoder{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
