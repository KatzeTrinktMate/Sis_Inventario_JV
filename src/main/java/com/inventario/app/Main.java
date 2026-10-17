package com.inventario.app;

import com.inventario.model.Libros;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){

        try{
            Libros lib1 = new Libros("9789974001015", "El faro del sur", "L. Ferraro", "Ed. del Plata", new BigDecimal("690.0"), 8, 3, true );
            Libros lib2 = new Libros("9789974003057", "Aprender a programar ", "V. Núñez", "Costa Norte", new BigDecimal("1460.0"), 6,3, true);
            lib1.mostrarInfo(); lib2.mostrarInfo();
        }catch(IllegalArgumentException e){
            System.out.println("Error en " + e);
            System.out.println("Ingrese correctamente los datos");
        }finally{
            System.out.println("Programa finalizado :P");
        }
        










    }
}
