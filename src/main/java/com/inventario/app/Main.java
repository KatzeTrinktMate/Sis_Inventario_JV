package com.inventario.app;

import com.inventario.model.Categoria;
import com.inventario.model.Libro;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){

        try{
            Libro lib1 = new Libro("9789974001015", "El faro del sur", "L. Ferraro", "Ed. del Plata", new BigDecimal("690.0"), new Categoria(1, "Narrativa") , 8, 3, true );
            Libro lib2 = new Libro("9789974003057", "Aprender a programar ", "V. Núñez", "Costa Norte", new BigDecimal("1460.0"), new Categoria(2, "Historia"), 6,3, true);
            lib1.mostrarInfo(); lib2.mostrarInfo();
        }catch(IllegalArgumentException | NullPointerException e){
            System.out.println("Error en " + e.getMessage());
            System.out.println("Ingrese correctamente los datos");
        }finally{
            System.out.println("Programa finalizado :P");
        }
        










    }
}
