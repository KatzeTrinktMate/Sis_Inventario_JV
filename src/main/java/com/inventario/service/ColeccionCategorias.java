package com.inventario.service;

import com.inventario.model.Categoria;

import java.util.HashSet;
import java.util.Set;

public class ColeccionCategorias {
    //Esto es para almacenar categorias, esto es que aun no esta la base de datos.
    private final Set<Categoria> catSet = new HashSet<>();

    public void addCategory(Categoria nuevaCategoria){
        //por ahora estoy poniendo en el hasmap para despues poder buscar categorias, por ahora no los valido por que no se como :,c
        //primero se debe de validar si la categoria existe o no pero eso mas tarde
        if (!this.catSet.add(nuevaCategoria)) throw new IllegalArgumentException("Esa Categoria ya existe");
    }
    public int categorySize(){
        return this.catSet.size();
    }
    public void showCategories(){
        for(Categoria c : catSet){
            System.out.println(c);
        }
    }

}
