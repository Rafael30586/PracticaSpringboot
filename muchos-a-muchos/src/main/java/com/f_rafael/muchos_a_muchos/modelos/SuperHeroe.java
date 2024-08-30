package com.f_rafael.muchos_a_muchos.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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
    @ManyToOne
    @JoinColumn(
            name = "tipo_personaje"
    )
    private TipoPersonaje tipoPersonaje;
    @Column(name = "super_poder")
    @ManyToMany
    @JoinTable(
            name = "heroe_superpoder",
            joinColumns = @JoinColumn(name = "heroe_id"),
            inverseJoinColumns = @JoinColumn(name = "super_poder_id")
    )
    private List<SuperPoder> superPoderes;

    @Override
    public String toString() {
        return "SuperHeroe{" +
                "id=" + id +
                ", nombreDePila='" + nombreDePila + '\'' +
                ", nombreComoHeroe='" + nombreComoHeroe + '\'' +
                ", tipoPersonaje=" + tipoPersonaje +
                ", superPoder=" + superPoderes +
                '}';
    }
}
