package com.inventario.model;
import com.inventario.service.Validaciones;

import java.math.BigDecimal;
import java.util.Objects;

public class Libros {
    //Variables
    private String isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private BigDecimal precio;
    private int stock;
    private int stockMin;
    private Categorias categoria;
    private boolean activo;

    //Constructor
    public Libros(String isbn, String titulo, String autor, String editorial, BigDecimal precio, int stock, int stockMin, boolean activo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        setPrecio(precio);
        this.stock = stock;
        this.stockMin = stockMin;
        this.activo = activo;
    }

    //Methods
    @Override
    public String toString() {
        return "Productos{" +
                "id=" + isbn +
                ", nombre='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", categoria=" + categoria +
                '}';
    }


    public void mostrarInfo(){
        System.out.println("ISBN: " + isbn +
                " | Nombre: " + titulo +
                " | Autor: " + autor +
                " | Editorial: " + editorial +
                " | Precio: " + precio +
                " | Stock: " + stock +
                " | Min: "  + stockMin + " | \n");
    }

    //Getter and setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if(Validaciones.textoVacio(isbn)) throw new IllegalArgumentException("El isbn no puede estar vacio");
        this.isbn = isbn;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (Validaciones.textoVacio(titulo)) throw new IllegalArgumentException("El texto no puede estar vacio");
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (Validaciones.textoVacio(titulo)) throw new IllegalArgumentException("El autor no puede estar vacio");
        this.autor = autor;
        
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
       if(Validaciones.negativos(stockMin)) throw new IllegalArgumentException("No puede estar ser un numero negativo");
        this.stockMin = stockMin;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        if (!Validaciones.textoVacio(editorial)) throw new IllegalArgumentException("La editorial no puede estar vacio");
            this.editorial = editorial;
    }

    public BigDecimal getPrecio() {
        return this.precio;
    }

    public void setPrecio(BigDecimal precio) {
        Objects.requireNonNull(precio, "No puede ser nulo");
        if (precio.signum() < 0) throw new IllegalArgumentException("El precio no puede ser negativo");
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(Validaciones.negativos(stock)) throw new IllegalArgumentException ("No puede haber numeros negativos");
            this.stock = stock;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
