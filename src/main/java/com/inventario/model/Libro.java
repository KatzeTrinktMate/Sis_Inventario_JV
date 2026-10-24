package com.inventario.model;

import java.math.BigDecimal;
import java.util.Objects;

import util.Validaciones;

public class Libro {
    // Variables
    private String isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private BigDecimal precio;
    private int stock;
    private int stockMin;
    private Categoria categoria;
    private boolean activo;

    // Constructor
    public Libro(String isbn, String titulo, String autor, String editorial, BigDecimal precio, Categoria categoria, int stock, int stockMin,
            boolean activo) {
        try {
            setIsbn(isbn);
            setTitulo(titulo);
            setAutor(autor);
            setEditorial(editorial);
            setPrecio(precio);
            setStock(stock);
            setStockMin(stockMin);
            setCategoria(categoria);
            setActivo(activo);
        } catch (Exception e) {
            System.out.println("Hubo un error " + e);
            System.out.println("Todos los campos deben estar completos");
        }

    }

    // Methods
    @Override
    public String toString() {
        return "Productos{" +
                "isnb=" + isbn +
                ", titulo='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", Editorial='" + editorial + '\'' +
                ", precio=" + precio +
                ", StockMin='" + stockMin + '\'' +
                ", stock=" + stock +
                ", categoria=" + categoria +
                ", activo='" + activo + '\'' +
                '}';
    }

    public String mostrarInfo() {
        return "ISBN: " + isbn +
                " | Nombre: " + titulo +
                " | Autor: " + autor +
                " | Editorial: " + editorial +
                " | Categoria: " + categoria +
                " | Precio: " + precio +
                " | Stock: " + stock +
                " | Min: " + stockMin + " | \n";
    }

    //Equals y Hashcode
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    // Getter and setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (Validaciones.textoVacio(isbn))
            throw new IllegalArgumentException("El isbn no puede estar vacio");
        this.isbn = isbn;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (Validaciones.textoVacio(titulo))
            throw new IllegalArgumentException("El texto no puede estar vacio");
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (Validaciones.textoVacio(autor))
            throw new IllegalArgumentException("El autor no puede estar vacio");
        this.autor = autor;

    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        if (Validaciones.negativos(stockMin))
            throw new IllegalArgumentException("No puede estar ser un numero negativo");
        this.stockMin = stockMin;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        if (Validaciones.textoVacio(editorial))
            throw new IllegalArgumentException("La editorial no puede estar vacio");
        this.editorial = editorial;
    }

    public BigDecimal getPrecio() {
        return this.precio;
    }

    public void setPrecio(BigDecimal precio) {
        Objects.requireNonNull(precio, "No puede ser nulo");
        if (precio.signum() < 0)
            throw new IllegalArgumentException("El precio no puede ser negativo");
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (Validaciones.negativos(stock))
            throw new IllegalArgumentException("No puede haber numeros negativos");
        this.stock = stock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
