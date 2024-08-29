package com.f_rafael.muchos_a_muchos.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipos_super_heroe")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TipoPersonaje { //Ejemplos: kriptoniano, linterna verde, velocista, etc

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true)
    private String nombre;

    @Override
    public String toString() {
        return "TipoPersonaje{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
