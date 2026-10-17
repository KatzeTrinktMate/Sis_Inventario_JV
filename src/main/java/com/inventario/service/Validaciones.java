package com.inventario.service;
import java.math.BigDecimal;

public class Validaciones {

    //Validation if a number is negative
    public static boolean negativos(int num){
        return num < 0;
    }

    //Method to check if any text is empty or with only spaces
    public static boolean textoVacio(String texto){
        return texto == null || texto.isBlank();
    }

    
}
