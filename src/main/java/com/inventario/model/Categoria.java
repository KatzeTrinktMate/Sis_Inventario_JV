package com.inventario.model;

import java.util.*;

import util.Validaciones;


public class Categoria {
    private Long id;
    private String nombre;



    public Categoria(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Categorias{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';

    }

    //Equals y Hashcode
    public boolean equals(Object c){
        if (this == c) return true;
        if (c == null || getClass() != c.getClass()) return false;
        Categoria cat = (Categoria) c;
        return Objects.equals(id, cat.id);
    }
    public int hashCode(){
        return Objects.hash(id);
    }

    //Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        if (Validaciones.negativos(Math.toIntExact(id)))
            throw new IllegalArgumentException("El ID no puede ser negativo");
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (Validaciones.textoVacio(nombre))
            throw new IllegalArgumentException("El texto no puede estar vacio o en blanco");
        this.nombre = nombre;
    }
}
