package com.todo.list.Models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column
    private String img;

    @NotNull
    @Column
    private String titulo;

    @NotNull
    @Column
    private int precio;

    @NotNull
    @Column
    private int cantidad;

    public Producto() {

    }

    public Producto(Long id, String img, String titulo, int precio, int cantidad) {
        this.id = id;
        this.img = img;
        this.titulo = titulo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}