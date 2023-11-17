package com.unicaes.TheBBQPlace.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "menu")
@Getter
@Setter
public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plato_id")
    private Integer menuId;

    @Column(name = "nombre_plato")
    private String nanem;

    @Column(name = "descripcion")
    private String description;

    @Column(name = "precio")
    private double price;

    @Column(name = "categoria_id")
    private Integer categoryId;

}
