/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app.entidad;

/**
 *
 * @author Moisés Saavedra
 */
public class Producto {
    private int id;
    private String descripcion;
    private Double precio;
    private Double stock;
    private boolean estado;
    
    public Producto(){
        
    }
    
    public Producto(String descripcion, Double precio, Double stock){
        this.id=id;
        this.descripcion=descripcion;
        this.precio=precio;
        this.stock=stock;
        this.estado=true;
    }
    
    public Producto(int id,String descripcion, Double precio, Double stock){
        this.id=id;
        this.descripcion=descripcion;
        this.precio=precio;
        this.stock=stock;
        this.estado=true;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
