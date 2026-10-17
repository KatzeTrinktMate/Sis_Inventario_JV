package com.inventario.model;

import com.inventario.service.Validaciones;

public class Categorias {
    private int id;
    private String nombre;

    public Categorias(int id, String nombre) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (Validaciones.textoVacio(nombre)) {this.nombre = nombre;}
        else{System.out.println("El texto no puede estar vacio o en blanco");}
    }
}
