/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productosdetecnologia;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class Producto {
    
    private String NombreProducto; 
    private double Precio; 
    private int NumeroReferencia; 
    private int CantidadDisponible; 
    private String  Categoria;

    public Producto(String NombreProducto, double Precio, int NumeroReferencia, int CantidadDisponible, String Categoria) {
        this.NombreProducto = NombreProducto;
        this.Precio = Precio;
        this.NumeroReferencia = NumeroReferencia;
        this.CantidadDisponible = CantidadDisponible;
        this.Categoria = Categoria;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getNumeroReferencia() {
        return NumeroReferencia;
    }

    public void setNumeroReferencia(int NumeroReferencia) {
        this.NumeroReferencia = NumeroReferencia;
    }

    public int getCantidadDisponible() {
        return CantidadDisponible;
    }

    public void setCantidadDisponible(int CantidadDisponible) {
        this.CantidadDisponible = CantidadDisponible;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    public void aumentarCantidad(int cantidad) {
        this.CantidadDisponible += cantidad;
    }

    public void disminuirCantidad(int cantidad) {
        if (this.CantidadDisponible >= cantidad) {
            this.CantidadDisponible -= cantidad;
        } else {
            System.out.println("No hay suficientes unidades para disminuir.");
        }
    }

    @Override
    public String toString() {
        return "Producto{" + "NombreProducto=" + NombreProducto + ", Precio=" + Precio + ", NumeroReferencia=" + NumeroReferencia + ", CantidadDisponible=" + CantidadDisponible + ", Categoria=" + Categoria + '}';
    }
    
    public class Categorias{ 
        private Map<Integer, Producto> Inventario  = new HashMap <Integer, Producto>(); 
        private Map<Integer, String> Categoria = new HashMap <Integer, String>();  
        
        public Categorias(){
            IniciarCategoria(); 
        }
    private void IniciarCategoria(){ 
         Categoria.put(1,"Computadores"); 
    private void Iniarcategoria(){
        Categoria.put(2, "Celulares");
    }
    
    }
          
    }
    
  
    
    
}
