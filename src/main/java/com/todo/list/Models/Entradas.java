package com.todo.list.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Entradas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;

    @NotNull
    private Long prec1;

    @NotNull
    private Long prec2;

    @NotNull
    private Long prec3;

    @NotNull
    private Long prec4;

    @NotNull
    private Long prec5;

    @NotNull
    private Long prec6;

    public Entradas() {
    }

    public Entradas(Long id, Long prec1, Long prec2, Long prec3, Long prec4, Long prec5, Long prec6) {
        this.id = id;
        this.prec1 = prec1;
        this.prec2 = prec2;
        this.prec3 = prec3;
        this.prec4 = prec4;
        this.prec5 = prec5;
        this.prec6 = prec6;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrec1() {
        return prec1;
    }

    public void setPrec1(Long prec1) {
        this.prec1 = prec1;
    }

    public Long getPrec2() {
        return prec2;
    }

    public void setPrec2(Long prec2) {
        this.prec2 = prec2;
    }

    public Long getPrec3() {
        return prec3;
    }

    public void setPrec3(Long prec3) {
        this.prec3 = prec3;
    }

    public Long getPrec4() {
        return prec4;
    }

    public void setPrec4(Long prec4) {
        this.prec4 = prec4;
    }

    public Long getPrec5() {
        return prec5;
    }

    public void setPrec5(Long prec5) {
        this.prec5 = prec5;
    }

    public Long getPrec6() {
        return prec6;
    }

    public void setPrec6(Long prec6) {
        this.prec6 = prec6;
    }
}
