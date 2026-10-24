package com.inventario.app;

import com.inventario.model.Categoria;
import com.inventario.model.Libro;
import com.inventario.service.ColeccionCategorias;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        ColeccionCategorias coleccion = new ColeccionCategorias();

        try{
            Categoria cat1 = new Categoria(1L, "Narrativa");
            Categoria cat2 = new Categoria(2L, "Programacion");
            Categoria cat3 = new Categoria(3L, "Historia");

            //Add catergories to the coleccion
            coleccion.addCategory(cat1);
            coleccion.addCategory(cat2);
            coleccion.addCategory(cat3);

            //Add books
            Libro lib1 = new Libro("9789974001015", "El faro del sur", "L. Ferraro", "Ed. del Plata", new BigDecimal("690.0"), cat1, 8, 3, true );
            Libro lib2 = new Libro("9789974003057", "Aprender a programar ", "V. Núñez", "Costa Norte", new BigDecimal("1460.0"),cat2, 6,3, true);
            Libro lib3 = new Libro("9789974001011", "Aprender a programar ", "V. Núñez", "Costa Norte", new BigDecimal("1460.0"),cat3, 6,3, true);
            System.out.println(lib1.mostrarInfo() + lib2.mostrarInfo());

            //Show if the books are same or not
            if (lib1.equals(lib3)) {
                System.out.println("Son iguales");
            }else{
                System.out.println("no son iguales");}

            System.out.println("\nTodas las categorias ");
            coleccion.showCategories();


        }catch(IllegalArgumentException | NullPointerException e){
            System.out.println("Error en " + e.getMessage());
            System.out.println("Ingrese correctamente los datos");
        }finally{
            System.out.println("Programa finalizado :P");
        }
    }
}
