package com.inventario.model;

import java.util.Map;

import util.Validaciones;

import java.util.HashMap;


public class Categoria {
    private int id;
    private String nombre;
    Map<Integer, String> catMap = new HashMap<>();

    public Categoria(int id, String nombre) {
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

    public void addCategory(){
        //por ahora estoy poniendo en el hasmap para despues poder buscar categorias, por ahora no los valido por que no se como :,c
        catMap.put(this.id, this.nombre);
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (Validaciones.negativos(id))
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
