package com.f_rafael.muchos_a_muchos.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "heroes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SuperHeroe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nombre_de_pila")
    private String nombreDePila;
    @Column(name = "nombre_como_heroe")
    private String nombreComoHeroe;
    @Column(name = "tipo_personaje")
    @ManyToOne
    private TipoPersonaje tipoPersonaje;
    @Column(name = "super_poder")
    @ManyToMany
    private SuperPoder superPoder;

    @Override
    public String toString() {
        return "SuperHeroe{" +
                "id=" + id +
                ", nombreDePila='" + nombreDePila + '\'' +
                ", nombreComoHeroe='" + nombreComoHeroe + '\'' +
                ", tipoPersonaje=" + tipoPersonaje +
                ", superPoder=" + superPoder +
                '}';
    }
}
