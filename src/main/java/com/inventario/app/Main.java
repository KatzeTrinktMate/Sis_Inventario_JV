package com.inventario.app;

import com.inventario.model.Libros;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){

        Libros lib1 = new Libros("9789974001015", "El faro del sur", "L. Ferraro", "Ed. del Plata", new BigDecimal("690.0"), 8, 3, true );
        Libros lib2 = new Libros("9789974003057", "Aprender a programar ", "V. Núñez", "Costa Norte", new BigDecimal("1460.0"), 6,3, true);


        System.out.println(lib1.mostrarInfo() + "\n" + lib2.mostrarInfo());










    }
}
