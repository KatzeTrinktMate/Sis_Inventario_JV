package com.inventario.service;

import java.math.BigDecimal;

public class Validaciones {

    //Validation if a number is negative
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

    //Method to check if the any text is empty or with only spaces
    public static boolean textoVacio(String texto){
        if (texto.trim().isBlank()){
            return true;
        }else{
            return false;
        }
    }

    //Method to check if the stock is less than stockMin
    public String alertStockLess(int stock, int min){
        String text = null;
        if ((stock + 10) < min) text = "Te estas quedando sin stock";
        if (stock == min) text = "Tienes el minimo del libro en stock";
        if (stock < min) text = "Debes de reponer por que te estas quedando sin libros (0o0)'";
        return text;
    }
}
