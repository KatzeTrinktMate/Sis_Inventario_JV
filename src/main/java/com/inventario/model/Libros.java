package com.inventario.model;
import com.inventario.service.Validaciones;

import java.math.BigDecimal;
import java.util.Objects;

public class Libros {
    //Variables
    protected String isbn;
    protected String titulo;
    protected String autor;
    protected String editorial;
    protected BigDecimal precio;
    protected int stock;
    protected int stockMin;
    protected Categorias categoria;
    protected boolean activo;

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


    public String mostrarInfo(){
        return  "ISBN: " + isbn +
                " | Nombre: " + titulo +
                " | Autor: " + autor +
                " | Editorial: " + editorial +
                " | Precio: " + precio +
                " | Stock: " + stock +
                " | Min: "  + stockMin + " |";
    }

    //Getter and setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if(Validaciones.textoVacio(isbn)) this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (Validaciones.textoVacio(titulo)){
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (Validaciones.textoVacio(autor)){
            this.autor = autor;
        }
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
       if(Validaciones.negativos(stockMin)) this.stockMin = stockMin;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        if (Validaciones.textoVacio(editorial)) this.editorial = editorial;
    }

    public BigDecimal getPrecio() {
        return this.precio;
    }

    //How to the precio is a BigDecimal (a class and used to object).
    public void setPrecio(BigDecimal precio) {
        Objects.requireNonNull(precio, "No puede ser nulo");
        if (precio.signum() < 0) throw new IllegalArgumentException("El precio no puede ser negativo");
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(Validaciones.negativos(stock)) this.stock = stock;
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
