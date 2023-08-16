package com.todo.list.Models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;
    @Column
    @NotNull
    private Long precio;

    @Column
    @NotNull
    private String plato;

    @Column
    @NotNull
    private Long precio2;

    public Producto() {
    }

    public Producto(Long id, String plato, Long precio, Long precio2) {
        this.id = id;
        this.plato = plato;
        this.precio = precio;
        this.precio2 = precio2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public Long getPrecio2() {
        return precio2;
    }

    public void setPrecio2(Long precio2) {
        this.precio2 = precio2;
    }
}