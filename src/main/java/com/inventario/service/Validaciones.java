package com.inventario.service;

import java.math.BigDecimal;

public class Validaciones {

    public static boolean negativos(int num){
        if (num>=0){
            return true;
        }else{
            return false;
        }
    }public static boolean negativos(double num){
        if (num>=0){
            return true;
        }else{
            return false;
        }
    }

    //Metodo para verificar si un texto (como un nombre) no sea vacio o tenga caracteres con espacios
    public static boolean textoVacio(String texto){
        if (texto.trim().isBlank()){
            return true;
        }else{
            return false;
        }

    }
}
