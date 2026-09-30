package com.inventario.model;
import com.inventario.service.Validaciones;

public abstract class Productos {
    //Variables
    protected int id;
    protected String nombre;
    protected double precio;
    protected int stock;
    protected Categorias categoria;

    //Constructor
    public Productos(int id, String nombre, double precio, int stock, Categorias categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    //Métodos
    @Override
    public String toString() {
        return "Productos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", categoria=" + categoria +
                '}';
    }


    public String mostrarInfo(){
        return  "ID" + id +
                "Nombre:" + nombre +
                "Precio:" + precio +
                "Stock:" + stock;
    }



    //Getter y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        }else{
            System.out.printf("No se puede poner caracteres vacios");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (Validaciones.negativos(precio)){
            this.precio = precio;
        }else{
            System.out.println("No se puede ingresar numeros negativos");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (Validaciones.negativos(stock)){
            this.stock = stock;
        }else{
            System.out.println("No se puede ingresar numeros negativos");
        }
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
}
